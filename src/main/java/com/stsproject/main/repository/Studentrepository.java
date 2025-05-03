package com.stsproject.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stsproject.main.entity.Student;



public interface Studentrepository extends JpaRepository<Student, Integer>{

}
