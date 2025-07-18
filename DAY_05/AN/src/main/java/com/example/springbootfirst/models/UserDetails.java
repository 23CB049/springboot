package com.example.springbootfirst.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data // Generates getters, setters, toString, equals, hashCode
@AllArgsConstructor // Generates constructor with all fields
@NoArgsConstructor // Generates constructor with no filed
@Entity
@Table(name="user_details")
public class UserDetails {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //- if you give this you should not give this field in input this will be auto generated
    private int id;

    private String name;
    private String password;

    @Column(unique = true)
    private String email;
    private String gender;

    @Column(name="date_of_birth")
    private Date dob;

    private String role;
}
