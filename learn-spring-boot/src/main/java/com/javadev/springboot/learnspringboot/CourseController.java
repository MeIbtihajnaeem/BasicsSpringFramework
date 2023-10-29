package com.javadev.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/course")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "Aws", "Ibtihaj"),
				new Course(2, "Devops", "Ibtihaj"));
	}
}
