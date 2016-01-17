/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.shanmugavel.spring.txnmgmnt.persistence.InventoryRepo;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Inventory;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Service
public class InventoryService implements IInventoryService {

	@Autowired
	private InventoryRepo inventoryRepo;
	
	@Override
	@Transactional
	public Inventory add(Inventory entity) {
		Inventory invt = inventoryRepo.findByProductId(entity.getProduct().getId());
		Long latestAvlCount = entity.getAvailableCnt();
		if (null != invt) {
			latestAvlCount += invt.getAvailableCnt();
			invt.setAvailableCnt(latestAvlCount);
			entity = invt;
		} 
		return inventoryRepo.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public Inventory findById(Long id) {
		return inventoryRepo.findOne(id);
	}



}
