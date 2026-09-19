class Ternary {
    public static void main(String[] args) {

        System.out.println("Find the larger of two numbers");

        int a = 50;
        int b = 80;

        int larger = (a > b) ? a : b;

        System.out.println("Larger number: " + larger);

        System.out.println("-----------");

        System.out.println("Check whether number is even or odd");

        int number = 25;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }
}