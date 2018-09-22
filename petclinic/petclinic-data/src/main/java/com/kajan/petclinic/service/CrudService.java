package com.kajan.petclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {

    T save(T object);

    T findById(ID id);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
