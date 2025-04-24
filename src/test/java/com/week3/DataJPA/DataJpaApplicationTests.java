package com.week3.DataJPA;

import com.week3.DataJPA.Repositories.ProductRepository;
import com.week3.DataJPA.entities.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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

		List<ProductEntity> entities = productRepository.findByCreatedAtAfter(LocalDateTime.of(2025, 1, 1, 0, 0, 0));
		System.out.println(entities);

	}

}
