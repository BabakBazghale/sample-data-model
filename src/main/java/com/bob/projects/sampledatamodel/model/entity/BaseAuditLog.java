package com.bob.projects.sampledatamodel.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
public class BaseAuditLog {
    ZonedDateTime registrationDate;
    ZonedDateTime deletionDate;
    String deletedBy;
    boolean isDeleted;

}
