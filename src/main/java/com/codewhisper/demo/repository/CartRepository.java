
//create springboot JPA repository for the Cart entity

package com.codewhisper.demo.repository;

import com.codewhisper.demo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Add missing imports

// Create SpringBoot CartRepository JAP repository with findByUsername and findByUsernameAndProductid
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    Cart findByUsernameAndProductid(String username, int productid);
    List<Cart> findByUsername(String username);

}