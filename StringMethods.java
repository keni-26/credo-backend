public class StringMethods {
    public static void main(String[] args) {

        
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
