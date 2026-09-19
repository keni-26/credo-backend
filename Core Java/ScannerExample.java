import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Positive, Negative or Zero

        System.out.println("Enter Number: ");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive Value");
        } 
        else if (number < 0) {
            System.out.println("Negative Value");
        } 
        else {
            System.out.println("Zero");
        }


        // 2. Even or Odd

        System.out.println("Enter Number: ");

        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " - Even Number");
        } 
        else {
            System.out.println(number + " - Odd Number");
        }


        // 3. Addition of Two Numbers

        System.out.println("Enter First Number: ");

        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");

        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("SUM - " + sum);


        // 4. Read Name

        System.out.println("Enter Name: ");

        String name = sc.next();

        System.out.println("Name - " + name);


        // 5. Read Number

        System.out.println("Enter Number: ");

        int num = sc.nextInt();

        System.out.println("Number - " + num);


        // 6. Read Full Name

        sc.nextLine();

        System.out.println("Enter Full Name: ");

        String fullName = sc.nextLine();

        System.out.println("Full Name - " + fullName);


        sc.close();
    }
}