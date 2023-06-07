package com.interviewPrep.Collection.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(1,"clare",10000);
        Employee employee2 = new Employee(3,"adam",40000);
        Employee employee3 = new Employee(2,"nathan",30000);
        Employee employee4 = new Employee(1,"john",20000);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        // sort based on id
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}
