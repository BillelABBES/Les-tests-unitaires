package org.example;

public class Calculator {

    public int addition (int a, int b){
        return a + b ;
    }

    public int multiplication (int a, int b){
        return a * b ;
    }

    public int division (int a, int b){
        return a / b ;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.division(2,0));
    }
}
