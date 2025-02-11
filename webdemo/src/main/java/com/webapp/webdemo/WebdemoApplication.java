package com.webapp.webdemo;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.catalina.Context;

@SpringBootApplication
public class WebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
		Tomcat tomcat=new Tomcat();
		try {
			tomcat.start();
			tomcat.getServer().await();
			Context context=tomcat.addContext("", null);
			Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
			context.addServletMappingDecoded("/hello", "HelloServlet");

		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
