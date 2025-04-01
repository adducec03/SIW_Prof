package it.uniroma3.siw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.uniroma3.siw.siw_jpa_02.model.Address;
import it.uniroma3.siw.siw_jpa_02.model.Customer;
import it.uniroma3.siw.siw_jpa_02.repository.AddressRepository;
import it.uniroma3.siw.siw_jpa_02.repository.CustomerRepository;
import jakarta.transaction.Transactional;

@SpringBootApplication
public class SiwJpa02Application implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(SiwJpa02Application.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		Address address = new Address();
		address.setStreet("vicolo corto");
		address.setCity("Roma");
		address.setZipcode("10101");
		address.setCountry("Italia");
		customer.setFirstName("ciao");
		customer.setLastName("ciaociao");
		
		customer.setAddress(address);
		System.out.println(customer.toString());
		addressRepository.save(address);
		customerRepository.save(customer);

		System.out.println(customer.toString());
	}

}
