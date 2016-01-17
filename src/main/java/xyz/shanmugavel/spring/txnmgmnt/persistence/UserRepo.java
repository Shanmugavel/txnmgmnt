/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence;

import org.springframework.data.repository.CrudRepository;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.User;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface UserRepo extends CrudRepository<User, Long> {

}
