package org.seligent.order.managment.controller;

import org.seligent.order.managment.bean.Producer;
import org.seligent.order.managment.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @RequestMapping(method = RequestMethod.GET,value = "/producer")
    public ResponseEntity<Void> addProducer(Producer producer){
        return producerService.addProducer(producer);
    }
}
