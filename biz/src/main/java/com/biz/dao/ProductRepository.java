package com.biz.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.biz.domain.Product;
import com.mongodb.WriteResult;

@Repository
public class ProductRepository implements MongoRepository<Product> {

	@Autowired
	MongoTemplate mongoTemplate;

	public List<Product> getAllObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveObject(Product product) {
		mongoTemplate.insert(product);
	}

	public Product getObject(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public WriteResult updateObject(String id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteObject(String id) {
		// TODO Auto-generated method stub

	}

	/**
	 * Create a {@link Product} collection if the collection does not already
	 * exists
	 */
	public void createCollection() {
		if (!mongoTemplate.collectionExists(Product.class)) {
			mongoTemplate.createCollection(Product.class);
		}

	}

	/**
	 * Drops the {@link Product} collection if the collection does already
	 * exists
	 */
	public void dropCollection() {
		if (!mongoTemplate.collectionExists(Product.class)) {
			mongoTemplate.createCollection(Product.class);
		}

	}

}
