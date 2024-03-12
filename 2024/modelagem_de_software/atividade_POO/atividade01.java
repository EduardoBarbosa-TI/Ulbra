import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) {
        Student student = new Student("Eduardo", 22, 8340, "Análise e desenvolvimento de sistemas");
        System.out.println(student.getStudent());
    }
}

class Student {
    private String name;
    private int age;
    private int registration;
    private String course; 

    public Student(String name, int age, int registration, String course){
        this.name = name;
        this.age = age;
        this.registration = registration;
        this.course = course;
    }

    public String getStudent(){           
        String informationStudent = "Nome do aluno: " + name + 
                                    "\nIdade do aluno: " + age + 
                                    "\nMatrícula do aluno: " + registration +
                                    "\nCurso do aluno: " + course;
        return informationStudent;
    }

}
