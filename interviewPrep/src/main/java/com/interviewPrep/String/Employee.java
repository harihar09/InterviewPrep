package com.interviewPrep.String;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import static com.interviewPrep.String.Address.getAddressInstance;

@AllArgsConstructor
@Getter
@ToString
public final class Employee {
    private final String name;
    private final String id;
    private final Address address;

    public Address getAddress() {
        return  getAddressInstance(address);
    }
}
