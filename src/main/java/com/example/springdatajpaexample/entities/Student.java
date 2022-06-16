package com.example.springdatajpaexample.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name="tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name="email_id unique",
                columnNames="email_address"
        )
)
public class Student {

    @Id
    //@SequenceGenerator(
      //      name = "student-sequence",
        //    sequenceName = "student-sequence",
          //  allocationSize = 1
    //)
    @GeneratedValue(
            strategy = GenerationType.AUTO
      //      generator = "student-sequence"
    )
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(
            name = "email_address",
            nullable = false
    )
    private String emailId;

    //private String guardianName;
    //private String guardGuardianMobile;
    //private String guardGuardianEmail;
    @Embedded
    private Guardian guardian;
}
