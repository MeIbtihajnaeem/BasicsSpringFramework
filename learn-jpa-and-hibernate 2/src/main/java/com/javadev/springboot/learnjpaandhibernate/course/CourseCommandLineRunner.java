package com.javadev.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javadev.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
//	
//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS", "Ibtihaj"));
		repository.save(new Course(2, "Learn Azure", "Ibtihaj"));
		repository.save(new Course(3, "Learn JAVA", "Ibtihaj"));
		repository.deleteById(3l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(1l));

		System.out.println(repository.findByAuthor("Ibtihaj"));

	}

}
