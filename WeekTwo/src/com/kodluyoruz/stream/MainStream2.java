package com.kodluyoruz.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream2 {
    public static void main(String[] args) {
        /* Stream oluşturmak için List yada benzer sınıflar zorunlu değil
         * Direk Stream sınıfının özelliklerini kullanarak da stream oluşturup işlem yapabiliriz
         * empty
         * of
         * generate
         * iterate
         * range
         * rangeClosed
         */

        /*
         * - Intermediate operations
         *   filter()
         *   map()
         *   flatMap()
         *   distinct()
         *   sorted()
         *   peek()
         *   limit()
         *   skip()
         *
         * - Terminal Operations
         *   forEach()
         *   forEachOrdered()
         *   toArray()
         *   reduce()
         *   collect()
         *   min()
         *   max()
         *   count()
         *   anyMatch()
         *   allMatch()
         *   noneMatch()
         *   findFirst()
         *   findAny()
         *
         * Terminal operatorler stremleri sonlandıran işlemlerdir.
         * Intermediate operationlar streamleri kapatmaz.
         */

        Stream<String> streamEmpty = Stream.empty();

        Stream<String> stringStream = Stream.of("ali", "ahmet", "mehmet");
        stringStream
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("---");
        List<String> stringList = Arrays.asList("ali", "ahmet");

        Stream<String> nameStream = Stream.generate(() -> {
            Random random = new Random();
            String s = stringList.get(random.nextInt(2));
            System.out.println(s);
            return s;
        }).limit(10);

        nameStream.forEach(System.out::println);

        System.out.println("---");

        List<Integer> numberList = Stream.iterate(10, i -> i + 2).limit(5).collect(Collectors.toList());
        numberList.forEach(System.out::println);

        /* primitive data tipleri için daha farklı özellikleri barındıran stream sınıfları mevcut
         *
         */

        /* primitive streamlerde ekstra işlemler yapılabilir min,max,count,sum,average*/
        System.out.println("---");
        IntStream intStream = IntStream.range(1, 10);
        OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());

        System.out.println("---");

        Stream.generate(() -> 1).limit(3).skip(1).forEach(System.out::println);

        System.out.println("---");

        /* Streamler lazy initialization özelliğine sahiptir */
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });
        System.out.println(counter); //Tahminler 3

        List<String> filteredList = stream.collect(Collectors.toList());

        System.out.println(counter); //Tahminler 3


        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);

        infiniteStream.skip(1000).limit(10).forEach(System.out::println);

        /*
         Gruplara dağılıp

         verilen texti stream ile işleyip c harfi bulunan kelimeleri listeleyen bir kod yapalım
         "\n" new line karakterlerini silelim
         */
    }
    private static long counter;

    private static void wasCalled() {
        counter++;
    }
}
