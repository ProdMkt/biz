/**
 * Base Interface for all Mongo DB related operations.
 */
package com.biz.dao;

import java.util.List;

import com.mongodb.WriteResult;

/**
 * @author user
 *
 */

public interface MongoRepository<T> {

	public List<T> getAllObjects();

	public void saveObject(T object);

	public T getObject(String id);

	public WriteResult updateObject(String id, String name);

	public void deleteObject(String id);

	public void createCollection();

	public void dropCollection();
}
