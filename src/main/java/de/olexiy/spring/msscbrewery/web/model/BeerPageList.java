package de.olexiy.spring.msscbrewery.web.model;

import java.util.List;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * @author Olexiy Sokurenko <ol.sakura@gmail.com>
 * Date: 15.07.2020
 */
public class BeerPageList extends PageImpl<BeerDTO> {
    public BeerPageList(List<BeerDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPageList(List<BeerDTO> content) {
        super(content);
    }
}
