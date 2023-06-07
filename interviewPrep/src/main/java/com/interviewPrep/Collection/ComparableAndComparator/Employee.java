package com.interviewPrep.Collection.ComparableAndComparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    @Override
    public int compareTo(Employee o) {
        int returnVal = 0;
        if (this.id == o.getId())
            returnVal = Integer.toString(this.getSalary()).compareTo(Integer.toString(o.getSalary()));
        else if (this.id > o.getId())
            returnVal = 1;
        else
            returnVal = -1;
        return returnVal;
    }
}
