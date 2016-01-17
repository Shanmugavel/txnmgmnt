/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.shanmugavel.spring.txnmgmnt.persistence.InventoryRepo;
import xyz.shanmugavel.spring.txnmgmnt.persistence.OrderRepo;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Inventory;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Order;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Service
public class OrderService implements IOrderService {

	@Autowired
	private OrderRepo orderRepo;
	@Autowired
	private InventoryRepo inventoryRepo;

	@Override
	@Transactional(readOnly = true)
	public Order findById(Long id) {
		return orderRepo.findOne(id);
	}

	@Override
	@Transactional
	public Order create(Order entity) {
		Inventory invt = inventoryRepo.findByProductId(entity.getProduct().getId());
		Long newAvlCount = 0L;
		if (null != invt) {//Check if product exists
			if(invt.getAvailableCnt() >= entity.getCount()) {//check if we have required quantity
				newAvlCount = invt.getAvailableCnt() - entity.getCount();
				invt.setAvailableCnt(newAvlCount);
				invt = inventoryRepo.save(invt);//Reduce inventory count
				entity = orderRepo.save(entity);//Capture the order
			}
		}
		return entity;
	}

}
