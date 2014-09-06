package com.biz.dao;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.biz.domain.Product;

/**
 * Small MongoDB application that uses spring data to interact with MongoDB.
 */
@Component
public class MongoDBApp {
	static final Logger logger = LoggerFactory.getLogger(MongoDBApp.class);
	@Autowired
	MongoRepository productRepository;
	
	@PostConstruct
	public void init(){
		System.out.println("productRepository");
		productRepository.dropCollection();
		productRepository.createCollection();
		Product p = null;
		for (int i = 0; i < 20; i++) {
			p = new Product();
			p.setProductId("P"+i);
			productRepository.saveObject(p);
		}
	}

	public static void main(String[] args) {
		logger.info("Bootstrapping MongoDemo application");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
//		ProductRepository productRepository = context
//				.getBean(ProductRepository.class);
//
//		// cleanup person collection before insertion
//		productRepository.dropCollection();
//		// create person collection<br />
//		productRepository.createCollection();
//		Product p = null;
//		for (int i = 0; i < 20; i++) {
//			p = new Product();
//			p.setProductId("P"+i);
//			productRepository.saveObject(p);
//		}
//		//personRepository.logAllPersons();
//		logger.info("Finished MongoDemo application");
	}
}
