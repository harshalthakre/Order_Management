package org.seligent.order.managment.controller;

import org.seligent.order.managment.bean.Product;
import org.seligent.order.managment.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @RequestMapping(method = RequestMethod.POST,value = "api/product")
    public String addProduct(@RequestBody Product product){
        return productServices.addProduct(product);
    }
}
