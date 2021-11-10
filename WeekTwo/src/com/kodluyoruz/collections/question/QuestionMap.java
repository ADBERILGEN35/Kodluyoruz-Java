package com.kodluyoruz.collections.question;

import com.kodluyoruz.generics.model.Circle;

import java.util.HashMap;
import java.util.Map;

public class QuestionMap {
    public static void main(String[] args) {
        Map<Key, String> map = new HashMap<>();
        Key key = new Key("123");
        Key key2 = new Key("123");
        map.put(key, "value");

        String value = map.get(key2);

        System.out.println(value);


        System.out.println("---");

        Circle circle = new Circle(); //0x1
        Circle circle1 = circle; //0x1
        Circle circle2 = new Circle(); //0x2

        Map<Circle, Integer> circleIntegerMap = new HashMap<>();
        circleIntegerMap.put(circle, 1);

        Integer integer = circleIntegerMap.get(circle1);
        System.out.println(integer);

        integer = circleIntegerMap.get(circle2);
        System.out.println(integer);


    }
}
