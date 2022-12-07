package com.nest.courseappbackend.dao;

import com.nest.courseappbackend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {
    @Query(value = "SELECT 'id','courseTitle','courseDuration','coursedescription','courseDate','courseVenue' from coursedb WHERE 'courseTitle' LIKE %:courseTitle",nativeQuery = true)
    List<Course> searchCourse(@Param("courseTitle")String courseTitle);
}

