import java.util.TreeSet;

// TreeSet
// TreeSet is used to store unique elements in sorted order.
// Does not allow duplicate elements.
// Maintains elements in sorted order.
// Does not provide index-based access.
// Does not allow null with natural ordering.
// Useful when we need unique + sorted values.

public class TreeSetExample {

    public static void main(String[] args) {

        // 1. Creating a TreeSet and adding elements

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);


        // 2. TreeSet automatically removes duplicates
        // and stores elements in sorted order

        numbers.add(40);
        numbers.add(5);

        System.out.println("Sorted numbers: " + numbers);


        // 3. Traversing using for-each loop

        System.out.println("Numbers:");

        for (int number : numbers) {
            System.out.println(number);
        }


        // 4. Finding the first element

        System.out.println("First: " + numbers.first());


        // 5. Finding the last element

        System.out.println("Last: " + numbers.last());


        // 6. Checking whether an element exists

        System.out.println("Contains 20: " + numbers.contains(20));
        System.out.println("Contains 100: " + numbers.contains(100));


        // 7. Removing an element

        numbers.remove(10);

        System.out.println("After removing 10: " + numbers);


        // 8. Finding the size

        System.out.println("Size: " + numbers.size());


        // 9. Checking whether TreeSet is empty

        System.out.println("Is empty: " + numbers.isEmpty());


        // 10. Clearing all elements

        numbers.clear();

        System.out.println("After clear(): " + numbers);
    }
}