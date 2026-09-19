public class MethodType {

    // 1. Without argument, without return type

    static void display() {
        System.out.println("Welcome to Credo Systemz");
    }

    // 2. With argument, without return type

    static void checkAge(int age) {

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }


    // 3. Multiple arguments

    static void display(String fname, String lname, int pin) {
        System.out.println("Welcome " + fname + " " + lname);
        System.out.println("Pin : " + pin);
    }


    // 4. With argument, with return type

    static int addFiveNumbers(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }


    // 5. Without argument, with return type

    static int add() {
        int a = 10;
        int b = 100;
        return a + b;
    }

    // 6. With argument, without return type

    static void addThreeNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // 7. Method returning int

    static int intAdd(int a, int b, int c) {
        return a + b + c;
    }


    // 8. Method returning double

    static double doubleAdd(double a, double b, double c) {

        return a + b + c;
    }

    // 9. Method Overloading - int

    static int add(int a, int b) {
        return a + b;
    }

    // 10. Method Overloading - double

    static double add(double a, double b) {
        return a + b;
    }

    // 11. Method Overloading - String

    static String add(String a, String b) {
        return a + b;
    }


    public static void main(String[] args) {
        // Calling methods

        System.out.println("Method Examples");

        display();
        
        System.out.println("-----------------------------");

        checkAge(21);

        System.out.println("-----------------------------");

        display("Kenisha", "Basil", 2026);

        System.out.println("-----------------------------");

        System.out.println("Sum of Five Numbers : "+ addFiveNumbers(90, 80, 100, 100, 100));

        System.out.println("-----------------------------");

        System.out.println("Sum : " + add());

        System.out.println("-----------------------------");

        addThreeNumbers(90, 100, 80);

        System.out.println("-----------------------------");

        System.out.println("Integer Sum : "+ intAdd(10, 20, 30));

        System.out.println("-----------------------------");

        System.out.println("Double Sum : " + doubleAdd(10.4, 20.2, 30.1));

        System.out.println("-----------------------------");

        // Method Overloading

        System.out.println("Method Overloading");

        System.out.println(add(10, 20));

        System.out.println(add(10.2, 20.2));

        System.out.println(add("Java ", "Programming"));

    }
}