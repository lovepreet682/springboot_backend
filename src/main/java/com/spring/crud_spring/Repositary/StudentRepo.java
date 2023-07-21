package com.spring.crud_spring.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud_spring.StudentEntity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>  {
    
}
