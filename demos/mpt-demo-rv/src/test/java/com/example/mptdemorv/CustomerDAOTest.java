package com.example.mptdemorv;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.mptdemorv.dao.CustomerDAO;
import com.example.mptdemorv.dto.Customer;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MptDemoRvApplication.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@EnableConfigurationProperties()
//@ContextConfiguration(classes={PersistenceContext.class})
@DataJpaTest
public class CustomerDAOTest {

	@Autowired
	public CustomerDAO daoRef;
	
	
	@Test
	public void testFindAll(){
		
		System.out.println("entered into findAll()");
		List<Customer> customers = daoRef.findAll();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Farhan");
		customer.setLastName("Akhtar");
		
		Assert.assertTrue(customers.contains(customer));
		
	}
	
	
	
	
/*	@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
}
