package com.example.springdatajpaexample.Repository;

import com.example.springdatajpaexample.entities.Guardian;
import com.example.springdatajpaexample.entities.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void  saveMethod(){

        Student student= Student.builder()
                .emailId("ram@gmail.com")
                .firstName("ram")
                .lastName("sita")
                //.guardianName("vihsnu")
                //.guardGuardianEmail("vishnu@gmail.com")
                //.guardGuardianMobile("12233")
                .build();

        studentRepo.save(student);

    }

    @Test
    public void saveWithGuardian(){

        Guardian guardian = Guardian.builder()
                .email("some@gmail.com")
                .mobile("1233")
                .name("vayu").build();

        Student student = Student.builder()
                .firstName("hanuman")
                .lastName("patti")
                .emailId("patti@gmail.com")
                .guardian(guardian)
                .build();

        studentRepo.save(student);
    }

    @Test
    @DisplayName(value = "getting all the records ")
    public void findAllMethod(){

        List<Student> studentList=studentRepo.findAll();
        System.out.println(studentList);
    }
}