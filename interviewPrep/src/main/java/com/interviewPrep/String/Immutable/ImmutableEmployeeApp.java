package com.interviewPrep.String.Immutable;

public class ImmutableEmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("carry","1", new Address("pune","MH","q2131","MG road"));
        System.out.println(employee);
        Address address = employee.getAddress();
        address.setCity("mumbai");
        System.out.println(employee);
    }
}
