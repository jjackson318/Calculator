package com.tts.calculator;

public class Calculator {

    public int add(int num1, int num2){
       return  num1 + num2;
    }

    public int subtract(int num1, int num2){
        return  num1 + num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 + num2;
    }

    public static int division(int num, int dividedBy){
        return num / dividedBy;
    }

    public static double xToTheY(double x, double y){
        return Math.pow(y,x);
    }

    public static int square(int num){
        return num * num;
    }
}
