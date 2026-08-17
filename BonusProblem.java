class Problems {
    public static void main(String[] args) {

        
        // 1. Display the day name based on day number using switch
     

        System.out.println("Day Name");

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        System.out.println("-------------------------");


        // 2. Display the month name using switch


        System.out.println("Month Name");

        int month = 8;

        switch (month) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid Month");
        }

        System.out.println("-------------------------");


        // 3. Find the smallest of three numbers
     

        System.out.println("Smallest of Three Numbers");

        int a = 25;
        int b = 15;
        int c = 35;

        if (a <= b && a <= c) {
            System.out.println(a + " is the smallest");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is the smallest");
        } else {
            System.out.println(c + " is the smallest");
        }

        System.out.println("-------------------------");


        // 4. Check whether a number is divisible by 5
      

        System.out.println("Divisible by 5");

        int number = 25;

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is not divisible by 5");
        }

        System.out.println("-------------------------");


        // 5. Check whether a number is divisible by both 3 and 5


        System.out.println("Divisible by 3 and 5");

        int num = 30;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5");
        } else {
            System.out.println(num + " is not divisible by both 3 and 5");
        }

        System.out.println("-------------------------");


        // 6. Find the absolute value of a number


        System.out.println("Absolute Value");

        int value = -15;

        if (value < 0) {
            value = -value;
        }

        System.out.println("Absolute Value = " + value);

        System.out.println("-------------------------");


        // 7. Check whether a character is a vowel or consonant


        System.out.println("Vowel or Consonant");

        char ch = 'e';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }

        System.out.println("-------------------------");


        // 8. Alphabet, Digit or Special Character


        System.out.println("Alphabet, Digit or Special Character");

        char character = '#';

        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            System.out.println("Alphabet");
        } else if (character >= '0' && character <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        System.out.println("-------------------------");


        // 9. Maximum among four numbers


        System.out.println("Maximum of Four Numbers");

        int n1 = 12;
        int n2 = 45;
        int n3 = 22;
        int n4 = 65;

        int max = n1;

        if (n2 > max) max = n2;
        if (n3 > max) max = n3;
        if (n4 > max) max = n4;

        System.out.println("Maximum = " + max);

        System.out.println("-------------------------");


        // 10. Electricity Bill
   

        System.out.println("Electricity Bill");

        int units = 250;
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = units * 3;
        } else {
            bill = units * 5;
        }

        System.out.println("Bill = Rs. " + bill);

        System.out.println("-------------------------");


        // 11. Mobile Recharge Discount


        System.out.println("Mobile Recharge Discount");

        double recharge = 600;
        double discount;

        if (recharge >= 500) {
            discount = recharge * 0.20;
        } else if (recharge >= 300) {
            discount = recharge * 0.10;
        } else {
            discount = 0;
        }

        System.out.println("Discount = Rs. " + discount);

        System.out.println("-------------------------");


        // 12. Movie Ticket Category
    

        System.out.println("Movie Ticket Category");

        int age = 15;

        if (age < 5) {
            System.out.println("Free Ticket");
        } else if (age <= 12) {
            System.out.println("Child Ticket");
        } else if (age <= 59) {
            System.out.println("Adult Ticket");
        } else {
            System.out.println("Senior Citizen Ticket");
        }

        System.out.println("-------------------------");


        // 13. BMI Category
 

        System.out.println("BMI Category");

        double weight = 65;
        double height = 1.70;

        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        System.out.println("-------------------------");


        // 14. Net Salary After Tax
    

        System.out.println("Net Salary");

        double salary = 50000;
        double tax = salary * 0.10;
        double netSalary = salary - tax;

        System.out.println("Net Salary = Rs. " + netSalary);

        System.out.println("-------------------------");


        // 15. Blood Donation Eligibility

        System.out.println("Blood Donation Eligibility");

        int donorAge = 25;
        int donorWeight = 60;

        if (donorAge >= 18 && donorAge <= 60 && donorWeight >= 50) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        System.out.println("-------------------------");


        // 16. Driving License Eligibility
  

        System.out.println("Driving License Eligibility");

        int driverAge = 20;

        if (driverAge >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        System.out.println("-------------------------");


        // 17. Display Season Name using switch
  

        System.out.println("Season Name");

        int seasonMonth = 12;

        switch (seasonMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Monsoon");
                break;

            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Invalid Month");
        }

        System.out.println("-------------------------");


        // 18. Department Name using switch
  

        System.out.println("Department Name");

        int deptCode = 102;

        switch (deptCode) {
            case 101:
                System.out.println("Human Resources");
                break;
            case 102:
                System.out.println("Finance");
                break;
            case 103:
                System.out.println("IT");
                break;
            case 104:
                System.out.println("Sales");
                break;
            default:
                System.out.println("Invalid Department Code");
        }

        System.out.println("-------------------------");


        // 19. Shopping Bill with Discount
    
        System.out.println("Shopping Bill");

        double amount = 5000;
        double finalAmount;

        if (amount >= 5000) {
            finalAmount = amount - (amount * 0.20);
        } else if (amount >= 2000) {
            finalAmount = amount - (amount * 0.10);
        } else {
            finalAmount = amount;
        }

        System.out.println("Final Bill = Rs. " + finalAmount);

        System.out.println("-------------------------");


        // 20. Restaurant Menu using switch


        System.out.println("Restaurant Menu");

        int choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Idli - Rs.40");
                break;
            case 2:
                System.out.println("Dosa - Rs.70");
                break;
            case 3:
                System.out.println("Fried Rice - Rs.120");
                break;
            case 4:
                System.out.println("Biryani - Rs.180");
                break;
            case 5:
                System.out.println("Meals - Rs.150");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}