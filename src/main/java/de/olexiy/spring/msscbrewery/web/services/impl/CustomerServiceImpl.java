package de.olexiy.spring.msscbrewery.web.services.impl;

import de.olexiy.spring.msscbrewery.web.model.CustomerDto;
import de.olexiy.spring.msscbrewery.web.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Olexiy Sokurenko <ol.sakura@gmail.com>
 * Date: 15.07.2020
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {


    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(customerId).name("Gomer").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Bill").build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        /* TODO : implement later */
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer ....");
    }
}
