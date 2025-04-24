package com.week3.DataJPA;

import com.week3.DataJPA.Repositories.ProductRepository;
import com.week3.DataJPA.entities.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class DataJpaApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	//creating some test-cases to test methods provided by JPA-Repositories.
	@Test
	void testRepository() {
		ProductEntity productEntity = ProductEntity.builder()
						.sku("Nestle123")
						.name("Nestle Chocolate")
				        .price(BigDecimal.valueOf(1200.00))
				        .quantity(10)
				        .build();
		ProductEntity saveProductEntity = productRepository.save(productEntity);
		System.out.println(saveProductEntity);
	}

	@Test
	void getRepository() {
//		List<ProductEntity> entities = productRepository.findAll();
//		System.out.println(entities);

//		List<ProductEntity> entities = productRepository.findByName("Laptop");
//		System.out.println(entities);

//		List<ProductEntity> entities = productRepository.findByQuantityAndPrice(10, BigDecimal.valueOf(1000));
//		System.out.println(entities);

//		List<ProductEntity> entities = productRepository.findByQuantityGreaterThanAndPriceLessThan(10, BigDecimal.valueOf(1000));
//		System.out.println(entities);

//		List<ProductEntity> entities = productRepository.findByNameLike("%am%"); //am - present anywhere in the name
//		System.out.println(entities);

//		List<ProductEntity> entities = productRepository.findByNameContaining("am"); //same as above, just we don't have to add "%" sign
//		System.out.println(entities);

//		List<ProductEntity> entities = productRepository.findByNameContainingIgnoreCase("LApt");
//		System.out.println(entities);

 		Optional<ProductEntity> entities = productRepository.findByNameAndPrice("Chair", BigDecimal.valueOf(1000)); //same as above, just we don't have to add "%" sign
		System.out.println(entities);
	}

}
