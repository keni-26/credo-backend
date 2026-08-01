class ifStatement {
    public static void main(String[] args) {

        System.out.println("Check whether a number is positive");

        int number = 25;

        if (number > 0) {
            System.out.println(number + " is a positive number");
        }

        System.out.println("-----------");

        System.out.println("Check voting eligibility");

        int age = 21;

        if (age >= 18) {
            System.out.println("Person is eligible to vote");
        }

        System.out.println("-----------");

        System.out.println("Check whether student scored above 90");

        int marks = 95;

        if (marks > 90) {
            System.out.println("Student scored above 90 marks");
        }

        System.out.println("-----------");

        System.out.println("Check whether salary is greater than Rs. 50,000");

        int salary = 60000;

        if (salary > 50000) {
            System.out.println("Salary is greater than Rs. 50,000");
        }

        System.out.println("-----------");

        System.out.println("Check whether temperature is above 40°C");

        int temperature = 45;

        if (temperature > 40) {
            System.out.println("Temperature is above 40°C");
        }

        System.out.println("-----------");

        System.out.println("Check whether number is positive or negative");

        int value = -10;

        if (value > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}