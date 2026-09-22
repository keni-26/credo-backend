import java.util.LinkedHashSet;

// LinkedHashSet
// LinkedHashSet stores unique elements
// while maintaining the order in which elements were inserted.

// 1. Duplicate elements are not allowed
// 2. Maintains insertion order
// 3. No index-based access
// 4. Allows one null value
// 5. Uses hashing internally
// 6. Slightly slower than HashSet because it maintains insertion order

public class LinkedHashSetExample {

    public static void main(String[] args) {

        // 1. Creating LinkedHashSet

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);

        System.out.println(numbers);


        // 2. Duplicate values are removed
        // Insertion order is maintained

        numbers.add(20);

        System.out.println("After adding duplicate: " + numbers);


        // 3. Traversing LinkedHashSet

        System.out.println("Numbers:");

        for (int number : numbers) {
            System.out.println(number);
        }


        // 4. Removing elements based on a condition

        numbers.removeIf(n -> n < 20);

        System.out.println("After removing numbers < 20: " + numbers);


        // 5. Checking whether an element exists

        System.out.println("Contains 30: " + numbers.contains(30));


        // 6. Finding size

        System.out.println("Size: " + numbers.size());


        // 7. Clearing all elements

        numbers.clear();

        System.out.println("After clear(): " + numbers);
    }
}