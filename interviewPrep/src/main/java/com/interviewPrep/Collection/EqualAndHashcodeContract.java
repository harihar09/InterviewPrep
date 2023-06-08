package com.interviewPrep.Collection;

import com.interviewPrep.Collection.ComparableAndComparator.Employee;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EqualAndHashcodeContract {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        EqualAndHashcodeContract obj = (EqualAndHashcodeContract) object;
        return this.id == obj.getId() && this.name.equals(obj.getName());
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        EqualAndHashcodeContract obj1 = new EqualAndHashcodeContract(1, "john");
        EqualAndHashcodeContract obj2 = new EqualAndHashcodeContract(1, "john");
        System.out.println("hashcode same? " + (obj1.hashCode() == obj2.hashCode()));
        System.out.println("equals ? " + obj1.equals(obj2));
    }
}
