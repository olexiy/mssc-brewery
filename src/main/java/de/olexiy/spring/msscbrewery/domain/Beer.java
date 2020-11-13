package de.olexiy.spring.msscbrewery.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beer {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
  private UUID id;
  @Version
  private Long version;

  @CreationTimestamp
  @Column(updatable = false)
  private Timestamp createDate;
  @UpdateTimestamp
  private Timestamp updateDate;
  private String beerName;
  private String beerType;

  @Column(unique = true)
  private Long upc;
  private BigDecimal price;

  private Integer minOnHands;
  private Integer quantityToBrew;


}
