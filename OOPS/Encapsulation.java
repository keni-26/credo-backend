// Encapsulation

// Encapsulation is the process of wrapping
// data (variables) and methods into a single unit (class).

// It is mainly achieved by:
// 1. Making variables private
// 2. Providing public getter and setter methods

// Private variables cannot be directly accessed from outside the class.
// Getter is used to read the value.
// Setter is used to modify the value.


// 1. Basic Encapsulation

class BankAccount {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}


// 2. Encapsulation with Validation

class Person {

    private int age;

    public void setAge(int age) {

        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public int getAge() {
        return age;
    }
}


// 3. Encapsulation with Multiple Variables

class Product {

    private int id;
    private String name;
    private double price;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }

    public double getPrice() {
        return price;
    }
}


// 4. Real-Time Example - Login

class Login {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password) {

        return this.password.equals(password);
    }
}


// 5. Encapsulation with Business Validation

class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {

        if (salary >= 15000) {
            this.salary = salary;
        } else {
            System.out.println("Minimum salary should be 15000");
        }
    }

    public double getSalary() {
        return salary;
    }
}


// Main Class

public class Encapsulation {

    public static void main(String[] args) {

        // 1. Basic Encapsulation

        BankAccount account = new BankAccount();

        account.setBalance(50000);

        System.out.println("Balance: " + account.getBalance());


        // 2. Encapsulation with Validation

        Person person = new Person();

        person.setAge(25);

        System.out.println("Age: " + person.getAge());


        // 3. Multiple Variables

        Product product = new Product();

        product.setId(101);
        product.setName("Laptop");
        product.setPrice(55000);

        System.out.println("ID: " + product.getId());
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());


        // 4. Login Example

        Login login = new Login();

        login.setUsername("admin");
        login.setPassword("12345");

        System.out.println("Username: " + login.getUsername());

        if (login.checkPassword("12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Password");
        }


        // 5. Employee with Validation

        Employee employee = new Employee();

        employee.setName("Arun");
        employee.setSalary(30000);

        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}