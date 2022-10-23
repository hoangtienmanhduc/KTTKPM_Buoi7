package com.sumit.playjava.respository;

import com.sumit.playjava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reposiroty extends JpaRepository<User,String> {
   User findByUsername(String usename);
}
