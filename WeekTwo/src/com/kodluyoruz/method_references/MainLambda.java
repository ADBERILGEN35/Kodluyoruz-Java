package com.kodluyoruz.method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MainLambda {
    public static void main(String[] args) {
        /* Lambda expression
         * Kolay method yazmanın bir yöntemi method referanslar aracılığı ile kullanışlı oluyorlar
         */

        MathematicalOperation mathematicalOperation = new MathematicalOperation() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println(mathematicalOperation.add(1, 2));

        MathematicalOperation mathematicalOperation2 = new MatematicalOp();

        System.out.println(mathematicalOperation2.add(1, 2));

        MathematicalOperation mathematicalOperation1 = ((num1, num2) -> num1 + num2);
        System.out.println(mathematicalOperation1.add(1, 2));

        MathematicalOperation math1 = Math::addExact;
        System.out.println(math1.add(1, 2));

        test(((num1, num2) -> num1 + num2));

        test(Math::addExact);

        List<String> names = Arrays.asList("ali", "veli");
        names.forEach(System.out::println);
        names.forEach((obj) -> System.out.println(obj));

        /* Lambda expression alan bir method yazalım
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        print(numbers);
        System.out.println("---");

        List<Integer> filterNumbers = filter(numbers, (number) -> number > 3);
        print(filterNumbers);

        System.out.println("---");

        List<String> nameList = Arrays.asList("Ali", "Ahmet", "Mehmet");
        print(nameList);

        System.out.println("---");

        List<String> filteredNames = filter(nameList, name -> name.startsWith("A"));
        print(filteredNames);
    }

    private static <T> List<T> filter(List<T> list, Function<T, Boolean> filterFunction) {
        List<T> filteredList = new ArrayList<>();
        for (T item :
                list) {
            if (filterFunction.apply(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    private static void test(MathematicalOperation op) {
        System.out.println(op.add(3, 2));
    }

    private static void print(List<?> list) {
        for (Object item :
                list) {
            System.out.println(item);
        }
    }
}
