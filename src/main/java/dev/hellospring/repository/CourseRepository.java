package dev.hellospring.repository;

import dev.hellospring.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findall() {
        List<Course> courses = new ArrayList<>();
        Course spring = new Course(1, "Getting started with spring", "learn how to build applications using spring", "non-existent link");

        courses.add(spring);
        return courses;
    }
}
