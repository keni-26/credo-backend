import java.util.Random;

public class PracticeProblems {

    public static void main(String[] args) {

        // 1. Factorial

        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);


        // 2. Fibonacci Series

        int n = 10;

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();


        // 3. Armstrong Number

        int armstrongNumber = 153;
        int originalNumber = armstrongNumber;
        int armstrongSum = 0;

        while (armstrongNumber > 0) {

            int digit = armstrongNumber % 10;

            armstrongSum = armstrongSum + (digit * digit * digit);

            armstrongNumber = armstrongNumber / 10;
        }

        if (armstrongSum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }


        // 4. Prime Number

        int primeNumber = 29;
        boolean isPrime = true;

        if (primeNumber <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < primeNumber; i++) {

            if (primeNumber % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(primeNumber + " is a Prime Number");
        } else {
            System.out.println(primeNumber + " is not a Prime Number");
        }


        // 5. Reverse the Number

        int reverseNumber = 12345;
        int reversed = 0;

        while (reverseNumber > 0) {

            int digit = reverseNumber % 10;

            reversed = reversed * 10 + digit;

            reverseNumber = reverseNumber / 10;
        }

        System.out.println("Reversed Number = " + reversed);


        // 6. Reverse the String

        String name = "Java";
        String reversedString = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);
        }

        System.out.println("Reversed String = " + reversedString);


        // 7. Palindrome or Not a Palindrome

        int palindromeNumber = 121;
        int originalPalindrome = palindromeNumber;
        int reversePalindrome = 0;

        while (palindromeNumber > 0) {

            int digit = palindromeNumber % 10;

            reversePalindrome = reversePalindrome * 10 + digit;

            palindromeNumber = palindromeNumber / 10;
        }

        if (originalPalindrome == reversePalindrome) {
            System.out.println(originalPalindrome + " is a Palindrome");
        } else {
            System.out.println(originalPalindrome + " is not a Palindrome");
        }


        // 8. 4 Digit OTP Generator

        Random random = new Random();

        int otp4 = 1000 + random.nextInt(9000);

        System.out.println("4 Digit OTP = " + otp4);


        // 9. 6 Digit OTP Generator

        int otp6 = 100000 + random.nextInt(900000);

        System.out.println("6 Digit OTP = " + otp6);


        // 10. Random Password Generator

        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789"
                + "@#$%";

        String password = "";

        for (int i = 0; i < 10; i++) {

            int index = random.nextInt(characters.length());

            password = password + characters.charAt(index);
        }

        System.out.println("Random Password = " + password);


        // 11. EB Bill Calculator

        int units = 250;
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.5;
        } 
        else if (units <= 200) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } 
        else if (units <= 300) {
            bill = (100 * 1.5)
                    + (100 * 2.5)
                    + ((units - 200) * 4);
        } 
        else {
            bill = (100 * 1.5)
                    + (100 * 2.5)
                    + (100 * 4)
                    + ((units - 300) * 6);
        }

        System.out.println("EB Bill = ₹" + bill);


        // 12. Mobile Number Validation

        String mobileNumber = "9876543210";

        if (mobileNumber.matches("[6-9][0-9]{9}")) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }


        // 13. Check Letter is Alphabet or Not

        char letter = 'A';

        if ((letter >= 'A' && letter <= 'Z')
                || (letter >= 'a' && letter <= 'z')) {

            System.out.println(letter + " is an Alphabet");

        } else {
            System.out.println(letter + " is not an Alphabet");
        }


        // 14. Check Character is Number or Not

        char character = '7';

        if (character >= '0' && character <= '9') {
            System.out.println(character + " is a Number");
        } else {
            System.out.println(character + " is not a Number");
        }


        // 15. Vowel Checking

        char vowel = 'e';

        if (vowel == 'a'
                || vowel == 'e'
                || vowel == 'i'
                || vowel == 'o'
                || vowel == 'u'
                || vowel == 'A'
                || vowel == 'E'
                || vowel == 'I'
                || vowel == 'O'
                || vowel == 'U') {

            System.out.println(vowel + " is a Vowel");

        } else {
            System.out.println(vowel + " is not a Vowel");
        }


        // 16. Vowel Counting

        String word = "Programming";

        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch == 'a'
                    || ch == 'e'
                    || ch == 'i'
                    || ch == 'o'
                    || ch == 'u'
                    || ch == 'A'
                    || ch == 'E'
                    || ch == 'I'
                    || ch == 'O'
                    || ch == 'U') {

                vowelCount++;
            }
        }

        System.out.println("Vowel Count = " + vowelCount);


        // 17. Pattern Program

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }


        // 18. Separate Odd Numbers from 0 to 100

        System.out.print("Odd Numbers: ");

        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        // 19. Separate Even Numbers from 0 to 100

        System.out.print("Even Numbers: ");

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        // 20. Separate Prime Numbers from 0 to 100

        System.out.print("Prime Numbers: ");

        for (int number1 = 2; number1 <= 100; number1++) {

            boolean prime = true;

            for (int i = 2; i < number1; i++) {

                if (number1 % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(number1 + " ");
            }
        }

        System.out.println();


        // 21. Simple Interest Calculator

        double principal = 10000;
        double rate = 5;
        double time = 2;

        double simpleInterest =
                (principal * rate * time) / 100;

        System.out.println("Simple Interest = ₹" + simpleInterest);


        // 22. Compound Interest Calculator

        double compoundPrincipal = 10000;
        double compoundRate = 5;
        double compoundTime = 2;

        double compoundInterest =
                compoundPrincipal
                * Math.pow((1 + compoundRate / 100), compoundTime)
                - compoundPrincipal;

        System.out.println(
                "Compound Interest = ₹" + compoundInterest
        );


        // 23. PPF Calculator

        double ppfInvestment = 50000;
        double ppfRate = 7.1;
        int ppfYears = 15;

        double ppfAmount =
                ppfInvestment
                * (Math.pow(1 + ppfRate / 100, ppfYears));

        System.out.println("PPF Amount = ₹" + ppfAmount);


        // 24. RD Calculator

        double monthlyDeposit = 5000;
        double rdRate = 6.5;
        int rdYears = 5;

        int rdMonths = rdYears * 12;

        double rdInterest =
                monthlyDeposit
                * rdMonths
                * (rdMonths + 1)
                * rdRate / (2 * 12 * 100);

        double rdAmount =
                (monthlyDeposit * rdMonths) + rdInterest;

        System.out.println("RD Amount = ₹" + rdAmount);


        // 25. FD Calculator

        double fdPrincipal = 100000;
        double fdRate = 7;
        int fdYears = 3;

        double fdAmount =
                fdPrincipal
                * Math.pow(1 + fdRate / 100, fdYears);

        System.out.println("FD Amount = ₹" + fdAmount);


        // 26. GST Calculator

        double amount = 10000;
        double gstRate = 18;

        double gst =
                amount * gstRate / 100;

        double gstTotal =
                amount + gst;

        System.out.println("GST = ₹" + gst);
        System.out.println("Total Amount = ₹" + gstTotal);


        // 27. Loan EMI Calculator

        double loanAmount = 500000;
        double annualRate = 8.5;
        int loanYears = 5;

        double monthlyRate =
                annualRate / (12 * 100);

        int months = loanYears * 12;

        double emi =
                (loanAmount
                * monthlyRate
                * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Monthly EMI = ₹" + emi);


        // 28. Gram to Pavan

        double grams = 100;

        double pavan = grams / 8;

        System.out.println(
                grams + " grams = " + pavan + " Pavan"
        );


        // 29. Pavan to Gram

        double pavanValue = 5;

        double gramValue = pavanValue * 8;

        System.out.println(
                pavanValue + " Pavan = " + gramValue + " grams"
        );


        // 30. Kilometer to Miles

        double kilometers = 10;

        double miles = kilometers * 0.621371;

        System.out.println(
                kilometers + " KM = " + miles + " Miles"
        );


        // 31. Miles to Kilometer

        double milesValue = 10;

        double kilometerValue = milesValue * 1.60934;

        System.out.println(
                milesValue + " Miles = "
                + kilometerValue + " KM"
        );


        // 32. Odd or Even

        int oddEvenNumber = 25;

        if (oddEvenNumber % 2 == 0) {
            System.out.println(oddEvenNumber + " is Even");
        } else {
            System.out.println(oddEvenNumber + " is Odd");
        }


        // 33. Leap Year

        int year = 2024;

        if ((year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0)) {

            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is not a Leap Year");
        }


        // 34. Binary to Decimal

        String binary = "1010";

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {

            int digit = binary.charAt(i) - '0';

            decimal = decimal + digit * (int) Math.pow(2, power);

            power++;
        }

        System.out.println(
                "Binary " + binary + " = Decimal " + decimal
        );


        // 35. Decimal to Binary

        int decimalNumber = 10;

        String binaryResult = "";

        while (decimalNumber > 0) {

            int remainder = decimalNumber % 2;

            binaryResult = remainder + binaryResult;

            decimalNumber = decimalNumber / 2;
        }

        System.out.println(
                "Decimal 10 = Binary " + binaryResult
        );


        // 36. Octal to Decimal

        String octal = "12";

        int octalDecimal = 0;
        int octalPower = 0;

        for (int i = octal.length() - 1; i >= 0; i--) {

            int digit = octal.charAt(i) - '0';

            octalDecimal =
                    octalDecimal
                    + digit * (int) Math.pow(8, octalPower);

            octalPower++;
        }

        System.out.println(
                "Octal " + octal
                + " = Decimal " + octalDecimal
        );


        // 37. Decimal to Octal

        int decimalOctal = 10;

        String octalResult = "";

        while (decimalOctal > 0) {

            int remainder = decimalOctal % 8;

            octalResult = remainder + octalResult;

            decimalOctal = decimalOctal / 8;
        }

        System.out.println(
                "Decimal 10 = Octal " + octalResult
        );


        // 38. Decimal to Hexadecimal

        int decimalHex = 255;

        String hexResult = "";

        char[] hexCharacters = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };

        while (decimalHex > 0) {

            int remainder = decimalHex % 16;

            hexResult =
                    hexCharacters[remainder] + hexResult;

            decimalHex = decimalHex / 16;
        }

        System.out.println(
                "Decimal 255 = Hexadecimal " + hexResult
        );


        // 39. Linear Search

        int[] searchArray = {
                10, 20, 30, 40, 50
        };

        int searchValue = 30;

        boolean found = false;

        for (int i = 0; i < searchArray.length; i++) {

            if (searchArray[i] == searchValue) {

                System.out.println(
                        "Element Found at Index " + i
                );

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }


        // 40. Binary Search

        int[] binaryArray = {
                10, 20, 30, 40, 50, 60, 70
        };

        int target = 50;

        int left = 0;
        int right = binaryArray.length - 1;

        boolean binaryFound = false;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (binaryArray[middle] == target) {

                System.out.println(
                        "Element Found at Index " + middle
                );

                binaryFound = true;
                break;

            } else if (binaryArray[middle] < target) {

                left = middle + 1;

            } else {

                right = middle - 1;
            }
        }

        if (!binaryFound) {
            System.out.println("Element Not Found");
        }


        // 41. Bubble Sort

        int[] sortArray = {
                50, 20, 40, 10, 30
        };

        for (int i = 0; i < sortArray.length - 1; i++) {

            for (int j = 0;
                 j < sortArray.length - 1 - i;
                 j++) {

                if (sortArray[j] > sortArray[j + 1]) {

                    int temp = sortArray[j];

                    sortArray[j] = sortArray[j + 1];

                    sortArray[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");

        for (int number2 : sortArray) {
            System.out.print(number2 + " ");
        }

        System.out.println();
    }
}