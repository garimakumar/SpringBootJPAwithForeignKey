package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

@Autowired
	Studentrepo repo;
	
@PostMapping("/insert")
public Student createStudent(@RequestBody Student s) {
	Passport passport=new Passport();
	passport.setId(1);
	passport.setNumber("ginnigarima123");
	passport.setStudent(s);
	s.setPassport(passport);
    return repo.save(s);
}

@GetMapping("/getstudentid/{id}")
public Optional<Student> getStudentById(@PathVariable("id") int id) {
	 return repo.findById(id);

}

}
