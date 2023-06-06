package com.yazdi.products.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Entity
@Scope("prototype")
@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter@Getter
public class Product extends BaseEntity {

    private String name;
    private int price;
    private int inventory;
    private String image;
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "otherProperties", joinColumns = @JoinColumn(name = "Product-id"))
    @Column(name = "otherProperties", nullable = false)
    private Map<String,String> otherProperties;

}
