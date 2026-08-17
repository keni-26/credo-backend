class Variables_Datatype {
    public static void main(String[]args){

        System.out.println("Students Detail");
        int student_id=252043;
        String name = "Kenisha";
        int age = 21;
        String course = "Java Programming";
        System.out.println("Student ID : " + student_id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);

        System.out.println("----------------");

        System.out.println("Employees Detail");
        int Employee_id=102058;
        int Employee_age = 26;
        int salary = 30000;
        int department = 5000;

        System.out.println("Employee ID : " + Employee_id);
        System.out.println("Employee Age : " + Employee_age);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);

        System.out.println("----------------");

        System.out.println("Sum of two integer");

        int num1=10;
        int num2=30;
        int num3=15;
        System.out.println("Sum:"+(num1+num2));

        System.out.println("Average of three integer");

        System.out.println("Average:"+(num1+num2+num3)/3);

        System.out.println("----------------");

        System.out.println("Area and perimeter of a rectangle.");

        int length = 10;
        int width = 5;
        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);

        System.out.println("----------------");

        System.out.println("Area and circumference of a circle.");

        double radius = 7.5;
        double area_circle = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;

        System.out.println("Area : " + area_circle);
        System.out.println("Circumference : " + circumference);

        System.out.println("----------------");

        System.out.println("Swap two numbers using a temporary variable.");

        int a=5;
        int b=10;
        System.out.println("Before swapping: a = " + a + ", b = " +b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping: a = " + a + ", b = " +b);

        System.out.println("----------------");

        System.out.println("Swap two numbers without using a temporary variable.");

        System.out.println("Before swapping: a = " + a + ", b = " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a + ", b = " +b);

        System.out.println("----------------");

        System.out.println("Demonstrate implicit and explicit type casting.");

        int intValue = 10;
        double doubleValue = intValue; // Implicit type casting
        System.out.println("Implicit Type Casting: " + doubleValue);

        // Explicit type casting
        double d = 10.5;
        int i = (int) d; // Explicit type casting
        System.out.println("Explicit Type Casting: " + i);

        System.out.println("----------------");

        System.out.println("Convert temperature from Celsius to Fahrenheit.");

        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

    }
    
}
