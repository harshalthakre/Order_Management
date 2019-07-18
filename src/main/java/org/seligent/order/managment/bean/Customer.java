package org.seligent.order.managment.bean;

import javax.persistence.Entity;

@Entity
public class Customer extends User{
    private int numberOfOrders;

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }
}
