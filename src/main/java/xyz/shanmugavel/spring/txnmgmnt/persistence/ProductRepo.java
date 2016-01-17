/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence;

import org.springframework.data.repository.CrudRepository;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Product;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface ProductRepo extends CrudRepository<Product, Long> {
	Product findByName(String name);
}
