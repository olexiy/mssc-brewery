package de.olexiy.spring.msscbrewery.web.model.v2;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Olexiy Sokurenko <ol.sakura@gmail.com>
 * Date: 15.07.2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
