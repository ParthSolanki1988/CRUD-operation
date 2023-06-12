package com.simform.users.Entity;


import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {
  @Id
  @SequenceGenerator(
          name = "user_sequence",
          sequenceName = "user_sequence",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "user_sequence"
  )
  @Column(name="id")
  private Integer id;

  @Column(name="user_name")
  private String userName;
  @Column(name = "email",nullable = false,unique = true)
  private String email;

  @Column(name = "password")
  private String password;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id",referencedColumnName = "id")
  private Address address;
}
