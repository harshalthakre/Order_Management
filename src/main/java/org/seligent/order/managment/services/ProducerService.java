package org.seligent.order.managment.services;

import org.seligent.order.managment.bean.Producer;
import org.seligent.order.managment.repository.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private ProducerRepository producerRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

    public ResponseEntity<Void> addProducer(Producer producer){
        try {
            if(!producerRepository.existsById(producer.getId())){
                producer.setPassword(bCryptPasswordEncoder.encode(producer.getPassword()));
                producerRepository.save(producer);
                return new ResponseEntity<Void>(HttpStatus.OK);}
            else {return new ResponseEntity<Void>(HttpStatus.ALREADY_REPORTED);}
        }catch (Exception e){
            return new ResponseEntity<Void>(HttpStatus.FORBIDDEN);
        }
    }
}
