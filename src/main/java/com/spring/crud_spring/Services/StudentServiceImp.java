package com.spring.crud_spring.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.crud_spring.Repositary.StudentRepo;
import com.spring.crud_spring.StudentEntity.Student;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student){
        return studentRepo.save(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
    @Override
    public Student getStudentById(Long id) {
       return studentRepo.findById(id).get();
    }
    @Override
    public void deleteStudent(Long id) {
        Student deleteStudent= studentRepo.findById(id).get();
        if(deleteStudent!=null){
            studentRepo.delete(deleteStudent);
        }
    }

    @Override
    public Student updateStudent(Long id, Student student) {
       Student updateStudent = studentRepo.findById(id).get();
        updateStudent.setName(student.getName());
        updateStudent.setEmail(student.getEmail());
        updateStudent.setCity(student.getCity());
        return studentRepo.save(updateStudent);
       
       }
    }

