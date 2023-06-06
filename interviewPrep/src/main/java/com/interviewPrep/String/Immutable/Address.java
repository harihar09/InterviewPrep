package com.interviewPrep.String.Immutable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String city;
    private String state;
    private String pinCode;
    private String area;

    public static Address getAddressInstance(Address address){
         return new Address(address.getCity(),address.getState(),address.getPinCode(),address.area);
    }
}
