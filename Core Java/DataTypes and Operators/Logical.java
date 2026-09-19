class Logical{
    public static void main(String[] args) {

        System.out.println("Check whether student has passed in all subjects");

        int mark1 = 75;
        int mark2 = 80;
        int mark3 = 65;

        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            System.out.println("Student has passed in all subjects");
        } else {
            System.out.println("Student has failed in one or more subjects");
        }

        System.out.println("-----------");

        System.out.println("Check discount eligibility");

        int age = 25;
        boolean isMember = true;

        if (age >= 60 || isMember) {
            System.out.println("Person is eligible for discount");
        } else {
            System.out.println("Person is not eligible for discount");
        }

        System.out.println("-----------");

        System.out.println("Check user authorization");

        String username = "admin";
        String password = "12345";

        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("User is authorized");
        } else {
            System.out.println("User is not authorized");
        }

        System.out.println("-----------");

        System.out.println("Demonstrate NOT operator");

        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("It is not raining");
        } else {
            System.out.println("It is raining");
        }

        System.out.println("-----------");

        System.out.println("Check whether number lies within range");

        int rangeNumber = 50;

        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println(rangeNumber + " lies within the range 1 to 100");
        } else {
            System.out.println(rangeNumber + " is outside the range");
        }
    }
}