// Inheritance

// Inheritance is an OOPS Concept
// where one class acquires the Properties (Variables) and Behaviors (Methods)
// of another class.

// It helps with
// 1. Code reusability
// 2. Method overriding
// 3. Creating parent-child relationships

// Parent Class -> Super Class, Base Class
// Child Class -> Sub Class, Derived Class

// Types of Inheritance
// 1. Single Inheritance - Parent -> Child
// 2. Multilevel Inheritance - GrandParent -> Parent -> Child
// 3. Hierarchical Inheritance - One Parent Class has Multiple Child Classes


// 1. Single Inheritance - Animal and Dog

class Animal {

    void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }
}


// 2. Single Inheritance - Vehicle and Car

class Vehicle {

    void start() {
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is Driving");
    }
}


// 3. Single Inheritance - Person and Student

class Person {

    String name = "Kenisha";

    void displayName() {
        System.out.println("Name : " + name);
    }
}

class Student extends Person {

    int marks = 90;

    void displayMark() {
        System.out.println("Mark : " + marks);
    }
}


// 4. Multilevel Inheritance - Animal -> Dog -> Puppy

class Animal1 {

    void eat() {
        System.out.println("Animal Eats");
    }
}

class Dog1 extends Animal1 {

    void bark() {
        System.out.println("Dog Barks");
    }
}

class Puppy extends Dog1 {

    void play() {
        System.out.println("Puppy Plays");
    }
}


// 5. Multilevel Inheritance - Person -> Employee -> Manager

class Person1 {

    void speak() {
        System.out.println("Person Speaks");
    }
}

class Employee extends Person1 {

    void work() {
        System.out.println("Employee Works");
    }
}

class Manager extends Employee {

    void manage() {
        System.out.println("Manager Manages");
    }
}


// 6. Hierarchical Inheritance - Employee -> Developer / Tester

class Employee1 {

    void work() {
        System.out.println("Employee Works");
    }
}

class Developer extends Employee1 {

    void coding() {
        System.out.println("Developer Writes Code");
    }
}

class Tester extends Employee1 {

    void testing() {
        System.out.println("Tester Tests Software");
    }
}


public class inheritance {

    public static void main(String[] args) {


        // 1. Single Inheritance

        Dog d1 = new Dog();

        d1.eat();
        d1.bark();


        System.out.println("--------------------");


        // 2. Single Inheritance - Vehicle and Car

        Car c1 = new Car();

        c1.start();
        c1.drive();


        System.out.println("--------------------");


        // 3. Single Inheritance - Person and Student

        Student s1 = new Student();

        s1.displayName();
        s1.displayMark();


        System.out.println("--------------------");


        // 4. Multilevel Inheritance - Animal -> Dog -> Puppy

        Puppy p1 = new Puppy();

        p1.eat();
        p1.bark();
        p1.play();


        System.out.println("--------------------");


        // 5. Multilevel Inheritance - Person -> Employee -> Manager

        Manager m1 = new Manager();

        m1.speak();
        m1.work();
        m1.manage();


        System.out.println("--------------------");


        // 6. Hierarchical Inheritance

        Developer developer = new Developer();

        developer.work();
        developer.coding();


        System.out.println();


        Tester tester = new Tester();

        tester.work();
        tester.testing();
    }
}