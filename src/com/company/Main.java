package com.company;

public class Main {

    public static void main(String[] args) {
        double[] myArray = {1.0, 2.0, 3.5, 4.5, 5.0, 6.5, 7.0, -8.5, 9.0, 10.5, 11.0, 12.5, 13.0, -14.5, -15.0};
        boolean count = false;
        double sum = 0.0;
        double result;
        int amount = 0;

        for (double i: myArray) {
            if (i < 0)
            {
                count = true;
            }
            if (count) {
                if (i > 0) {
                    sum += i;
                    amount++;
                }
            }
        }
        result = sum / amount;
        System.out.println("среднее арифметическое число = " + result);
    }
}






