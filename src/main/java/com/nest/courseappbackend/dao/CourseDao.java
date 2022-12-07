package com.nest.courseappbackend.dao;

import com.nest.courseappbackend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
