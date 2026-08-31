class Student {

    String name;
    int age;
    String course;
    int fees;

    void display() {
        System.out.println("Student Information");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
        System.out.println("Course Fees : " + fees);
    }

    void displayDetails(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


class Employee {

    String name;
    int salary;

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}


class Car {

    String brand;
    String color;
    int price;

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
    }

    void start() {
        System.out.println("Car Started");
    }
}


class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}


public class ClassObject {

    public static void main(String[] args) {


        // 1. Class and Object

        Student s1 = new Student();

        s1.name = "Kenisha";
        s1.age = 21;
        s1.course = "Java";

        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
        System.out.println("Course : " + s1.course);


        System.out.println("--------------------");


        // 2. Class and Object with Variables

        Student s2 = new Student();

        s2.name = "Ken";
        s2.age = 21;
        s2.course = "Python";
        s2.fees = 20000;

        System.out.println("Name : " + s2.name);
        System.out.println("Age : " + s2.age);
        System.out.println("Course : " + s2.course);
        System.out.println("Fees : " + s2.fees);


        System.out.println("--------------------");


        // 3. Class and Object with Method

        s2.display();


        System.out.println("--------------------");


        // 4. Multiple Objects - One Class

        Student s3 = new Student();

        s3.name = "Keni";
        s3.age = 25;
        s3.course = "Java";
        s3.fees = 25000;

        s3.display();


        System.out.println("--------------------");


        // 5. Method with Parameters

        Student s4 = new Student();

        s4.displayDetails("Rahul", 24);


        System.out.println("--------------------");


        // 6. Employee Class

        Employee e1 = new Employee();

        e1.name = "John";
        e1.salary = 50000;

        e1.display();


        System.out.println("--------------------");


        Employee e2 = new Employee();

        e2.name = "Alice";
        e2.salary = 90000;

        e2.display();


        System.out.println("--------------------");


        // 7. Car Class with Variable and Method

        Car c1 = new Car();

        c1.brand = "BMW";
        c1.color = "Black";
        c1.price = 5000000;

        c1.display();
        c1.start();


        System.out.println("--------------------");


        // 8. Calculator - Method with Return Value

        Calculator calculator = new Calculator();

        int addition = calculator.add(10, 20);
        System.out.println("Addition : " + addition);

        int subtraction = calculator.sub(90, 5);
        System.out.println("Subtraction : " + subtraction);

        int multiplication = calculator.multiply(10, 3);
        System.out.println("Multiplication : " + multiplication);

        int division = calculator.divide(10, 2);
        System.out.println("Division : " + division);


        System.out.println("--------------------");


        // 9. Directly Calling Method with Return Value

        System.out.println( "Addition : " + calculator.add(50, 20));

        System.out.println( "Subtraction : " + calculator.sub(100, 40));

        System.out.println( "Multiplication : " + calculator.multiply(5, 6));

        System.out.println( "Division : " + calculator.divide(100, 5));
    }
}