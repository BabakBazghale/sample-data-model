package com.bob.projects.sampledatamodel.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDetail extends BaseEntity {
    @OneToOne(mappedBy = "productDetail")
    Product product;
    @Column(name = "WEIGHT")
    Long weight;
    @Column(name = "HEIGHT")
    Long height;
    @Column(name = "COLOR")
    Long color;
}
