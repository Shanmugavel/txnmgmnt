/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public interface IBaseService<T> {
	
	T findById(Long id);
	
}
