import java.util.TreeMap;

// TreeMap
// TreeMap stores data in Key-Value pairs.
// Sorts the entries according to the keys.

// 1. Keys must be unique
// 2. Values can be duplicated
// 3. Keys are stored in sorted order
// 4. No index-based access
// 5. Useful when we need key-value pairs in sorted key order
// 6. Null keys are generally not allowed with natural ordering

public class TreeMapExample {

    public static void main(String[] args) {

        // 1. Creating TreeMap

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Kumar");
        students.put(105, "Maya");
        students.put(101, "Madhu");
        students.put(102, "Abi");
        students.put(104, "Anu");

        System.out.println(students);


        // 2. TreeMap automatically sorts by key

        System.out.println("Sorted students: " + students);


        // 3. Getting the first key

        System.out.println("First key: " + students.firstKey());


        // 4. Getting the last key

        System.out.println("Last key: " + students.lastKey());


        // 5. Getting the first entry

        System.out.println("First entry: " + students.firstEntry());


        // 6. Getting the last entry

        System.out.println("Last entry: " + students.lastEntry());


        // 7. Getting a value using key

        System.out.println("Student with ID 103: " + students.get(103));


        // 8. Checking whether key/value exists

        System.out.println("Contains ID 104: " + students.containsKey(104));
        System.out.println("Contains Anu: " + students.containsValue("Anu"));


        // 9. Removing an entry

        students.remove(102);

        System.out.println("After removing ID 102: " + students);


        // 10. pollLastEntry()
        // Removes and returns the entry with the largest key

        System.out.println("Removed last entry: " + students.pollLastEntry());

        System.out.println("After pollLastEntry(): " + students);


        // 11. pollFirstEntry()
        // Removes and returns the entry with the smallest key

        System.out.println("Removed first entry: " + students.pollFirstEntry());

        System.out.println("After pollFirstEntry(): " + students);


        // 12. Finding size

        System.out.println("Size: " + students.size());


        // 13. Clearing all elements

        students.clear();

        System.out.println("After clear(): " + students);
    }
}