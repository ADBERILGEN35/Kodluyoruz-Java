package com.kodluyoruz.collections;

import com.kodluyoruz.generics.model.Circle;

import javax.crypto.Cipher;
import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ali");

        if (map.containsKey(1)) {
            System.out.println("1 exist");
            String s = map.get(1);
            System.out.println(s);
        }

        String s = map.get(2);
        System.out.println(s);

        s = map.getOrDefault(2, "empty");
        System.out.println(s);

        Map<Integer, List<String>> listMap = new HashMap<>();
        listMap.put(1, Arrays.asList("ali", "ahmet"));

        System.out.println("---");

        List<String> list = listMap.get(1);
        printList(list);

        Circle circle = new Circle(); //0x1
        Circle circle1 = circle; //0x1
        Circle circle2 = new Circle(); //0x2

        Map<Circle, Integer> circleIntegerMap = new HashMap<>();
        circleIntegerMap.put(circle, 1);

        Integer integer = circleIntegerMap.get(circle1);
        System.out.println(integer);

        integer = circleIntegerMap.get(circle2);
        System.out.println(integer);

        List<User> users = Arrays.asList(new User(2, "ahmet"), new User(1, "Ali"));
        Map<Integer, User> userMap = new HashMap<>();

        for (User user :
                users) {
            userMap.put(user.getUserId(), user);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz:");
        String input = scanner.nextLine();

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            Integer count = characterIntegerMap.getOrDefault(input.charAt(i), 0);
            characterIntegerMap.put(input.charAt(i), ++count);
        }
        // a|3
        // b|2

        for (Map.Entry<Character, Integer> entry :
                characterIntegerMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Count: " + entry.getValue());
        }

        System.out.println("----");

        Set<Character> keySet = characterIntegerMap.keySet();
        // [a,b,c]

        for (Character c :
                keySet) {
            System.out.println("Key: " + c + " Count: " + characterIntegerMap.get(c));
        }




    }

    private static void printList(List<String> names) {
        for (String name :
                names) {
            System.out.println(name);
        }
    }
}
