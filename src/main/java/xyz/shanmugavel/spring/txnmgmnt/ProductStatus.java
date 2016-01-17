package xyz.shanmugavel.spring.txnmgmnt;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
public enum ProductStatus {
	ACTIVE("ACTIVE"), INACTIVE("ACTIVE");
	
	String desc;
	
	private ProductStatus(String desc) {
		this.desc = desc;
	}
	
	public String getValue() {
		return desc;
	}
}
