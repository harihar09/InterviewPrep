package com.interviewPrep.Collection;

import java.util.HashSet;
import java.util.Set;

public class StudentSetApp {
    public static void main(String[] args) {
        CustomSetStudentClass student1 = new CustomSetStudentClass("clare",30);
        CustomSetStudentClass student2 = new CustomSetStudentClass("clare",30);
        CustomSetStudentClass student3 = new CustomSetStudentClass("pauline",30);
        Set<CustomSetStudentClass> set = new HashSet<CustomSetStudentClass>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        System.out.println(set);
    }
}
