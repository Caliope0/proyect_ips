package com.proyect_ips.proyect_ips.entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;


//Constructor 
public Student() {

}

//Contructor 
public Student(Long id, String name, String email, LocalDate dateOfBirth ){

    this.id = id;
    this.name = name;
    this.email = email;
    this.dateOfBirth = dateOfBirth;

}

// Metodos de acceso ---> Getter----> para obtener los datos que se encuentran
// en cadaa uno de los atributos

public Long getId() {
    return id;
}

public String getName() {
    return name;
}

public String getEmail() {
    return email;
}

public LocalDate getDateOfBirth() {
    return dateOfBirth;
}

// Metodo Setter

public void setId(Long id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name;
}

public void setEmail(String email) {
    this.email = email;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}
}