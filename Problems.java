class Problems {
    public static void main(String[] args) {


        System.out.println("Celsius to Fahrenheit");

        double celsius = 30;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        System.out.println("-----------------------------");


        System.out.println("Kilometer to Miles");

        double kilometer = 10;
        double miles = kilometer * 0.621371;

        System.out.println("Kilometers: " + kilometer);
        System.out.println("Miles: " + miles);

        System.out.println("-----------------------------");


        System.out.println("Miles to Kilometer");

        double mile = 5;
        double kilometers = mile * 1.60934;

        System.out.println("Miles: " + mile);
        System.out.println("Kilometers: " + kilometers);

        System.out.println("-----------------------------");

        System.out.println("Time Calculator");

        int totalSeconds = 3665;

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Total Seconds: " + totalSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        System.out.println("-----------------------------");


        System.out.println("Distance Calculator");

        double speed = 60;     // km/hr
        double time = 2.5;     // hours

        double distance = speed * time;

        System.out.println("Speed: " + speed + " km/hr");
        System.out.println("Time: " + time + " hours");
        System.out.println("Distance: " + distance + " km");

        System.out.println("-----------------------------");



        System.out.println("Salary Calculator");

        double basicSalary = 30000;
        double hra = 5000;
        double da = 3000;

        double grossSalary = basicSalary + hra + da;

        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Gross Salary: Rs. " + grossSalary);

        System.out.println("-----------------------------");



        System.out.println("Simple Interest");

        double principal = 100000;
        double rate = 8;
        double years = 2;

        double simpleInterest = (principal * rate * years) / 100;

        System.out.println("Principal: Rs. " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + years + " years");
        System.out.println("Simple Interest: Rs. " + simpleInterest);

        System.out.println("-----------------------------");


        System.out.println("Area of Square");

        double side = 6;
        double squareArea = side * side;

        System.out.println("Side: " + side);
        System.out.println("Area: " + squareArea);

        System.out.println("-----------------------------");



        System.out.println("Area of Rectangle");

        double length = 10;
        double breadth = 5;

        double rectangleArea = length * breadth;

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + rectangleArea);

        System.out.println("-----------------------------");



        System.out.println("Area of Triangle");

        double base = 12;
        double height = 8;

        double triangleArea = 0.5 * base * height;

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + triangleArea);

        System.out.println("-----------------------------");



        System.out.println("Area of Circle");

        double radius = 7;

        double circleArea = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + circleArea);

        System.out.println("-----------------------------");


        System.out.println("Area of Parallelogram");

        double pBase = 15;
        double pHeight = 10;

        double parallelogramArea = pBase * pHeight;

        System.out.println("Base: " + pBase);
        System.out.println("Height: " + pHeight);
        System.out.println("Area: " + parallelogramArea);
    }
}