package com.interviewPrep.Collection.ComparableAndComparator.FailFastAndSafeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("s");
        list.add("d");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String string = itr.next();
            System.out.println(string);
            list.add("f");
            list.remove("d");
        }
        System.out.println(list);
    }
}
