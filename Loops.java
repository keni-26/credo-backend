class Loop {
    public static void main(String[] args) {

  
        // 1. Print numbers from 1 to 100 using for loop


        System.out.println("Numbers from 1 to 100");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------------");


        // 2. Print numbers from 100 to 1 using while loop
 

        System.out.println("Numbers from 100 to 1");

        int i = 100;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        System.out.println("-----------------------------");


        // 3. Print all even numbers between 1 and 100


        System.out.println("Even numbers between 1 and 100");

        for (int number = 1; number <= 100; number++) {

            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("-----------------------------");



        // 4. Print all odd numbers between 1 and 100


        System.out.println("Odd numbers between 1 and 100");

        for (int number = 1; number <= 100; number++) {

            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        System.out.println("-----------------------------");


       
        // 5. Find the sum of first N natural numbers
      

        System.out.println("Sum of First N Natural Numbers");

        int n = 10;
        int sum = 0;

        for (int number = 1; number <= n; number++) {
            sum = sum + number;
        }

        System.out.println("N = " + n);
        System.out.println("Sum = " + sum);

        System.out.println("-----------------------------");


        
        // 6. Calculate factorial of a given number
    
        System.out.println("Factorial of a Number");

        int factorialNumber = 5;
        int factorial = 1;

        for (int number = 1; number <= factorialNumber; number++) {
            factorial = factorial * number;
        }

        System.out.println("Number = " + factorialNumber);
        System.out.println("Factorial = " + factorial);

        System.out.println("-----------------------------");


        // 7. Reverse a given number
       

        System.out.println("Reverse a Number");

        int originalNumber = 12345;
        int reverse = 0;
        int temp = originalNumber;

        while (temp != 0) {

            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Original Number = " + originalNumber);
        System.out.println("Reverse = " + reverse);

        System.out.println("-----------------------------");


      
        // 8. Check whether a number is palindrome
   

        System.out.println("Palindrome Number");

        int palindromeNumber = 121;
        int original = palindromeNumber;
        int reversedNumber = 0;

        while (palindromeNumber != 0) {

            int digit = palindromeNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            palindromeNumber = palindromeNumber / 10;
        }

        if (original == reversedNumber) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        System.out.println("-----------------------------");


        
        // 9. Count the number of digits in an integer
      

        System.out.println("Count Number of Digits");

        int countNumber = 123456;
        int count = 0;
        int tempNumber = countNumber;

        while (tempNumber != 0) {

            tempNumber = tempNumber / 10;
            count++;
        }

        System.out.println("Number = " + countNumber);
        System.out.println("Number of digits = " + count);

        System.out.println("-----------------------------");


    
        // 10. Find the sum of digits of a number
        

        System.out.println("Sum of Digits");

        int digitNumber = 12345;
        int digitSum = 0;
        int temporaryNumber = digitNumber;

        while (temporaryNumber != 0) {

            int digit = temporaryNumber % 10;
            digitSum = digitSum + digit;
            temporaryNumber = temporaryNumber / 10;
        }

        System.out.println("Number = " + digitNumber);
        System.out.println("Sum of digits = " + digitSum);

        System.out.println("-----------------------------");


        
        // 11. Multiplication table
      

        System.out.println("Multiplication Table");

        int tableNumber = 5;

        for (int multiplier = 1; multiplier <= 10; multiplier++) {

            int result = tableNumber * multiplier;

            System.out.println(
                tableNumber + " x " + multiplier + " = " + result
            );
        }

        System.out.println("-----------------------------");


       
        // 12. Fibonacci Series up to N terms
        

        System.out.println("Fibonacci Series");

        int terms = 10;

        int first = 0;
        int second = 1;

        for (int position = 1; position <= terms; position++) {

            System.out.println(first);

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println("-----------------------------");


        // 13. Check whether a number is prime
     

        System.out.println("Check Prime Number");

        int primeNumber = 29;
        boolean isPrime = true;

        if (primeNumber <= 1) {
            isPrime = false;
        } else {

            for (int divisor = 2; divisor < primeNumber; divisor++) {

                if (primeNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(primeNumber + " is a prime number");
        } else {
            System.out.println(primeNumber + " is not a prime number");
        }

        System.out.println("-----------------------------");


        // 14. Print all prime numbers between 1 and 100


        System.out.println("Prime Numbers between 1 and 100");

        for (int number = 2; number <= 100; number++) {

            boolean prime = true;

            for (int divisor = 2; divisor < number; divisor++) {

                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(number);
            }
        }
    }
}