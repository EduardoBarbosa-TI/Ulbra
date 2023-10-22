package controller;


import model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {
    private ArrayList<Student> studentsList = new ArrayList<>();
    @GetMapping
    public ArrayList<Student> getAllStudents(){
        return studentsList;
    }

    @PostMapping
    public Student storeStudents(@RequestBody Student studentData){
        studentsList.add(studentData);
        return studentData;
    }
}
