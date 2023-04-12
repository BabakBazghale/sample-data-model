package com.bob.projects.sampledatamodel.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends BaseEntity {
    @Column(name = "NAME")
    String name;
    @Column(name = "FAMILY")
    String family;
    @Column(name = "NATIONAL_CODE")
    String nationalCode;
    @Column(name = "IBAN")
    String iban;
    @Column(name = "USERNAME", unique = true)
    String username;
    @ManyToOne
    @JoinColumn(name = "FK_PRODUCT", nullable = false)
    Product product;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_CUSTOMER", nullable = false)
    Set<Product> products;

}
