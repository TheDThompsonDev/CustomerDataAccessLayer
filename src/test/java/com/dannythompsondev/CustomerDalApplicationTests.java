package com.dannythompsondev;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dannythompsondev.entities.Customer;
import com.dannythompsondev.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDalApplicationTests {


		
		@Autowired
		private CustomerRepository customerRepository;
		
		@Test
		public void testCreateCustomer(){
			Customer customer = new Customer();
			customer.setName("Danny");
			customer.setEmail("danny@gmail.com");
			customerRepository.save(customer);
		}
		
		
		

}
