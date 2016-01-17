/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Order;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface IOrderService extends IBaseService<Order> {

	Order create(Order entity);
	
}
