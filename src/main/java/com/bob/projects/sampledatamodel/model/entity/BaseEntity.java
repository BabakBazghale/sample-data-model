package com.bob.projects.sampledatamodel.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@Data
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity extends BaseAuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String code;

}
