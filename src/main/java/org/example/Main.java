package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student hamideh = new Student("Hamideh", 1);
        Student ana = new Student("Ana", 2);
        Student daniel = new Student("Daniel", 3);
        Student valentin = new Student("Valentin", 4);
        ComputerScienceStudent csTest = new ComputerScienceStudent("Test", 6, "Computer Science");

        System.out.println(csTest);

        /*List<Student> studentList = new ArrayList(){{
            add(hamideh);
            add(ana);
        }};*/
        List<Student> studentList = new ArrayList<>(List.of(hamideh, ana, daniel));


        StudentDB database = new StudentDB(studentList);
        System.out.println(database.toString());
        // System.out.println(database.getAllStudents());
        // System.out.println(database.randomStudent());
        // database.addStudent(valentin);
        database.removeStudent(ana);
        System.out.println(database.toString());

        database.addStudent(valentin);
        System.out.println(database);





    }
}
