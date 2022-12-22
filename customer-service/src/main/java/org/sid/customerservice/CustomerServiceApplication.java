package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication
public class CustomerServiceApplication   {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository  ){
		return  args -> {
			customerRepository.save(new Customer(null,"Hamza","hamzasiraje3@gmail.com"));
			customerRepository.save(new Customer(null,"Amine","amine@gmail.com"));
			customerRepository.save(new Customer(null,"Aymen","aymen@gmail.com"));
			customerRepository.save(new Customer(null,"test2","test2@gmail.com"));
			customerRepository.save(new Customer(null,"test","test@gmail.com"));
			customerRepository.findAll().forEach(customer -> {
				System.out.println(customer.toString());
			});
		};
	}

}
