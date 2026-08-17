class Day1{
    public static void main (String args[]){
        System.out.println("Welcome to Java Programming");
        
        String name = "Kenisha";
        int age = 21;
        float cgpa = 8.5f;

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("CGPA : " + cgpa);

        int Employee_age = 25;
        int _salary = 30000;
        int $bonus = 5000;

        System.out.println("Employee Age : " + Employee_age);
        System.out.println("Salary : " + _salary);
        System.out.println("Bonus : " + $bonus);

        char letter = 65;
        System.out.println(letter);
        byte temperature = -10;
        System.out.println("Temperature : " + temperature);
        short population = 30000;
        System.out.println("Population : " + population);
        double distance = 12345.6789;
        System.out.println("Distance : " + distance);


        System.out.println("ARITHMETIC OPERATIONS");

        int num1 = 20;
        int num2 = 6;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Addition : " + addition);
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division : " + division);
        System.out.println("Remainder : " + remainder);




        System.out.println("ASSIGNMENT OPERATIONS");

        int num = 10;

        System.out.println("Original value : " + num);

        num += 5;
        System.out.println("After += 5 : " + num);

        num -= 3;
        System.out.println("After -= 3 : " + num);

        num *= 2;
        System.out.println("After *= 2 : " + num);

        num /= 4;
        System.out.println("After /= 4 : " + num);

        num %= 3;
        System.out.println("After %= 3 : " + num);




        System.out.println("RELATIONAL OPERATIONS");

        int n1 = 20;
        int n2 = 6;

        System.out.println("n1 > n2 : " + (n1 > n2));
        System.out.println("n1 < n2 : " + (n1 < n2));
        System.out.println("n1 >= n2 : " + (n1 >= n2));
        System.out.println("n1 <= n2 : " + (n1 <= n2));
        System.out.println("n1 == n2 : " + (n1 == n2));
        System.out.println("n1 != n2 : " + (n1 != n2));

                System.out.println("LOGICAL OPERATIONS");

        int Age = 21;
        int salary = 30000;

        // Logical AND (&&)
        System.out.println("Age >= 18 && salary >= 25000 : " + (Age >= 18 && salary >= 25000));

        // Logical OR (||)
        System.out.println("Age < 18 || salary > 25000 : " + (Age < 18 || salary > 25000));

        // Logical NOT (!)
        System.out.println("!(Age >= 18) : " + !(Age >= 18));



        System.out.println("INCREMENT AND DECREMENT OPERATIONS");

        int a = 5;

        // Pre-Increment
        int b = ++a;

        System.out.println("After Pre-Increment:");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);


        // Post-Increment
        int c = a++;

        System.out.println("After Post-Increment:");
        System.out.println("Value of a : " + a);
        System.out.println("Value of c : " + c);


        // Pre-Decrement
        int d = --a;

        System.out.println("After Pre-Decrement:");
        System.out.println("Value of a : " + a);
        System.out.println("Value of d : " + d);


        // Post-Decrement
        int e = a--;

        System.out.println("After Post-Decrement:");
        System.out.println("Value of a : " + a);
        System.out.println("Value of e : " + e);





    }
}