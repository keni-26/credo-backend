public class ExceptionalHandling {

    public static void main(String[] args) {

        // 1. ArithmeticException

        System.out.println("Arithmetic Exception");

        try {
            int a = 10;
            int b = 0;
            int answer = a / b;
            System.out.println(answer);

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        } 
        finally {
            System.out.println("Program Completed");
        }

        System.out.println("-----------------------------");

        // 2. ArrayIndexOutOfBoundsException

        System.out.println("Array Index Exception");
        int[] marks = {80, 90, 100, 100, 100};
        try {

            System.out.println(marks[0]);
            System.out.println(marks[1]);
            System.out.println(marks[2]);
            System.out.println(marks[3]);
            System.out.println(marks[4]);
            System.out.println(marks[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");
        }

        System.out.println("-----------------------------");

        // 3. NullPointerException
        
        System.out.println("Null Pointer Exception");

        try {

            String name = null;
            System.out.println(name.length());

        } 
        catch (NullPointerException e) {
            System.out.println("String is NULL Value");
        }

        System.out.println("-----------------------------");

        // 4. NumberFormatException

        System.out.println("Number Format Exception");

        try {
            String check = "ABC";
            int number = Integer.parseInt(check);
            System.out.println(number);

        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }

        System.out.println("-----------------------------");

        // 5. StringIndexOutOfBoundsException

        System.out.println("String Index Exception");

        try {
            String name = "Java";
            System.out.println(name.charAt(10));

        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid String Index");
        }

    }
}