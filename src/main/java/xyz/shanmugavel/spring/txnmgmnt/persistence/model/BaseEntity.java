/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="CREATE_DATE", nullable=false)
	LocalDate createDate;
	@Column(name="UDATE_DATE", nullable=true)
	LocalDate updateDate;
	
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
}
