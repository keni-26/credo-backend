public class MathMethods {

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



    }
}