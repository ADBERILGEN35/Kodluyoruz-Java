package com.kodluyoruz.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MainMethodReference {
    public static void main(String[] args) {
        MathematicalOperation mathematicalOperation = MathematicalOperationImpl::add;
        System.out.println(mathematicalOperation.add(1, 2));

        /* Consumer
         * void ve parametre alan methodları Consumer ile referanslarını tutabiliriz.
         */
        Consumer<String> println = System.out::println;
        println.accept("Test");

        /* Supplier
         * Parametre almadan dönüş yapan methodları tutabileceğimiz sınıf
         */
        Supplier<Double> random = Math::random;
        Double randomDouble = random.get();
        println.accept(String.valueOf(randomDouble));

        Supplier<String> createString = MainMethodReference::createString;
        println.accept(createString.get());

        /* Function
         * 1 parametre alıp dönüş yapan methodları tutabileceğimiz bir sınıf
         */

        Function<Double, Long> round = Math::round;
        Long roundResult = round.apply(1.6);
        println.accept(String.valueOf(roundResult));

        /* BiFunction
         * 2 parametre alıp dönüş yapan methodlar
         */
        BiFunction<Integer, Integer, Integer> add = MathematicalOperationImpl::add;
        Integer addResult = add.apply(1, 2);
        println.accept(String.valueOf(addResult));

        /* Kullanıcıdan 2 sayı alıp
         *  num1 + num2 -> result 2 + 5= 7
         *  num1 * num2 -> result2 2 * 5= 10
         *  num1 - num2 -> result3 2-5 = -3
         *  finalResult= result + result2 + result3; 14
         *  print finalResult
         */
        BiFunction<Integer, Double, Double> multiply = MathematicalOperationImpl::multiply;


        List<BiFunction<Integer, Integer, Integer>> operations = Arrays.asList(
                MathematicalOperationImpl::add,
                MathematicalOperationImpl::multiply,
                MathematicalOperationImpl::extract
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("2 tane sayı giriniz.");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int finalResult = 0;
        for (BiFunction<Integer, Integer, Integer> op :
                operations) {
            Integer result = op.apply(num1, num2);
            finalResult += result;
        }
        println.accept(String.valueOf(finalResult));

    }

    public static String createString() {
        return "test";
    }
}
