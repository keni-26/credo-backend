import java.util.LinkedHashMap;

// LinkedHashMap
// LinkedHashMap stores data in Key-Value pairs.
// Maintains the insertion order of keys.

// 1. Keys must be unique
// 2. Values can be duplicated
// 3. Maintains insertion order
// 4. Allows one null key
// 5. Allows multiple null values
// 6. No index-based access
// 7. Not synchronized by default

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // 1. Creating LinkedHashMap

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Arun");
        students.put(104, "Aun");
        students.put(102, "Arul");
        students.put(103, "Maya");

        System.out.println(students);


        // 2. Duplicate keys are not allowed

        students.put(101, "Arun Kumar");

        System.out.println("After updating key 101: " + students);


        // 3. Traversing using keySet()

        for (Integer id : students.keySet()) {
            System.out.println(id + " : " + students.get(id));
        }


        // 4. Getting all keys

        System.out.println("Keys: " + students.keySet());


        // 5. Getting all values

        System.out.println("Values: " + students.values());


        // 6. Getting all key-value pairs

        System.out.println("Entries: " + students.entrySet());


        // 7. Getting a value using key

        System.out.println("Student with ID 102: " + students.get(102));


        // 8. Checking key and value

        System.out.println("Contains ID 104: " + students.containsKey(104));
        System.out.println("Contains Aun: " + students.containsValue("Aun"));


        // 9. Removing using key

        students.remove(104);

        System.out.println("After removing ID 104: " + students);


        // 10. Finding size

        System.out.println("Size: " + students.size());


        // 11. Clearing all elements

        students.clear();

        System.out.println("After clear(): " + students);
    }
}