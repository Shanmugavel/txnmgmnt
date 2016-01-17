/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

import xyz.shanmugavel.spring.txnmgmnt.persistence.model.User;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface IUserService extends IBaseService<User> {

	User add(User entity);
	User update(User entity);
}
