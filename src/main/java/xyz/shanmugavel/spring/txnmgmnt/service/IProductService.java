/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Product;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface IProductService extends IBaseService<Product>{

	Product add(Product entity);
	Product update(Product entity);
	Product findByName(String name);
}
