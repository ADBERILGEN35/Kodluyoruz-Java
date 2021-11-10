package com.kodluyoruz.optional;


import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);//heap alan tutulan verinin yerini tutuyor
        Rectangle rectangle1 = rectangle;
        rectangle = null;

        if (rectangle1 != null) {
            System.out.println(rectangle1.getWidth());
        }

        if (rectangle != null) {
            System.out.println(rectangle.getWidth());
        }


        int number = 0; //stack alanda veri
        System.out.println(number);

        /* Optional
         * https://www.oracle.com/technical-resources/articles/java/java8-optional.html
         */

        Optional<Rectangle> optionalRectangle = Optional.ofNullable(rectangle);
        if (optionalRectangle.isPresent()) {
            Rectangle rectangle2 = optionalRectangle.get();
        }

        Rectangle orElse = optionalRectangle.orElse(new Rectangle(2, 3));
        System.out.println(orElse.getWidth());

        Optional optional = Optional.empty();
        print(Optional.of(new Rectangle(3,2)));

    }

    private static void print(Optional<Rectangle> rectangle) {
        if (rectangle.isPresent()) {
            Rectangle rectangle1 = rectangle.get();
            System.out.println(rectangle1.getWidth());
        }
    }
}
