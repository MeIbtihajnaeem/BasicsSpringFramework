package com.javadev.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javadev.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static final String INSERT_QUERY = """
			insert into course(id,name,author)
			values(?,?,?)
			""";

	private static final String DELETE_Query = """
			delete from course where id =?
			""";
	private static final String SELECT_Query = """
			Select * from course where id =?
			""";
	public Course findById(long id) {
		return springJdbcTemplate.queryForObject(SELECT_Query, 
				new BeanPropertyRowMapper<>(Course.class), id);
	}
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_Query, id);
	}


}
