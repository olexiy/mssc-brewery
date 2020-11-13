package de.olexiy.spring.msscbrewery.bootstrap;

import de.olexiy.spring.msscbrewery.domain.Beer;
import de.olexiy.spring.msscbrewery.repositories.BeerRepository;
import java.math.BigDecimal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeerLoader implements CommandLineRunner {

  private final BeerRepository beerRepository;

  public BeerLoader(BeerRepository beerRepository) {
    this.beerRepository = beerRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    loadBeer();
  }

  private void loadBeer() {
    if (beerRepository.count() == 0) {
      beerRepository.save(Beer.builder()
          .beerName("Mango Boobs")
          .beerStyle("IPA")
          .quantityToBrew(200)
          .minOnHands(12)
          .upc(33705476821L)
          .price(new BigDecimal("12.95"))
          .build());
    }

    beerRepository.save(Beer.builder()
        .beerName("Galaxy Cat")
        .beerStyle("PAIL_ALE")
        .quantityToBrew(200)
        .minOnHands(12)
        .upc(23234526821L)
        .price(new BigDecimal("10.95"))
        .build());
  }
}
