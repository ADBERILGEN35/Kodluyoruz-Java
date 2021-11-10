package com.kodluyoruz;

public class MainDataTypes {

    public static void main(String[] args) {
        /* Variable (Değişken) programda veri tutmamızı sağlayan birimdir. Memoryde bir alanda data tutmamızı sağlar.
         *
         * data = 5
         *
         * Sol taraf değişken adı, = atama operatörü ve 5 atanan veri
         *
         * Kuralları:
         * Harf,_ ve ya $ ile başlamalıdır.
         * Sayı ile başlayamaz!
         */
        int data = 5;
        int $data = 5;
        int _data = 5;
        int data1 = 5;


        byte b = 1; //-2^7 ile (2^7)-1 8 bit
        short s = 1; //-2^15 ile (2^15)-1 16 bit
        int i = 1; //-2^31 ile (2^31)-1 32 bit
        long l = 1; //-2^63 ile (2^63)-1 64 bit

        float f = 1.1f; //32 bit
        double d = 1.1; //64 bit

        boolean bool = true; //false
        char character = 'a';

        /* Değişken tanımlandıktan sonra herhangi bir zamanda değiştirilebilir
         * Eğer değişmemesini istiyorsak final ile sabit değişken tanımlamalıyız.
         */
        int x;
        x = 5;
        x = 7;

        final int y = 1;
        //        y=5; //hatalı

        /* Matematiksel Operatorler:
         * + Toplama
         * - Çıkarma
         * / Bölme
         * * Çarpma
         * % Mod
         */

        double fah, cel;
        fah = 300;
        cel = 5 / 9.0 * (fah - 32);
        System.out.println(fah + " fahreheit is " + cel + " celsius");

        double tam = 5 / 2.0;

        System.out.println(tam);

        /* Shortcut Assignment Operators
         * +=
         * -=
         * *=
         * /=
         * %=
         * ++i
         * i++
         * --i
         * i--
         */

        int count = 0;
        count += 8;

        System.out.println(++count);
        System.out.println(count++);

    }
}
