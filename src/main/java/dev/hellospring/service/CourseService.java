package dev.hellospring.service;

import dev.hellospring.model.Course;
import dev.hellospring.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudService{
    private CourseRepository repository;


    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List list() {
        return repository.findall();
    }

    @Override
    public Object create(Object T) {
        return null;
    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
