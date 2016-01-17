/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.startup;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import xyz.shanmugavel.spring.txnmgmnt.InventoryStatus;
import xyz.shanmugavel.spring.txnmgmnt.OrderStatus;
import xyz.shanmugavel.spring.txnmgmnt.ProductStatus;
import xyz.shanmugavel.spring.txnmgmnt.UserStatus;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Inventory;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Order;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.Product;
import xyz.shanmugavel.spring.txnmgmnt.persistence.model.User;
import xyz.shanmugavel.spring.txnmgmnt.service.IInventoryService;
import xyz.shanmugavel.spring.txnmgmnt.service.IOrderService;
import xyz.shanmugavel.spring.txnmgmnt.service.IProductService;
import xyz.shanmugavel.spring.txnmgmnt.service.IUserService;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Component
@Slf4j
public class DBInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private IUserService userSvc;
	@Autowired
	private IProductService productSvc;
	@Autowired
	private IInventoryService inventorySvc;
	@Autowired
	private IOrderService orderSvc;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		//Initialize Users
		User bob = new User("Bob", "Thompson" , UserStatus.ACTIVE.getValue());
		bob.setCreateDate(LocalDate.now());
		User john = new User("John", "Doe" , UserStatus.ACTIVE.getValue());
		john.setCreateDate(LocalDate.now());
		userSvc.add(bob);
		userSvc.add(john);
		log.info("Loaded Users!!");
		
		//Initialize Products
		Product product  = new Product("XYZ", "Description......", ProductStatus.ACTIVE.getValue());
		product.setCreateDate(LocalDate.now());
		productSvc.add(product);
		log.info("Loaded Products!!");
		
		//Load Inventory
		Inventory invt  = new Inventory();
		invt.setAvailableCnt(1000L);
		invt.setProduct(product);
		invt.setStatus(InventoryStatus.ACTIVE.getValue());
		invt.setCreateDate(LocalDate.now());
		inventorySvc.add(invt);
		log.info("Loaded Inventory!!");
		
		//Place Orders
		Order order = new Order();
		order.setProduct(product);
		order.setCount(1L);
		order.setStatus(OrderStatus.COMPLETE.getValue());
		order.setCreateDate(LocalDate.now());
		orderSvc.create(order);
		log.info("Placed Order!!");
	}

}
