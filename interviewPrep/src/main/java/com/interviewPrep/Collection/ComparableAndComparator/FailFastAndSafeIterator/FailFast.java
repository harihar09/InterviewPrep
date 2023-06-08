package com.interviewPrep.Collection.ComparableAndComparator.FailFastAndSafeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("s");
        list.add("d");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            // ConcurrentModificationException
            list.remove(1);
        }
    }
}
