package com.kodluyoruz.stream;

import com.kodluyoruz.generics.model.Circle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        /* Streams
         * Streamler Collection interface ini implemente eden sınıflara gelen bir özellik.
         * Streamler Collection elementlerinin içinde dolaşma yöntemimizi değiştiriyor
         * Liste içindeki sayıları toplamak istersek
         */
        List<Integer> numbers = Arrays.asList(1, 5, 4, 3, 7, 2, 3, 5, 6);
        int result = 0;
        for (Integer num :
                numbers) {
            result += num;
        }
        System.out.println("Result: " + result);

        int result2 = numbers.stream().mapToInt(num -> num).sum();
        System.out.println("Result2: " + result2);

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> filteredNumbers = numberList.stream().filter(num -> num > 3).collect(Collectors.toList());
        filteredNumbers.forEach(System.out::println);

        System.out.println("---");

        /* Unique elemanları bulmak için kullanabiliriz */
        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        distinct.forEach(System.out::println);

        List<Circle> circleList = Arrays.asList(new Circle(), new Circle(), new Circle(2));
        circleList.forEach(System.out::println);

        System.out.println("---");

        List<Circle> filteredCircles = circleList.stream().filter(circle -> circle.getRadius() == 1).collect(Collectors.toList());
        filteredCircles.forEach(System.out::println);

    }
}
