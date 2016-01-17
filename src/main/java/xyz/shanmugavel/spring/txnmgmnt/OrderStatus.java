/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public enum OrderStatus {
	FAILED("FAILED"), COMPLETE("COMPLETE");
	
	String desc;
	
	private OrderStatus(String desc) {
		this.desc = desc;
	}
	
	public String getValue() {
		return desc;
	}
}
