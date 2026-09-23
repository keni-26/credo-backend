import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

// Built-in Functional Interfaces
//
// Function  -> takes input and returns output
// Predicate -> takes input and returns true/false
// Consumer  -> takes input and returns nothing

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        // 1. Function
        // Input -> Integer
        // Output -> Integer

        Function<Integer, Integer> square = x -> x * x;

        System.out.println("Square of 5: " + square.apply(5));
        System.out.println("Square of 10: " + square.apply(10));


        // 2. Predicate
        // Input -> Integer
        // Output -> boolean

        Predicate<Integer> checkEven = number -> number % 2 == 0;

        System.out.println("10 is even: " + checkEven.test(10));
        System.out.println("11 is even: " + checkEven.test(11));


        // 3. Consumer
        // Takes input and performs an action
        // Does not return a value

        Consumer<String> print = name -> System.out.println(name);

        print.accept("Sridhar");
        print.accept("Maya");
        print.accept("Madhu");
    }
}