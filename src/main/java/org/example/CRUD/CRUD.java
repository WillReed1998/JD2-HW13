package org.example.CRUD;

import java.util.List;

public interface CRUD<T> {
    void create(T entity);

    T read(Object id);

    void update(T entity);

    void delete(T entity);
}
