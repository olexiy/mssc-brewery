package de.olexiy.spring.msscbrewery.web.services;

import de.olexiy.spring.msscbrewery.web.model.BeerDTO;
import java.util.UUID;

/**
 * @author Olexiy Sokurenko <ol.sakura@gmail.com>
 * Date: 15.07.2020
 */
public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    void updateBeer(UUID beerId, BeerDTO beerDto);

    void deleteById(UUID beerId);
}
