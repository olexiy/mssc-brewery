package de.olexiy.spring.msscbrewery.repositories;

import de.olexiy.spring.msscbrewery.domain.Beer;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
