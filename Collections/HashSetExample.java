import java.util.HashSet;

// HashSet
// HashSet is used to store unique elements.
// Stores elements based on hashing.
// Does not allow duplicate elements.
// Does not maintain insertion order.
// Does not provide index-based access.
// Allows one null value.
// Fast for add, remove and contains operations.

public class HashSetExample {

    public static void main(String[] args) {

        // 1. Creating a HashSet and adding elements

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("SQL");

        System.out.println(courses);


        // 2. HashSet does not allow duplicate elements

        courses.add("Java");

        System.out.println("After adding duplicate Java: " + courses);


        // 3. Traversing using for-each loop

        System.out.println("Courses:");

        for (String course : courses) {
            System.out.println(course);
        }


        // 4. Traversing using forEach()

        System.out.println("Using forEach:");

        courses.forEach(course -> System.out.println(course));


        // 5. Checking whether an element exists

        System.out.println("Contains Java: " + courses.contains("Java"));
        System.out.println("Contains JavaScript: " + courses.contains("JavaScript"));


        // 6. Removing an element

        courses.remove("Python");

        System.out.println("After removing Python: " + courses);


        // 7. Finding the size

        System.out.println("Size: " + courses.size());


        // 8. Checking whether HashSet is empty

        System.out.println("Is empty: " + courses.isEmpty());


        // 9. Adding null

        courses.add(null);

        System.out.println("After adding null: " + courses);


        // 10. Clearing all elements

        courses.clear();

        System.out.println("After clear(): " + courses);
    }
}