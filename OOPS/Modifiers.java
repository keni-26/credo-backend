// OOPS - Modifiers

// A modifier is a keyword used to control the access,
// behavior and properties of a class, variable, method or constructor.

// Public -> accessible from anywhere
// Private -> accessible only inside the same class
// Protected -> accessible within the same package and subclasses
// Final -> value, method or class cannot be changed/overridden/inherited


// 1. Public Modifier

class ModPublicStudent {

    public String name = "Sridhar";

    public void display() {
        System.out.println("Name: " + name);
    }
}


// 2. Private Modifier

class ModPrivateEmployee {

    private int salary = 25000;

    public int getSalary() {
        return salary;
    }
}


// 3. Private Method

class ModPrivateCalculator {

    private void add() {

        int a = 50;
        int b = 20;

        System.out.println("Addition: " + (a + b));
    }

    void calculator() {
        add();
    }
}


// 4. Protected Modifier

class ModEmployee {

    protected int salary = 30000;
}

class ModManager extends ModEmployee {

    void display() {
        System.out.println("Salary: " + salary);
    }
}


// 5. Protected Variable with Inheritance

class ModPerson {

    protected String name = "Credo Systemz";
}

class ModStudent extends ModPerson {

    void display() {
        System.out.println("Course Center: " + name);
    }
}


// 6. Final Variable

class ModFinalExample {

    final int number = 100;

    final void display() {
        System.out.println("Final Method");
    }
}


public class Modifiers {

    public static void main(String[] args) {

        // 1. Public Modifier

        ModPublicStudent student = new ModPublicStudent();

        System.out.println(student.name);
        student.display();


        // 2. Private Modifier

        ModPrivateEmployee employee = new ModPrivateEmployee();

        System.out.println(employee.getSalary());


        // 3. Private Method

        ModPrivateCalculator calculator = new ModPrivateCalculator();

        calculator.calculator();


        // 4. Protected Modifier

        ModManager manager = new ModManager();

        manager.display();


        // 5. Protected Variable with Inheritance

        ModStudent modStudent = new ModStudent();

        modStudent.display();


        // 6. Final Modifier

        ModFinalExample finalExample = new ModFinalExample();

        System.out.println(finalExample.number);
        finalExample.display();
    }
}