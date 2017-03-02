package com.epam.chadov.api.persistence.dao;

/**
 * @author Andrey_Chadov on 3/2/2017.
 */
public interface Dao<E, K> {

    K create(E entity);

    K update(E entity);

    boolean delete(K key);

    E find(K key);

}
