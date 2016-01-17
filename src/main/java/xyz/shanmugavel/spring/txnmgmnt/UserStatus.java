/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public enum UserStatus {
	ACTIVE("ACTIVE"), INACTIVE("ACTIVE");
	
	String desc;
	
	private UserStatus(String desc) {
		this.desc = desc;
	}
	
	public String getValue() {
		return desc;
	}
}
