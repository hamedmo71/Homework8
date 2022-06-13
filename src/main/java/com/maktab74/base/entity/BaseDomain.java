package com.maktab74.base.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public abstract class BaseDomain<ID extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public BaseDomain() {
    }

    public BaseDomain(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
