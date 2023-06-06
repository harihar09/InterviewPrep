package com.interviewPrep.String;

public final class CustomisedImmutableClass {
    // create final class with final data members
    // and no setters methods
    private final int dataMember;

    public CustomisedImmutableClass(int dataMember1){
        this.dataMember = dataMember1;
    }

    public int getDataMember(){
        return dataMember;
    }

    public static void main(String[] args) {
        CustomisedImmutableClass obj = new CustomisedImmutableClass(10);
        System.out.println(obj.getDataMember());
        //obj.dataMember = 200; won't be able to reassign value as it's final
    }
}
