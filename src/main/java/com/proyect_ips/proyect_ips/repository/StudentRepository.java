package com.proyect_ips.proyect_ips.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.proyect_ips.proyect_ips.entity.Student;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")

    

public interface StudentRepository  extends PagingAndSortingRepository <Student, Long>, CrudRepository<Student, Long>
{ 
    //Mappinng personalizados
}
