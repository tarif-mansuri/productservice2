package com.tarif.productservice2.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Id
    private Long id;
    private Date created_at;
    private Date lastUpdated_at;
    private boolean isDeleted;
}
