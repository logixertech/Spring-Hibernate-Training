package com.marakana.contacts.servlets;

import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.marakana.contacts.entities.Address;
import com.marakana.contacts.repositories.AddressRepository;
import com.marakana.contacts.repositories.ContactRepository;


@WebListener
public class Setup implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// instantiate a Address Repository
		// init 
		// go nuts !		
		try {
			new AddressRepository().init();
			new ContactRepository().init();
		//	AddressRepository addressRepository = new AddressRepository();
		//	addressRepository.init();
		//	Address address = new Address("150 Pakistan", "Lahore","PK","5400");
		//	addressRepository.create(address);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
