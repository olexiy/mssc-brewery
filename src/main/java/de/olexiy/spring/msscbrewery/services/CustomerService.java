package de.olexiy.spring.msscbrewery.services;

import de.olexiy.spring.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {
  CustomerDto getCustomerById(UUID customerId);

  CustomerDto saveNewCustomer(CustomerDto customerDto);

  void updateCustomer(UUID customerId, CustomerDto customerDto);

  void deleteById(UUID customerId);
}
