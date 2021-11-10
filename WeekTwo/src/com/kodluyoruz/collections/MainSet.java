package com.kodluyoruz.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        print(set);

        System.out.println("---");


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        print(list);

        System.out.println("---");

        list.add(1);
        print(list);

        System.out.println("---");

        set.add(1);
        print(set);



    }

    private static void print(Set<Integer> set) {
        for (Integer i : set) {
            System.out.println(i);
        }
    }
    private static void print(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
