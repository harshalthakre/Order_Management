package org.seligent.order.managment.repository;

import org.seligent.order.managment.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends UserBaseRepository<User> {
}
