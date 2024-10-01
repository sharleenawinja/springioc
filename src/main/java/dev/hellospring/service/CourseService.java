package dev.hellospring.service;

import dev.hellospring.model.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CourseService implements CrudService{

    private List<Course> courses;

    public CourseService() {
        courses = new ArrayList<>();
        Course spring = new Course(1, "Getting started with spring", "learn how to build applications using spring", "non-existent link");

        courses.add(spring);
    }

    @Override
    public List list() {
        return courses;
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
