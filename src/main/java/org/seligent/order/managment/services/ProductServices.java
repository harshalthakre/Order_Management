package org.seligent.order.managment.services;

import org.seligent.order.managment.bean.Product;
import org.seligent.order.managment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public String addProduct(Product product){
        try{
            productRepository.save(product);
            return "success";
        }catch (Exception e){
            return "failure";
        }
    }

}
