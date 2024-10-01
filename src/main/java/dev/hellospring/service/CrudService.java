package dev.hellospring.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
    List<T> list();

    T create(T T);

    Optional<T> get(int id);

    void update(T t, int id);

    void delete(int id);
}
