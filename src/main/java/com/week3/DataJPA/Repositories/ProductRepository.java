package com.week3.DataJPA.Repositories;

import com.week3.DataJPA.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
