package de.olexiy.spring.msscbrewery.web.model;

import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 2019-04-21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
  @Null
  private UUID id;
  @NotBlank
  @Size(min = 3, max = 100)
  private String name;
}