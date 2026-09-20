import java.util.LinkedList;

// LinkedList
// LinkedList stores elements using a doubly linked list.
// Each element is connected to the previous and next element.
// Maintains Insertion Order
// Allows Duplicate Values
// Allows Null Values
// Dynamic Size
// Provides efficient insertion and deletion at the beginning and end.

public class LinkedListExample {

    public static void main(String[] args) {

        // 1. Creating a LinkedList and adding elements

        LinkedList<String> names = new LinkedList<>();

        names.add("Arun");
        names.add("Priya");
        names.add("Kumar");
        names.add("Sri");

        System.out.println(names);


        // 2. Adding an element at a specific index

        names.add(1, "Prem");

        System.out.println("After adding at index 1: " + names);


        // 3. Adding an element at the beginning

        names.addFirst("Sasi");

        System.out.println("After addFirst(): " + names);


        // 4. Adding an element at the end

        names.addLast("Raj");

        System.out.println("After addLast(): " + names);


        // 5. Getting elements using index

        System.out.println("Element at index 1: " + names.get(1));


        // 6. Getting the first and last elements

        System.out.println("First element: " + names.getFirst());
        System.out.println("Last element: " + names.getLast());


        // 7. Updating an element

        names.set(1, "Sridhar");

        System.out.println("After set(): " + names);


        // 8. Removing an element using index

        names.remove(1);

        System.out.println("After removing index 1: " + names);


        // 9. Removing the first and last elements

        names.removeFirst();
        names.removeLast();

        System.out.println("After removing first and last: " + names);


        // 10. Searching using indexOf() and lastIndexOf()

        names.add("Sri");
        names.add("Sri");

        System.out.println("List: " + names);

        System.out.println("First index of Sri: " + names.indexOf("Sri"));
        System.out.println("Last index of Sri: " + names.lastIndexOf("Sri"));


        // 11. Remove first occurrence

        names.removeFirstOccurrence("Sri");

        System.out.println("After removeFirstOccurrence(): " + names);


        // 12. Remove last occurrence

        names.removeLastOccurrence("Sri");

        System.out.println("After removeLastOccurrence(): " + names);


        // 13. Size of LinkedList

        System.out.println("Size: " + names.size());


        // 14. Clearing the LinkedList

        names.clear();

        System.out.println("After clear(): " + names);
    }
}