package de.olexiy.spring.msscbrewery.web.services.impl;

import de.olexiy.spring.msscbrewery.web.model.BeerDto;
import de.olexiy.spring.msscbrewery.web.services.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Olexiy Sokurenko <ol.sakura@gmail.com>
 * Date: 15.07.2020
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId).beerName("Duff").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        /* TODO : implement later */
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer ....");
    }


}
