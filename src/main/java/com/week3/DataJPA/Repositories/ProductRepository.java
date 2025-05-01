package com.week3.DataJPA.Repositories;

import com.week3.DataJPA.entities.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByName(String name);

    List<ProductEntity> findByQuantityAndPrice(int quality, BigDecimal price);

    List<ProductEntity> findByQuantityGreaterThanAndPriceLessThan(int quantity, BigDecimal price);

    List<ProductEntity> findByNameLike(String like);

    List<ProductEntity> findByNameContaining(String contain); //same as like, but there we don't have to use "%" sign

    List<ProductEntity> findByNameContainingIgnoreCase(String name);

//    Optional<ProductEntity> findByNameAndPrice(String name, BigDecimal price);

    //custom query, this query is same as the above findByNameAndPrice() method
    @Query("select e from ProductEntity e where e.name=?1 and e.price=?2")
    Optional<ProductEntity> findByNameAndPrice(String name, BigDecimal price);

    //Sorting
    List<ProductEntity> findByOrderByPriceAsc();

    List<ProductEntity> findByOrderByPriceDesc();

    //Sorting - Using "Sort Class"
    List<ProductEntity> findBy(Sort sort);

    //Pagination
    List<ProductEntity> findAll();
}
