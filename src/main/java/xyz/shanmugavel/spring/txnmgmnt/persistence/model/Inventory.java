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

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Entity
public class Inventory extends BaseEntity {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Product product;
	@Column(name="AVAILABLE_COUNT", nullable=false)
	private Long availableCnt;
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
	public Long getAvailableCnt() {
		return availableCnt;
	}
	public void setAvailableCnt(Long availableCnt) {
		this.availableCnt = availableCnt;
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
		builder.append("Inventory [id=");
		builder.append(id);
		builder.append(", productId=");
		builder.append(product);
		builder.append(", availableCnt=");
		builder.append(availableCnt);
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
