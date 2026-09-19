import java.util.ArrayList;
import java.util.Iterator;

// 1. Collection Framework Basics
// Collection Framework is a set of classes and interfaces
// used to store and manipulate groups of objects.

// Main Collection Interfaces:
// List  - ArrayList, LinkedList, Vector, Stack
// Set   - HashSet, LinkedHashSet, TreeSet
// Queue - PriorityQueue
// Deque - ArrayDeque
// Map   - HashMap, LinkedHashMap, TreeMap


// ArrayList
// ArrayList is a resizable array implementation of the List interface.
// Maintains Insertion Order
// Allows Duplicate Values
// Allows Null Values
// Index Based Access
// Dynamic Size
// Fast Random Access using get()
// Not Synchronized by Default

public class ArrayListExample {

    public static void main(String[] args) {

        // 1. Creating an ArrayList and adding elements

        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Priya");
        names.add("Kumar");
        names.add("Sridhar");
        names.add("Priya");

        System.out.println(names);


        // 2. ArrayList allows duplicate values

        System.out.println("Duplicate Priya: " + names);


        // 3. Accessing elements using index

        System.out.println("First name: " + names.get(0));
        System.out.println("Second name: " + names.get(1));


        // 4. Size of ArrayList

        System.out.println("Size: " + names.size());


        // 5. Updating an element using set()

        names.set(1, "Sam");

        System.out.println("After update: " + names);


        // 6. Adding an element at a specific index

        names.add(1, "Sasi");

        System.out.println("After adding at index 1: " + names);


        // 7. Removing an element

        names.remove(1);

        System.out.println("After removing index 1: " + names);


        // 8. Searching using contains() and indexOf()

        System.out.println("Contains Kumar: " + names.contains("Kumar"));
        System.out.println("Index of Priya: " + names.indexOf("Priya"));
        System.out.println("Last index of Priya: " + names.lastIndexOf("Priya"));


        // 9. Traversing using enhanced for loop

        System.out.println("Using for-each loop:");

        for (String name : names) {
            System.out.println(name);
        }


        // 10. Traversing using Iterator

        System.out.println("Using Iterator:");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // 11. Checking whether ArrayList is empty

        System.out.println("Is empty: " + names.isEmpty());


        // 12. Replacing all elements

        names.replaceAll(name -> name.toUpperCase());

        System.out.println("After converting to uppercase: " + names);


        // 13. Removing elements based on a condition

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Numbers: " + numbers);

        numbers.removeIf(n -> n >= 50);

        System.out.println("After removing numbers >= 50: " + numbers);


        // 14. Adding two ArrayLists using addAll()

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Java");
        list1.add("Python");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("SQL");
        list2.add("API");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        list1.addAll(list2);

        System.out.println("After addAll(): " + list1);


        // 15. Clearing all elements

        list2.clear();

        System.out.println("After clear(): " + list2);
    }
}