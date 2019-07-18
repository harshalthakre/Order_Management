package org.seligent.order.managment.repository;

import org.seligent.order.managment.bean.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends UserBaseRepository<Customer> {

}
