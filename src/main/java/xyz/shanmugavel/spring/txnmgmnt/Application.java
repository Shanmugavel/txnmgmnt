/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import xyz.shanmugavel.spring.txnmgmnt.persistence.PersistenceConfig;
import xyz.shanmugavel.spring.txnmgmnt.service.ServiceConfig;
import xyz.shanmugavel.spring.txnmgmnt.web.WebConfig;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@SpringBootApplication
@Import({WebConfig.class, ServiceConfig.class, PersistenceConfig.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
