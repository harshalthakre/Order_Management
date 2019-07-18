package org.seligent.order.managment.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Dao
 * This class is to represent Product Data Model
 *
 * */
@Entity
public class Product {

    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
