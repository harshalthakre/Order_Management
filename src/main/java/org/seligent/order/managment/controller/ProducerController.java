package org.seligent.order.managment.controller;

import org.seligent.order.managment.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @RequestMapping(method = RequestMethod.POST,value = "/producer")
    public String addProducer(){
        return producerService.addProducer();
    }
}
