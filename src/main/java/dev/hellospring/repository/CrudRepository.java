package dev.hellospring.repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findall();
}
