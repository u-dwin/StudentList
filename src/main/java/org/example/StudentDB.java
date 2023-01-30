package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {

    private List<Student> studentList;

    public StudentDB(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getAllStudents(){
        return studentList;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentList=" + studentList +
                '}';
    }

    public Student randomStudent(){
        int randomIndex = (int) (Math.random()*studentList.size());
        return studentList.get(randomIndex);
    }

    public void addStudent(Student newStudent){
        studentList.add(newStudent);
    }

    public void removeStudent(Student exStudent){
        studentList.remove(exStudent);
    }

}
