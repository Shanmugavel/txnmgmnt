/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence;

import org.springframework.data.repository.CrudRepository;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Inventory;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface InventoryRepo extends CrudRepository<Inventory, Long> {

	Inventory findByProductId(Long  productId);
	
}
