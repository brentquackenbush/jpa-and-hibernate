package com.example.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;
//
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn Prof.Quackenbush Microservices" , "Brent Quack"));
        repository.save(new Course(2,"Learn Prof.Quackenbush Full-Stack" , "Brent Quack"));
        repository.save(new Course(3,"Learn Prof.Quackenbush DevOps" , "Brent Quack"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findByAuthor("Brent Quack"));
    }
}
