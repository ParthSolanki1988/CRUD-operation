package com.simform.users.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Data
@Entity
@Table(name = "address")
public class Address {

  @Id
  private String id;
  private String line1;
  private String line2;
  private String country;
  private String state;
  private String pinCode;
}
