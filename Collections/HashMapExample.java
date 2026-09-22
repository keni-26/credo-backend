import java.util.HashMap;

// HashMap
// HashMap stores data in Key-Value pairs.

// Key   -> used to identify the value
// Value -> data associated with the key

// 1. Keys must be unique
// 2. Values can be duplicated
// 3. No guaranteed insertion order
// 4. Allows one null key
// 5. Allows multiple null values
// 6. No index-based access
// 7. Fast put(), get(), remove(), containsKey() operations on average
// 8. Not synchronized / thread safe by default
// 9. Uses hashing internally

public class HashMapExample {

    public static void main(String[] args) {

        // 1. Creating HashMap

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "keni");
        students.put(102, "dorthy");
        students.put(103, "john");
        students.put(104, "felcia");
        students.put(105, "Kenisha");
        students.put(106, "Priya");

        System.out.println(students);


        // 2. Duplicate keys are not allowed

        students.put(101, "Arun Kumar");

        System.out.println("After using existing key: " + students);


        // 3. Traversing HashMap

        students.forEach((id, name) ->
            System.out.println(id + " : " + name)
        );


        // 4. Getting a value using key

        System.out.println("Student with ID 103: " + students.get(103));


        // 5. Checking whether a key exists

        System.out.println("Contains ID 110: " + students.containsKey(110));
        System.out.println("Contains ID 103: " + students.containsKey(103));


        // 6. Checking whether a value exists

        System.out.println(
            "Contains Kenisha: " + students.containsValue("Kenisha")
        );


        // 7. Getting all keys

        System.out.println("Keys: " + students.keySet());


        // 8. Getting all values

        System.out.println("Values: " + students.values());


        // 9. Getting key-value pairs

        System.out.println("Entries: " + students.entrySet());


        // 10. Updating a value

        students.replace(102, "Sasi Balan");

        System.out.println("After replace(): " + students);


        // 11. Removing using key

        students.remove(106);

        System.out.println("After removing ID 106: " + students);


        // 12. Finding size

        System.out.println("Size: " + students.size());


        // 13. Clearing all elements

        students.clear();

        System.out.println("After clear(): " + students);
    }
}