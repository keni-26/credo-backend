// Lambda Expression
// Lambda expression is a short way to write
// the implementation of a functional interface.

// Syntax:
// (parameters) -> expression
//
// or
//
// (parameters) -> { statements; }

// Functional Interface
// A functional interface is an interface
// that contains exactly one abstract method.

public class LambdaExample {

    public static void main(String[] args) {

        // 1. Lambda with no parameter

        Message message = () -> {
            System.out.println("Welcome to Credo Systemz");
        };

        message.show();


        // 2. Lambda with parameters

        Calculator calculator = (a, b) -> a + b;

        System.out.println("Addition: " + calculator.add(10, 20));


        // 3. Lambda with a single parameter

        Square square = x -> x * x;

        System.out.println("Square: " + square.calculate(5));
        System.out.println("Square: " + square.calculate(10));
    }
}


// Functional Interface - one abstract method

interface Message {
    void show();
}


interface Calculator {
    int add(int a, int b);
}


interface Square {
    int calculate(int x);
}