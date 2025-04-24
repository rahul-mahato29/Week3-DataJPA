package com.week3.DataJPA.Repositories;

import com.week3.DataJPA.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByName(String name);

    List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

//    List<ProductEntity> findByQuantityAndPrice(int quality, BigDecimal price);
}
