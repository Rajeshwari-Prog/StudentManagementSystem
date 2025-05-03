package com.stsproject.main.studentcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.stsproject.main.entity.Student;
import com.stsproject.main.repository.Studentrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class Studentcontroller{
	
	@Autowired
	Studentrepository repo;
	
	//get all students data
	@GetMapping("/students")
	public  List<Student> getAllStudents() {
		List<Student> students = repo.findAll();
		return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		 return student;
	}

	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
	repo.save(student);
}
	
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@PathVariable int id) {
		Student student= repo.findById(id).get();
		student.setBranch("AIML");
		student.setPercentage(83);
		repo.save(student);
		return student;
		
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
		
	}
}
