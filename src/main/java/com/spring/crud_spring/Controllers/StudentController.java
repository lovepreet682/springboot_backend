package com.spring.crud_spring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.crud_spring.Services.StudentService;
import com.spring.crud_spring.StudentEntity.Student;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //POST The Data
    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
    return studentService.addStudent(student);
    }

    //List the Data
    @GetMapping("/list")
    public List<Student> listStudent(){
        return studentService.getAllStudents();
    }

    //Get List By Id
    @GetMapping("/list/{id}")
    public Student getListById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    //Delete the Data
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "Value is deleted Successfully";
    }

    //Updaate the Data
    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody Student student){
        studentService.updateStudent(id, student);
        return "Student Update Successfully";
    }
   
}
