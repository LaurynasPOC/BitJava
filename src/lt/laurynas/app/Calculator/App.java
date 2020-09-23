package lt.laurynas.app.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        System.out.println(StaticCalculator.add(5, 4));
        System.out.println(StaticCalculator.divide(8, 4));
        System.out.println(StaticCalculator.substract(10, 5));
        System.out.println(StaticCalculator.multiply(5, 5));

        NonStaticCalculator calculator = new NonStaticCalculator();
        System.out.println(calculator.add(6, 8));
        System.out.println(calculator.divide(9, 3));
        System.out.println(calculator.multiply(5, 5));
        System.out.println(calculator.substract(10, 5));
    }
}

class StaticCalculator {
    public static int add(int i, int j){
        return i + j;
    }

    public static int divide(int i, int j){
        return i/j;
    }
    public static int substract(int i, int j){
        return i-j;
    }
    public static int multiply(int i, int j){
        return i*j;
    }
}

class NonStaticCalculator {
    public int add(int i, int j){
        return i + j;
    }

    public int divide(int i, int j){
        return i/j;
    }
    public int multiply(int i, int j){
        return i*j;
    }
    public int substract(int i, int j){
        return i-j;
    }
}

