// Constructor
// A Constructor is a special member of a Java class used to
// initialize an object when the object is created.

// Types of Constructor
// 1. Default Constructor
// 2. No-Argument Constructor
// 3. Parameterized Constructor
// 4. Copy Constructor

class Student {

    String name = "Sridhar";
    int age = 28;
}


class StudentDefault {

    String name;
    int age;
}


class StudentNoArgument {

    String name;
    int age;

    // No-Argument Constructor
    // A constructor written by the programmer
    // without parameters is called a no-argument constructor.

    StudentNoArgument() {

        System.out.println("Student Constructor Called");
    }
}


class StudentInitialize {

    String name;
    int age;

    // Constructor Initializing Variables

    StudentInitialize() {

        name = "Sridhar";
        age = 28;
    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


class StudentParameterized {

    String name;
    int age;

    // Parameterized Constructor
    // A Constructor that accepts parameters is called
    // Parameterized Constructor.

    StudentParameterized(String n, int a) {

        name = n;
        age = a;
    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


class StudentThis {

    String name;
    int age;

    // Using this Keyword
    // this refers to the current object.

    StudentThis(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


class StudentConstructorOverloading {

    String name;
    int age;
    String course;

    // Constructor Overloading
    // Creating multiple constructors in the same class
    // with different parameters is called Constructor Overloading.

    StudentConstructorOverloading() {

        name = "Sridhar";
        age = 28;
        course = "Java";
    }

    StudentConstructorOverloading(String name, int age) {

        this.name = name;
        this.age = age;
        course = "Java";
    }

    StudentConstructorOverloading(String name, int age, String course) {

        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
    }
}


class StudentCopy {

    String name;
    int age;

    StudentCopy(String name, int age) {

        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    // A constructor that creates a new object
    // by copying values from another object.

    StudentCopy(StudentCopy student) {

        this.name = student.name;
        this.age = student.age;
    }

    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


public class Constructor {

    public static void main(String[] args) {


        // 1. Default Constructor

        // Default Constructor
        // If you don't write any constructor,
        // Java compiler provides a default constructor automatically.

        Student s1 = new Student();

        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);


        System.out.println("--------------------");


        // 2. Default Values

        StudentDefault s2 = new StudentDefault();

        System.out.println("Name : " + s2.name);
        System.out.println("Age : " + s2.age);


        System.out.println("--------------------");


        // 3. No-Argument Constructor

        StudentNoArgument s3 = new StudentNoArgument();


        System.out.println("--------------------");


        // 4. Constructor Initializing Variables

        StudentInitialize s4 = new StudentInitialize();

        s4.display();


        System.out.println("--------------------");


        // 5. Parameterized Constructor

        StudentParameterized s5 =
                new StudentParameterized("Priya", 27);

        s5.display();


        System.out.println("--------------------");


        // 6. Parameterized Constructor - Multiple Objects

        StudentParameterized s6 =
                new StudentParameterized("Priya", 27);

        StudentParameterized s7 =
                new StudentParameterized("Ravi", 30);

        StudentParameterized s8 =
                new StudentParameterized("Rani", 25);

        s6.display();

        System.out.println();

        s7.display();

        System.out.println();

        s8.display();


        System.out.println("--------------------");


        // 7. Using this Keyword

        StudentThis s9 =
                new StudentThis("Rahul", 25);

        s9.display();


        System.out.println("--------------------");


        // 8. Constructor Overloading

        StudentConstructorOverloading s10 = new StudentConstructorOverloading();

        s10.display();

        System.out.println();

        StudentConstructorOverloading s11 =  new StudentConstructorOverloading("Priya", 27);

        s11.display();

        System.out.println();

        StudentConstructorOverloading s12 = new StudentConstructorOverloading( "Ravi", 30, "Python" );

        s12.display();


        System.out.println("--------------------");


        // 9. Copy Constructor

        StudentCopy s13 =
                new StudentCopy("Arun", 24);

        StudentCopy s14 =
                new StudentCopy(s13);

        System.out.println("Original Object");

        s13.display();

        System.out.println();

        System.out.println("Copied Object");

        s14.display();
    }
}