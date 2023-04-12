package com.bob.projects.sampledatamodel.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
@Table
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Seller extends BaseEntity {
    @Column(name = "NAME")
    String name;
    @Column(name = "USERNAME", unique = true)
    String username;
    @Column(name = "BUSINESS_FIELD")
    String businessField;
    @Column(name = "RATE")
    Integer rate;
    @Column(name = "COMPANY_IDENTIFIER", unique = true)
    String companyIdentifier;
    @Column(name = "COMPANY_ADDRESS")
    String companyAddress;
    @Column(name = "CEO_NATIONAL_CODE", unique = true)
    String ceoNationalCode;
    @Column(name = "IS_ACTIVE")
    boolean isActive;
    @Column(name = "IS_PREMIUM")
    boolean isPremium;
    @Column(name = "ENROLLMENT_DATE")
    ZonedDateTime enrollmentDate;
    @OneToMany(mappedBy = "seller")
    Set<Product> products;


}
