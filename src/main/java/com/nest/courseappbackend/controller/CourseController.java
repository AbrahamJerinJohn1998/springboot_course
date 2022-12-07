package com.nest.courseappbackend.controller;

import com.nest.courseappbackend.dao.CourseDao;
import com.nest.courseappbackend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {
@Autowired
private CourseDao dao;
@CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> add(@RequestBody Course c)
    {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseDate().toString());
        System.out.println(c.getCourseVenue().toString());
        dao.save(c);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Course> view()
    {
        return (List<Course>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> search(@RequestBody Course c)
    {
        String courseTitle= c.getCourseTitle().toString();
        System.out.println(courseTitle);
        return (List<Course>) dao.searchCourse(c.getCourseTitle());
    }
}
