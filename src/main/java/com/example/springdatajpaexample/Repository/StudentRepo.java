package com.example.springdatajpaexample.Repository;

import com.example.springdatajpaexample.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}
