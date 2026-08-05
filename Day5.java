public class Day5 {

    public static void main(String[] args) {

        // 1. Area of Rhombus
    
        System.out.println("Area of Rhombus");

        double diagonal1 = 10;
        double diagonal2 = 8;

        double rhombusArea = (diagonal1 * diagonal2) / 2;

        System.out.println("Area = " + rhombusArea);

        System.out.println("-----------------------------");


        // 2. Area of Pentagon

        System.out.println("Area of Pentagon");

        double side = 6;

        double pentagonArea = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

        System.out.println("Area = " + pentagonArea);

        System.out.println("-----------------------------");


        // 3. Area of Hexagon

        System.out.println("Area of Hexagon");

        side = 5;

        double hexagonArea = ((3 * Math.sqrt(3)) / 2) * side * side;

        System.out.println("Area = " + hexagonArea);

        System.out.println("-----------------------------");


        // 4. Area of Heptagon

        System.out.println("Area of Heptagon");

        side = 5;

        double heptagonArea = (7 * side * side) / (4 * Math.tan(Math.PI / 7));

        System.out.println("Area = " + heptagonArea);

        System.out.println("-----------------------------");


        // 5. Area of Octagon

        System.out.println("Area of Octagon");

        side = 5;

        double octagonArea = 2 * (1 + Math.sqrt(2)) * side * side;

        System.out.println("Area = " + octagonArea);

        System.out.println("-----------------------------");


        // 6. Area of Trapezoid

        System.out.println("Area of Trapezoid");

        double base1 = 10;
        double base2 = 8;
        double height = 6;

        double trapezoidArea = ((base1 + base2) * height) / 2;

        System.out.println("Area = " + trapezoidArea);

        System.out.println("-----------------------------");


        // 7. Volume of Sphere

        System.out.println("Volume of Sphere");

        double radius = 5;

        double sphereVolume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        System.out.println("Volume = " + sphereVolume);

        System.out.println("-----------------------------");


        // 8. Volume of Hemisphere
        System.out.println("Volume of Hemisphere");

        double hemisphereVolume = (2.0 / 3) * Math.PI * Math.pow(radius, 3);

        System.out.println("Volume = " + hemisphereVolume);

        System.out.println("-----------------------------");


        // 9. Volume of Cone

        System.out.println("Volume of Cone");

        radius = 4;
        height = 8;

        double coneVolume = (Math.PI * radius * radius * height) / 3;

        System.out.println("Volume = " + coneVolume);

        System.out.println("-----------------------------");


        // 10. Volume of Cuboid

        System.out.println("Volume of Cuboid");

        double length = 10;
        double breadth = 5;
        height = 8;

        double cuboidVolume = length * breadth * height;

        System.out.println("Volume = " + cuboidVolume);

        System.out.println("-----------------------------");


        // 11. Area of Equilateral Triangle

        System.out.println("Area of Equilateral Triangle");

        side = 5;

        double triangleArea = (Math.sqrt(3) * side * side) / 4;

        System.out.println("Area = " + triangleArea);

        System.out.println("-----------------------------");


        // 12. Area of Circle

        System.out.println("Area of Circle");

        radius = 5;

        double circleArea = Math.PI * radius * radius;

        System.out.println("Area = " + circleArea);

        System.out.println("-----------------------------");


        // 13. Math Methods

        System.out.println("Math Methods");

        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);

        System.out.println("Square Root = " + Math.sqrt(64));
        System.out.println("Cube Root = " + Math.cbrt(27));

        System.out.println("Power = " + Math.pow(2,5));

        System.out.println("Maximum = " + Math.max(10,20));
        System.out.println("Minimum = " + Math.min(10,20));

        System.out.println("Absolute = " + Math.abs(-80));

        System.out.println("Round = " + Math.round(15.6));

        System.out.println("Floor = " + Math.floor(15.8));

        System.out.println("Ceil = " + Math.ceil(15.2));

        System.out.println("Random = " + Math.random());

        System.out.println("-----------------------------");


        // 14. Trigonometric Methods

        System.out.println("Trigonometric Methods");

        System.out.println("Sin 30 = " + Math.sin(Math.toRadians(30)));

        System.out.println("Cos 60 = " + Math.cos(Math.toRadians(60)));

        System.out.println("Tan 45 = " + Math.tan(Math.toRadians(45)));

        System.out.println("Radians = " + Math.toRadians(90));

        System.out.println("Degrees = " + Math.toDegrees(Math.PI));

        System.out.println("Exp = " + Math.exp(2));

        System.out.println("Log = " + Math.log(10));

        System.out.println("Log10 = " + Math.log10(100));

        System.out.println("Signum = " + Math.signum(-25));

        System.out.println("-----------------------------");


        // 15. String Methods

        System.out.println("String Methods");

        String s1 = "Java";
        String s2 = "java";

        System.out.println("Equals = " + s1.equals(s2));

        System.out.println("Equals Ignore Case = " + s1.equalsIgnoreCase(s2));

        System.out.println("Compare To = " + s1.compareTo(s2));

        System.out.println("Compare Ignore Case = " + s1.compareToIgnoreCase(s2));

        String name = "Programming";

        System.out.println("Length = " + name.length());

        System.out.println("Character = " + name.charAt(2));

        System.out.println("Index Of = " + name.indexOf("g"));

        System.out.println("Last Index = " + name.lastIndexOf("g"));

        System.out.println("Starts With = " + name.startsWith("Pro"));

        System.out.println("Ends With = " + name.endsWith("ing"));

        System.out.println("Contains = " + name.contains("gram"));

        System.out.println("Lower = " + name.toLowerCase());

        System.out.println("Upper = " + name.toUpperCase());

        System.out.println("Substring = " + name.substring(3));

        System.out.println("Substring = " + name.substring(3,8));

        String words = "Java Python C++";

        String[] array = words.split(" ");

        System.out.println("Split");

        for(String word : array){
            System.out.println(word);
        }

        String empty = "";

        System.out.println("Is Empty = " + empty.isEmpty());

        int number = 100;

        System.out.println("Value Of = " + String.valueOf(number));

        System.out.println("Concat = " + s1.concat(" Programming"));

        String text = "     Java     ";

        System.out.println("Trim = " + text.trim());

        System.out.println("Replace = " + "Java".replace("J","K"));

        // Check whether string is blank

        System.out.println("Is Blank");

        String blank = "   ";

        System.out.println(blank.isBlank());

        System.out.println("-----------------------------");


        // Convert string to character array

        System.out.println("Character Array");

        String language = "Java";

        char[] letters = language.toCharArray();

        for (char ch : letters) {
                 System.out.println(ch);
        }

        System.out.println("-----------------------------");


        // Validate Mobile Number

        System.out.println("Mobile Number Validation");

        String mobile = "9876543210";

        if (mobile.matches("[0-9]{10}")) {
                System.out.println("Valid Mobile Number");
        } 
        else {
                System.out.println("Invalid Mobile Number");
        }

        System.out.println("-----------------------------");


        // Validate Email
        System.out.println("Email Validation");

        String email = "student@gmail.com";

        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                System.out.println("Valid Email");
        } 
        else {
                System.out.println("Invalid Email");
        }

        System.out.println("-----------------------------");


        // Student Name Program

        System.out.println("Student Name Program");

        String studentName = "Rahul Kumar";

        System.out.println("Name : " + studentName);

        System.out.println("Length : " + studentName.length());

        System.out.println("Uppercase : " + studentName.toUpperCase());

        System.out.println("First Character : " + studentName.charAt(0));

        System.out.println("Last Character : " + studentName.charAt(studentName.length() - 1));

        System.out.println("Replace Spaces : " + studentName.replace(" ", "_"));

        System.out.println("Contains Kumar : " + studentName.contains("Kumar"));

    }
}