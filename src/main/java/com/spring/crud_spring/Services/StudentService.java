package com.spring.crud_spring.Services;

import java.util.List;


import com.spring.crud_spring.StudentEntity.Student;


public interface StudentService {

    //store the Data
    public Student addStudent(Student student);

    //List
    public List<Student> getAllStudents();

    //Get Product By Id
    public Student getStudentById(Long id);

    //Delete the Data
    public void deleteStudent(Long id);

    //Update the data
    public Student updateStudent(Long id, Student student);
}
