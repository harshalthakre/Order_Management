package org.seligent.order.managment.bean;

import javax.persistence.Entity;

@Entity
public class Producer extends User {

    private String productNames;
    public Producer(){

    }
    public Producer(int id, String firstName, String lastName, String password) {
        super(id, firstName, lastName, password);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }
}
