package de.olexiy.spring.msscbrewery.services.impl;

import de.olexiy.spring.msscbrewery.services.BeerService;
import de.olexiy.spring.msscbrewery.web.model.BeerDTO;
import de.olexiy.spring.msscbrewery.web.model.BeerStyleEnum;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Olexiy Sokurenko <ol.sakura@gmail.com>
 * Date: 15.07.2020
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(beerId).beerName("Duff").beerStyle(BeerStyleEnum.IPA).upc(1454324L).build();
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDto) {
        return BeerDTO.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDto) {
        /* TODO : implement later */
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer ....");
    }


}
