package de.olexiy.spring.msscbrewery.services;

import de.olexiy.spring.msscbrewery.web.model.BeerDto;
import java.util.UUID;

/**
 * @author Olexiy Sokurenko <ol.sakura@gmail.com>
 * Date: 15.07.2020
 */
public interface BeerService {
  BeerDto getBeerById(UUID beerId);

  BeerDto saveNewBeer(BeerDto beerDto);

  void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
