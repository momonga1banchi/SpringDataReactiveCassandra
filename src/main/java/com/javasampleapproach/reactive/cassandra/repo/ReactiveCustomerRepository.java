package com.javasampleapproach.reactive.cassandra.repo;

import java.util.UUID;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.javasampleapproach.reactive.cassandra.model.Customer;

import reactor.core.publisher.Flux;

public interface ReactiveCustomerRepository extends ReactiveCrudRepository<Customer, UUID>{

	Flux<Customer> findByAge(int age);
}
