package com.eubssantos.myfirstproject.repositories;

import com.eubssantos.myfirstproject.category.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
