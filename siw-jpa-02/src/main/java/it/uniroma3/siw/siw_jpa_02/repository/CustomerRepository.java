package it.uniroma3.siw.siw_jpa_02.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.siw_jpa_02.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String firstName);
    public List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
    public List<Customer> findByDateOfBirth(LocalDate dateOfBirth);
    public List<Customer> findByDateOfBirthBefore(LocalDate dateOfBirth);
    public List<Customer> findByDateOfBirthAfter(LocalDate dateOfBirth);
    public List<Customer> findByFirstNameStartingWith(String string);
    public List<Customer> findByLastNameEndingWith(String string);
    public List<Customer> findByFirstNameContaining(String string);
    public List<Customer> findByFirstNameNotLike(String firstName);
    public List<Customer> findByFirstNameOrLastName(String name);
    public List<Customer> findAllByOrderByLastNameAsc();
    public long countByFirstName(String firstName);
    public long countByLastName(String lastName);
    public long countByFirstNameAndLastName(String firstName, String lastName);
    public long countByDateOfBirthBefore(LocalDate dateOfBirth);
    public long countByFirstNameStartingWith(String string);
    public long countByLastNameEndingWith(String string);
    public long countByFirstNameNotLike(String firstName);
}
