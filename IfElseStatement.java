class IfElseStatement {
    public static void main(String[] args) {

        System.out.println("Check whether number is even or odd");

        int number = 25;

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        System.out.println("-----------");

        System.out.println("Check whether student is pass or fail");

        int marks = 65;

        if (marks >= 40) {
            System.out.println("Student has passed");
        } else {
            System.out.println("Student has failed");
        }

        System.out.println("-----------");

        System.out.println("Find the maximum of two numbers");

        int a = 50;
        int b = 80;

        if (a > b) {
            System.out.println(a + " is the maximum");
        } else {
            System.out.println(b + " is the maximum");
        }

        System.out.println("-----------");

        System.out.println("Check whether character is uppercase or lowercase");

        char character = 'A';

        if (character >= 'A' && character <= 'Z') {
            System.out.println(character + " is uppercase");
        } else {
            System.out.println(character + " is lowercase");
        }

        System.out.println("-----------");

        System.out.println("Check whether year is a leap year");

        int year = 2024;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}