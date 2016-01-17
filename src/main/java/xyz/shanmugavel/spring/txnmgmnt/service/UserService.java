/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.shanmugavel.spring.txnmgmnt.persistence.UserRepo;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.User;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	@Transactional(readOnly = true)
	public User findById(Long id) {
		return userRepo.findOne(id);
	}

	@Override
	public User add(User entity) {
		return userRepo.save(entity);
	}

	@Override
	public User update(User entity) {
		return userRepo.save(entity);
	}

}
