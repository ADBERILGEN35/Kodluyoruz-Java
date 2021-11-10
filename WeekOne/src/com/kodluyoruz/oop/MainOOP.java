package com.kodluyoruz.oop;

public class MainOOP {
    public static void main(String[] args) {
        /* OOP
         * Gerçek hayattaki nesneleri programa aktarmak için kullanabileceğimiz özellik
         * Örneğin matematikte bulunan daireyi koda aktarmak istersek;
         *  Dairenin onu niteleyen bir yarı çapı vardır
         *  Yarıçapa bağlı olarak bir çevresi vardır
         *  Alanı vardır
         *
         * Sınıflar birer taslak gibidir. Sınıftan üretilenler ise nesnelerdir.
         */


        Circle circle = new Circle(); //default constructor
        System.out.println(circle.findArea());

        /* OOP Konseptleri
         *
         * Abstraction (Soyutlama): Karmaşık işlemlerin işleyişini bilmeden çalışabilmesini sağlamaya yarıyor.
         * Örneğin Telefon içerisinde çalışma mekanizmasını bilmeden kullanabliriz
         *
         * Encapsulation (Kapsülleme): Sınıflarda tutulan verilerin dış müdahelelere karşı korunmasının sağlar
         *
         * Inheritence (Miras): Yeni sınıf yaratırken var olan sınıfın özelliklerini alabilmeyi sağlayan özellik.
         * Örneğin Köpek sınıfı yazarken Hayvanlar sınıfını miras alabiliriz oradaki özellikler köpekte de olacaktır.
         * Bir sınıf sadece bir sınıfı extend edebilir.
         *
         * Polymorphism (Çok biçimlilik): Programın içinde bir sınıfı nitelerken onu niteleyebilecek başka bir sınıf
         * ile gösterebilmektir.
         * Örneğin: Köpek aslında bir hayvandır Kedi de bir hayvandır. Hayvan diyerek hem köpeği hem de kediyi
         * niteleyebilirim
         */

        /* Abstraction Dice */
        Dice dice = new Dice();
        dice.roll();

//        dice.faceValue = 7;
        System.out.println(dice.getFaceValue());

        /* Inheritence
         * Silindir tabanları eşit iki daireden meydana gelen bir geometrik şekildir o zaman daire den yazdığımız
         * özellikleri miras alabilir
         */

        Cyclinder cyclinder = new Cyclinder(1);
        System.out.println(cyclinder.findVolume());

    }
}
