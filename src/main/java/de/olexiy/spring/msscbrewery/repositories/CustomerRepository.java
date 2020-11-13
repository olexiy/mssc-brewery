package de.olexiy.spring.msscbrewery.repositories;

import de.olexiy.spring.msscbrewery.domain.Customer;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID> {
}