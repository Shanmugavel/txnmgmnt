/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.persistence;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Configuration
@EntityScan(basePackages = {"xyz.shanmugavel.spring.txnmgmnt.persistence.model"})
@EnableJpaRepositories( basePackages = { "xyz.shanmugavel.spring.txnmgmnt.persistence" })
@EnableTransactionManagement
public class PersistenceConfig {

}
