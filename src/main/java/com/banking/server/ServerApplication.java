package com.banking.server;

import com.banking.server.handlers.AdminServiceHandler;
import com.banking.server.handlers.AuthHandler;
import com.banking.server.handlers.CustomerServiceHandler;
import com.banking.server.handlers.ManagerServiceHandler;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Autowired
	private ApplicationContext applicationContext;

	@Bean
	public ServletRegistrationBean authServletRegistrationBean() {
		TProcessor processor =
				new TAuthService.Processor<AuthHandler>(applicationContext.getBean(AuthHandler.class));
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		Servlet authServlet = new TServlet(processor, protoFactory);
		ServletRegistrationBean s = new ServletRegistrationBean(authServlet, "/banking/auth/*");
		s.setName("authServletRegistrationBean");
		return s;
	}

	@Bean
	public ServletRegistrationBean customerServletRegistrationBean() {
		TProcessor processor =
				new TCustomerService.Processor<CustomerServiceHandler>(applicationContext.getBean(CustomerServiceHandler.class));
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		Servlet customerServlet = new TServlet(processor, protoFactory);
		ServletRegistrationBean s = new ServletRegistrationBean(customerServlet, "/banking/customer/*");
		s.setName("customerServletRegistrationBean");
		return s;
	}

	@Bean
	public ServletRegistrationBean managerServletRegistrationBean() {
		TProcessor processor =
				new TManagerService.Processor<ManagerServiceHandler>(applicationContext.getBean(ManagerServiceHandler.class));
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		Servlet managerServlet = new TServlet(processor, protoFactory);
		ServletRegistrationBean s = new ServletRegistrationBean(managerServlet, "/banking/manager/*");
		s.setName("managerServletRegistrationBean");
		return s;
	}
	@Bean
	public ServletRegistrationBean adminServletRegistrationBean() {
		TProcessor processor =
				new TAdminService.Processor<AdminServiceHandler>(applicationContext.getBean(AdminServiceHandler.class));
		TProtocolFactory protoFactory = new TJSONProtocol.Factory();
		Servlet adminServlet = new TServlet(processor, protoFactory);
		ServletRegistrationBean s = new  ServletRegistrationBean(adminServlet, "/banking/admin/*");
		s.setName("adminServletRegistrationBean");
		return s;
	}
}
