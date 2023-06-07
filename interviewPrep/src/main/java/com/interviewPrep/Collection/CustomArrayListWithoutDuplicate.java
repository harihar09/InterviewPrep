package com.interviewPrep.Collection;

import java.util.ArrayList;

public class CustomArrayListWithoutDuplicate extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o))
            return true;
        return super.add(o);
    }

    public static void main(String[] args) {
        CustomArrayListWithoutDuplicate list = new CustomArrayListWithoutDuplicate();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
    }
}
