package de.olexiy.spring.msscbrewery.web.mappers;

import de.olexiy.spring.msscbrewery.domain.Beer;
import de.olexiy.spring.msscbrewery.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
  BeerDTO beerToBeerDTO(Beer beer);

  Beer beerDTOToBeer(BeerDTO beerDTO);
}
