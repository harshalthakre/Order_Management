package org.seligent.order.managment.services;

import org.seligent.order.managment.bean.Producer;
import org.seligent.order.managment.repository.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private ProducerRepository producerRepository;

    public String addProducer(){
        try {
            producerRepository.save(new Producer(2,"priya","gaikwad","p123"));
            return "success";
        }catch (Exception e){
                return "Failure";
        }
    }
}
