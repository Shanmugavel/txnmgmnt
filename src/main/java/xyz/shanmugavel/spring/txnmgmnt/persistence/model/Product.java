/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Entity
public class Product extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="NAME", nullable=false,length=25)
	private String name;
	@Column(name="DESCRIPTION", nullable=false,length=100)
	private String description;
	@Column(name="STATUS", nullable=false,length=25)
	private String status;
	
	public Product() {
	}
	
	
	public Product(String name, String description, String status) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [createDate=");
		builder.append(createDate);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append("]");
		return builder.toString();
	}
	
}
