package com.example.school_app;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Table
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera automaticamente id tipo long
    private long id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "students")
    private ArrayList<Enrollment> enrollments;
}
