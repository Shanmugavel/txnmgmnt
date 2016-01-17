/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.shanmugavel.spring.txnmgmnt.persistence.ProductRepo;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Product;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Override
	@Transactional(readOnly = true)
	public Product findById(Long id) {
		return productRepo.findOne(id);
	}

	@Override
	public Product add(Product entity) {
		return productRepo.save(entity);
	}

	@Override
	public Product update(Product entity) {
		return productRepo.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public Product findByName(String name) {
		return productRepo.findByName(name);
	}

}
