package de.olexiy.spring.msscbrewery.web.mappers;

import de.olexiy.spring.msscbrewery.domain.Beer;
import de.olexiy.spring.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
  BeerDto beerToBeerDTO(Beer beer);

  Beer beerDTOToBeer(BeerDto beerDTO);
}
