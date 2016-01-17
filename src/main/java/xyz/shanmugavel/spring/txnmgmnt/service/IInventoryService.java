/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Inventory;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface IInventoryService extends IBaseService<Inventory> {

	Inventory add(Inventory entity);

}
