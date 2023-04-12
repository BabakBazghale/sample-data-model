package com.bob.projects.sampledatamodel.model.entity;

import com.bob.projects.sampledatamodel.model.enumeration.ProductCategoryEnum;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product extends BaseEntity {
    @Column(name = "NAME", unique = true)
    String name;
    @Column(name = "PRODUCT_CATEGORY")
    ProductCategoryEnum category;
    @Column(name = "PRICE")
    BigDecimal price;
    @Column(name = "IS_SOLD")
    boolean isSold;
    @Column(name = "IS_ACTIVE")
    boolean isActive;
    @OneToMany(mappedBy = "product")
    Set<Customer> customers;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_PRODUCT_DETAIL", referencedColumnName = "id")
    ProductDetail productDetail;
    @ManyToOne
    @JoinColumn(name = "FK_SELLER", nullable = false)
    Seller seller;
}
