package com.kodluyoruz;

public class MainMethod {
    public static void main(String[] args) {
        /* Method (function)
         * Method is a collection of statements that are grouped together to perform operation
         *
         * System.out.println(...)
         * Integer.parseInt(...)
         *
         * syntax:
         * modifier returnValueType methodName(listOfParameters)
         */
        int num1 = 5;
        int num2 = 2;

        multiply(num1, num2);


        int num3 = 3;
        int num4 = 6;

        multiply(num3, num4);

        /*
         * Methodlar bir değer geri dönebilirler. ReturnValueType döndüğü verinin tipini niteler.
         * Eğer method bir veri dönmeyecekse ReturnValueType void olmalıdır.
         * Method ismi ve parametreleri methodun imzasını oluşturur (Method Signature)
         * Method dönmek istediği veriyi return ifadesi ile dönebilir.
         * return ifadesinin altında yazılan kodlar çalışmaz method orada sonlanır
         * Her parametre kendi data tipini belirtmelidir
         */

        double dNum1 = 5.0;
        double dNum2 = 2.0;
        double resultDivision = division(dNum1, dNum2);
        System.out.println(resultDivision);

        /* Method Overloading
         * Aynı ismi taşıyan ama farklı parametre alan methodlara denir
         * Java compiler method imzasına göre hangisini kullanacağına karar verir.
         */

        multiply(dNum1,dNum2);

    }

    public static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }
    public static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(result);
    }

    public static double division(double d1, double d2) {
        return d1 / d2;
    }

    public void multiply2(int num1,int num2){
        int result = num1 * num2;
        System.out.println(result);
    }


}
