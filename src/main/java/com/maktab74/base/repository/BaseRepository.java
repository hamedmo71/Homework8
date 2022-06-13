package com.maktab74.base.repository;

import com.maktab74.base.entity.BaseDomain;

import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;

public interface BaseRepository<E extends BaseDomain<ID>, ID extends Serializable> {

    E save(E e);

    E findById(ID id);

    List<E> findAll();

    void deleteById(ID id);

    long countAll();

    void beginTransaction();

    void commitTransaction();

    void rollbackTransaction();

    EntityTransaction getTransaction();
}
