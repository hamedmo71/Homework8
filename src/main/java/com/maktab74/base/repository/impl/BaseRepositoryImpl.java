package com.maktab74.base.repository.impl;

import com.maktab74.base.entity.BaseDomain;
import com.maktab74.base.repository.BaseRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;

public abstract class BaseRepositoryImpl<E extends BaseDomain<ID>, ID extends Serializable> implements BaseRepository<E, ID> {

    protected final EntityManager entityManager;

    protected final Class<E> entityClass;

    public BaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.entityClass = getEntityClass();
    }

    public abstract Class<E> getEntityClass();

    @Override
    public E save(E e) {
        if (e.getId() == null) {
            entityManager.persist(e);
        } else {
            e = entityManager.merge(e);
        }
        return e;
    }

    @Override
    public E findById(ID id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public List<E> findAll() {
//        User -> getSimpleName -> User
        return entityManager.createQuery(
                "select e from " + entityClass.getSimpleName() + " e",
                entityClass
        ).getResultList();
    }

    @Override
    public void deleteById(ID id) {

        entityManager.createQuery(
                        "delete from " + entityClass.getSimpleName() + " e where e.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public long countAll() {
        return entityManager.createQuery(
                "select count(e) from " + entityClass.getSimpleName() + " e",
                Long.class
        ).getSingleResult();
    }

    @Override
    public void beginTransaction() {
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
    }

    @Override
    public void commitTransaction() {
        entityManager.getTransaction().commit();
    }

    @Override
    public void rollbackTransaction() {
        entityManager.getTransaction().rollback();
    }

    @Override
    public EntityTransaction getTransaction() {
        return entityManager.getTransaction();
    }
}
