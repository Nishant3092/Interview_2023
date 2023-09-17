package dev.simplesolution.usingdozer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.dozermapper.core.Mapper;

import dev.simplesolution.usingdozer.model.DestinationContact;
import dev.simplesolution.usingdozer.model.SourceContact;

@SpringBootApplication
public class UsingDozerSpringBootStarterApplication implements CommandLineRunner {

@Autowired	
private Mapper mapper ;
	
	private static Logger logger = LoggerFactory.getLogger(UsingDozerSpringBootStarterApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(UsingDozerSpringBootStarterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Dozer Application Started .......");
		
		SourceContact sourceContact = new SourceContact();
		sourceContact.setId(30);
		sourceContact.setName("Nishant");
		sourceContact.setPhone("9582702520");
		sourceContact.setEmail("nishant.acool91@gmail.com");
		sourceContact.setAddress("India,MP,Gwalior city");
		
		DestinationContact destinationContact = new DestinationContact();
		
		// Map source object to destination object 
		mapper.map(sourceContact, destinationContact);
		
		// Logging destination object data 
		logger.info(destinationContact.getIdentity().toString());
		logger.info(destinationContact.getFullName());
		logger.info(destinationContact.getPhoneNumber());
		logger.info(destinationContact.getEmailAddress());
		logger.info(destinationContact.getAddressLine());
	
	}

}
