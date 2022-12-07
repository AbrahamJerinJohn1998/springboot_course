package com.nest.courseappbackend.controller;

import com.nest.courseappbackend.dao.CourseDao;
import com.nest.courseappbackend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
@Autowired
private CourseDao dao
    @PostMapping(path = "add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Course c)
    {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseDate().toString());
        System.out.println(c.getCourseVenue().toString());
        dao.save(c);
        return "course added";
    }
}
