// Abstraction - hiding implementation details
// and showing only the essential information to the user.

// abstract class cannot be directly instantiated.
// abstract method does not have a body.
// Child class must implement the abstract method.


// 1. Abstract Class and Abstract Method

abstract class AbsAnimal {

    abstract void sound();

    void eat() {
        System.out.println("Animal Eats");
    }
}

class AbsDog extends AbsAnimal {

    void sound() {
        System.out.println("Dog Barks");
    }
}


// 2. Abstract Class with Variable and Method

abstract class AbsEmployee {

    String name = "Arun";

    abstract void work();

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class AbsDeveloper extends AbsEmployee {

    void work() {
        System.out.println("Developer Writes Java Code");
    }
}


// 3. Abstract Class with Constructor

abstract class AbsPerson {

    AbsPerson() {
        System.out.println("Person Constructor");
    }

    abstract void work();
}

class AbsStudent extends AbsPerson {

    AbsStudent() {
        System.out.println("Student Constructor");
    }

    void work() {
        System.out.println("Student Studies");
    }
}


// 4. Abstract Class with Multiple Abstract Methods

abstract class AbsCalculator {

    abstract void add();

    abstract void subtract();

    abstract void multiply();
}

class AbsMyCalculator extends AbsCalculator {

    void add() {
        System.out.println("Addition: " + (10 + 20));
    }

    void subtract() {
        System.out.println("Subtraction: " + (20 - 10));
    }

    void multiply() {
        System.out.println("Multiplication: " + (10 * 20));
    }
}


// 5. Abstract Class with Normal Method

abstract class AbsPayment {

    abstract void pay();

    void message() {
        System.out.println("Payment Processing");
    }
}

class AbsUPI extends AbsPayment {

    void pay() {
        System.out.println("Payment using UPI");
    }
}


// 6. Abstract Class + Interface

abstract class AbsVehicle {

    abstract void start();
}

interface AbsGPS {

    void location();
}

class AbsCar extends AbsVehicle implements AbsGPS {

    void start() {
        System.out.println("Car Starts");
    }

    public void location() {
        System.out.println("GPS Location Available");
    }
}


// 7. Abstract Class with Multiple Child Classes

abstract class AbsShape {

    abstract void area();
}

class AbsCircle extends AbsShape {

    int radius = 5;

    void area() {
        double answer = 3.14 * radius * radius;
        System.out.println("Circle Area: " + answer);
    }
}

class AbsSquare extends AbsShape {

    int side = 5;

    void area() {
        System.out.println("Square Area: " + (side * side));
    }
}


public class abstraction {

    public static void main(String[] args) {

        // 1. Abstract Class and Abstract Method

        AbsDog dog = new AbsDog();

        dog.sound();
        dog.eat();


        // 2. Abstract Employee

        AbsDeveloper developer = new AbsDeveloper();

        developer.displayName();
        developer.work();


        // 3. Abstract Class Constructor

        AbsStudent student = new AbsStudent();

        student.work();


        // 4. Multiple Abstract Methods

        AbsMyCalculator calculator = new AbsMyCalculator();

        calculator.add();
        calculator.subtract();
        calculator.multiply();


        // 5. Abstract Payment

        AbsUPI upi = new AbsUPI();

        upi.message();
        upi.pay();


        // 6. Abstract Class + Interface

        AbsCar car = new AbsCar();

        car.start();
        car.location();


        // 7. Multiple Child Classes

        AbsShape circle = new AbsCircle();
        AbsShape square = new AbsSquare();

        circle.area();
        square.area();
    }
}