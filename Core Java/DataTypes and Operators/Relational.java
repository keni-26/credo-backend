class Relational{
    public static void main(String[] args) {

        System.out.println("Compare two numbers and display the greater number");

        int a = 25;
        int b = 40;

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }

        System.out.println("-----------");

        System.out.println("Check whether two numbers are equal");

        int number1 = 25;
        int number2 = 25;

        if (number1 == number2) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Both numbers are not equal");
        }

        System.out.println("-----------");

        System.out.println("Find the largest of three numbers");

        int x = 25;
        int y = 40;
        int z = 30;

        if (x > y && x > z) {
            System.out.println(x + " is the largest");
        } else if (y > x && y > z) {
            System.out.println(y + " is the largest");
        } else {
            System.out.println(z + " is the largest");
        }

        System.out.println("-----------");

        System.out.println("Check whether a number is greater than 100");

        int number = 150;

        if (number > 100) {
            System.out.println(number + " is greater than 100");
        } else {
            System.out.println(number + " is not greater than 100");
        }

        System.out.println("-----------");

        System.out.println("Check whether a number is less than or equal to 50");

        int value = 45;

        if (value <= 50) {
            System.out.println(value + " is less than or equal to 50");
        } else {
            System.out.println(value + " is greater than 50");
        }
    }
}