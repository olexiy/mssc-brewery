package de.olexiy.spring.msscbrewery.web.mappers;

import de.olexiy.spring.msscbrewery.domain.Customer;
import de.olexiy.spring.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

  Customer customerDtoToCustomer(CustomerDto dto);

  CustomerDto customerToCustomerDto(Customer customer);
}
