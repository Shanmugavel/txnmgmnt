/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Entity
@Table(name="ORDERS")
public class Order extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Product product;
	@Column(name="COUNT", nullable=false)
	private Long count;
	@Column(name="STATUS", nullable=false,length=25)
	private String status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
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
		builder.append("Order [id=");
		builder.append(id);
		builder.append(", product=");
		builder.append(product);
		builder.append(", count=");
		builder.append(count);
		builder.append(", status=");
		builder.append(status);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append("]");
		return builder.toString();
	}
	
}
