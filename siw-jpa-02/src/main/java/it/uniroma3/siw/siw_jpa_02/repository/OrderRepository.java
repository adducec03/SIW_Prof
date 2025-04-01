package it.uniroma3.siw.siw_jpa_02.repository;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.siw_jpa_02.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
