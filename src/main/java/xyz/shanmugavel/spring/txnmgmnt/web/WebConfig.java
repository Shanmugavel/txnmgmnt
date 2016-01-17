/**
 * 
 */
package xyz.shanmugavel.spring.txnmgmnt.web;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shanmugavelsundaramoorthy
 *
 */
@Configuration
@ComponentScan({ "xyz.shanmugavel.spring.txnmgmnt.web", "xyz.shanmugavel.spring.txnmgmnt.startup" })
public class WebConfig {

	@Bean
	ServletRegistrationBean h2ServletRegistration() {
		ServletRegistrationBean h2Servlet = new ServletRegistrationBean(new WebServlet());
		h2Servlet.addUrlMappings("/console/*");
		return h2Servlet;
	}
}
