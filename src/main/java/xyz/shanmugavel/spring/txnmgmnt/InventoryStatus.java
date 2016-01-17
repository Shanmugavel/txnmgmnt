/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public enum InventoryStatus {
	ACTIVE("ACTIVE"), INACTIVE("ACTIVE");
	
	String desc;
	
	private InventoryStatus(String desc) {
		this.desc = desc;
	}
	
	public String getValue() {
		return desc;
	}
}
