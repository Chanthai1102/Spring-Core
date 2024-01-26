package org.spring_core.spring_core_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringCore2Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class, BeanConfig2.class);
		//GreetingApplication greetingApplication = context.getBean(GreetingApplication.class);
		//greetingApplication.greet();

		BeanConfig beanConfig = context.getBean(BeanConfig.class);
		//beanConfig.myString();
		//beanConfig.myString();

		List<Integer> score =  context.getBean(List.class);
		System.out.println(score);
	}

}
