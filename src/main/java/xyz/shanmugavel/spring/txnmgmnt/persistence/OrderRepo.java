/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence;


import org.springframework.data.repository.CrudRepository;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Order;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface OrderRepo extends CrudRepository<Order, Long> {

}
