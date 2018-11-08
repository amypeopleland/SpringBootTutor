package com.example.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CourseController {

    //通过PATH访问
    @GetMapping(path = "/course", produces = "application/json")
    //下面是CONTROLLER进行MAPPING到一个服务
    //findAllCourse DeleteCourse findAllCourseById
    public HttpEntity findAllCourses(){
       // List<CourseDto> allCourses = courseService.findAllCourses();

        return new ResponseEntity<>("OK",HttpStatus.OK);
    }

    @GetMapping(path = "/", produces = "application/json")
    //下面是CONTROLLER进行MAPPING到一个服务
    public HttpEntity findIndex(){
        // List<CourseDto> allCourses = courseService.findAllCourses();

        return new ResponseEntity<>("This is Index",HttpStatus.OK);
    }

}
