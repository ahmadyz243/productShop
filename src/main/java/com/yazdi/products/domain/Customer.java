package com.yazdi.products.domain;

import com.yazdi.products.enumiration.Role;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Component
@Entity
public class Customer extends BaseEntity{

    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private Role role = Role.USER;

}
