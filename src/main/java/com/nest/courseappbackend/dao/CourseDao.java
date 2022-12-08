package com.nest.courseappbackend.dao;

import com.nest.courseappbackend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {
    @Query(value = "SELECT `id`, `course_date`, `course_description`, `course_duration`, `course_title`, `course_venue` FROM `course` WHERE  `course_title` LIKE %:courseTitle%",nativeQuery = true)
    List<Course> searchCourse(@Param("courseTitle")String courseTitle);
}

