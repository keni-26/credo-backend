class IfElseIfLadder {
    public static void main(String[] args) {

        System.out.println("Student Grade");

        int marks = 85;

        if (marks >= 90 && marks <= 100) {
            System.out.println("A Grade");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("B Grade");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("C Grade");
        } else if (marks >= 50 && marks <= 69) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }

        System.out.println("-----------");

        System.out.println("Salary Category");

        int salary = 60000;

        if (salary >= 100000) {
            System.out.println("High Salary");
        } else if (salary >= 50000) {
            System.out.println("Medium Salary");
        } else {
            System.out.println("Low Salary");
        }

        System.out.println("-----------");

        System.out.println("Find the largest of three numbers");

        int a = 50;
        int b = 80;
        int c = 70;

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }

        System.out.println("-----------");

        System.out.println("Income Tax Slab");

        double income = 800000;

        if (income <= 300000) {
            System.out.println("No Tax");
        } else if (income <= 600000) {
            System.out.println("5% Tax");
        } else if (income <= 900000) {
            System.out.println("10% Tax");
        } else if (income <= 1200000) {
            System.out.println("20% Tax");
        } else {
            System.out.println("30% Tax");
        }

        System.out.println("-----------");

        System.out.println("Ticket Price Based on Age");

        int age = 25;

        if (age < 5) {
            System.out.println("Ticket Price: Rs. 0");
        } else if (age <= 12) {
            System.out.println("Ticket Price: Rs. 50");
        } else if (age <= 59) {
            System.out.println("Ticket Price: Rs. 100");
        } else {
            System.out.println("Ticket Price: Rs. 60");
        }
    }
}