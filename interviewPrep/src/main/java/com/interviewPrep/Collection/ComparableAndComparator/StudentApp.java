package com.interviewPrep.Collection.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(2,"gandhi");
        Student student2 = new Student(3,"mk");
        Student student3 = new Student(4,"pandit");
        Student student4 = new Student(1,"nehru");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        Collections.sort(studentList,new StudentIDComparator());
        System.out.println(studentList);

    }
}
