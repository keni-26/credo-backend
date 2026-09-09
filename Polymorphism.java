// Polymorphism - One name, many forms

// Types of Polymorphism:
// 1. Compile Time Polymorphism - Method Overloading
// 2. Run Time Polymorphism - Method Overriding


// 1. Method Overloading
// Method Overloading means having multiple methods
// with the same name but different parameters.

class PolyCalculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


// 2. Different Number of Parameters

class PolyDisplay {

    void show() {
        System.out.println("No Arguments");
    }

    void show(String name) {
        System.out.println("Name: " + name);
    }

    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// 3. Different Data Types

class PolyPrinter {

    void print(int number) {
        System.out.println("Number: " + number);
    }

    void print(String text) {
        System.out.println("Text: " + text);
    }

    void print(double value) {
        System.out.println("Value: " + value);
    }
}


// 4. Runtime Polymorphism - Method Overriding

// Method Overriding means a child class provides
// its own implementation of a parent class method.

class PolyAnimal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class PolyDog extends PolyAnimal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class PolyCat extends PolyAnimal {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}


// 5. Parent Reference - Child Object

class PolyVehicle {

    void start() {
        System.out.println("Vehicle Starts");
    }
}

class PolyCar extends PolyVehicle {

    @Override
    void start() {
        System.out.println("Car Starts with Key");
    }
}

class PolyBike extends PolyVehicle {

    @Override
    void start() {
        System.out.println("Bike Starts with Button");
    }
}


// 6. Multiple Child Classes

class PolyEmployee {

    void work() {
        System.out.println("Employee Works");
    }
}

class PolyDeveloper extends PolyEmployee {

    @Override
    void work() {
        System.out.println("Developer Writes Code");
    }
}

class PolyTester extends PolyEmployee {

    @Override
    void work() {
        System.out.println("Tester Tests Software");
    }
}


// 7. Method Overriding with super

// super is used to access the parent class method.

class PolyShape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class PolyCircle extends PolyShape {

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing Circle");
    }
}

class PolyRectangle extends PolyShape {

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing Rectangle");
    }
}


// 8. Runtime Polymorphism using Interface

interface PolyPayment {

    void pay();
}

class PolyUPI implements PolyPayment {

    public void pay() {
        System.out.println("UPI Payment");
    }
}

class PolyCard implements PolyPayment {

    public void pay() {
        System.out.println("Card Payment");
    }
}


// 9. Polymorphism using Array

class PolyAnimalArray {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class PolyDogArray extends PolyAnimalArray {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class PolyCatArray extends PolyAnimalArray {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

class PolyCowArray extends PolyAnimalArray {

    @Override
    void sound() {
        System.out.println("Cow Moos");
    }
}


public class Polymorphism {

    public static void main(String[] args) {

        // 1. Method Overloading

        PolyCalculator c = new PolyCalculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(5.4, 6.5));


        // 2. Different Number of Parameters

        PolyDisplay d = new PolyDisplay();

        d.show();
        d.show("Arun");
        d.show("Arun", 21);


        // 3. Different Data Types

        PolyPrinter p = new PolyPrinter();

        p.print(100);
        p.print("Java");
        p.print(25.5);


        // 4. Runtime Polymorphism

        PolyAnimal a1 = new PolyDog();
        PolyAnimal a2 = new PolyCat();

        a1.sound();
        a2.sound();


        // 5. Parent Reference - Child Object

        PolyVehicle v1 = new PolyCar();
        PolyVehicle v2 = new PolyBike();

        v1.start();
        v2.start();


        // 6. Multiple Child Classes

        PolyEmployee e1 = new PolyDeveloper();
        PolyEmployee e2 = new PolyTester();

        e1.work();
        e2.work();


        // 7. super with Method Overriding

        PolyShape s1 = new PolyCircle();
        PolyShape s2 = new PolyRectangle();

        s1.draw();
        s2.draw();


        // 8. Interface Polymorphism

        PolyPayment p1 = new PolyUPI();
        PolyPayment p2 = new PolyCard();

        p1.pay();
        p2.pay();


        // 9. Polymorphism using Array

        PolyAnimalArray[] animals = {
            new PolyDogArray(),
            new PolyCatArray(),
            new PolyCowArray()
        };

        for (PolyAnimalArray animal : animals) {
            animal.sound();
        }
    }
}