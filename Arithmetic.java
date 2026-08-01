class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int modulus = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);

        System.out.println("-----------");

        System.out.println("Total and average of 5 subject marks");
        
        int mark1 = 85;
        int mark2 = 92;
        int mark3 = 78;
        int mark4 = 96;
        int mark5 = 88;

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        System.out.println("-----------");

        System.out.println("Square and cube of a number");

        int number=4;
        int square= number * number;
        int cube = number * number * number;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);

        System.out.println("-----------");

        System.out.println("Simple Interest");

        double principal = 1000.0;
        double rate = 5.0;
        double time = 3.0;

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        System.out.println("-----------");

        System.out.println("Compound Interest");

        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
        System.out.println("Compound Interest: " + compoundInterest);
    }
    
}
