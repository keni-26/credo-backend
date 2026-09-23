import java.util.Arrays;
import java.util.List;

// Stream API
// Stream is used to process collections of data
// in a simple and readable way.
//
// Common Stream operations:
// 1. map()    -> transforms each element
// 2. filter() -> selects elements based on a condition
// 3. reduce() -> combines elements into one result
//
// Stream does not store data.
// It processes data from a collection.

public class StreamExample {

    public static void main(String[] args) {

        // 1. map() - Double each number

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubled =
                numbers.stream()
                        .map(n -> n * 2)
                        .toList();

        System.out.println("Doubled: " + doubled);


        // 2. map() - Find squares

        List<Integer> squares =
                numbers.stream()
                        .map(n -> n * n)
                        .toList();

        System.out.println("Squares: " + squares);


        // 3. map() - Convert names to uppercase

        List<String> names =
                Arrays.asList(
                        "arul",
                        "arun",
                        "prem",
                        "sai",
                        "sam",
                        "maya",
                        "madhu",
                        "priya"
                );

        List<String> upperNames =
                names.stream()
                        .map(name -> name.toUpperCase())
                        .toList();

        System.out.println("Uppercase names: " + upperNames);


        // 4. map() - Find length of each name

        List<Integer> lengths =
                names.stream()
                        .map(name -> name.length())
                        .toList();

        System.out.println("Name lengths: " + lengths);


        // 5. filter() - Find even numbers

        List<Integer> evenNumbers =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .toList();

        System.out.println("Even numbers: " + evenNumbers);


        // 6. filter() - Find numbers greater than or equal to 3

        List<Integer> greaterNumbers =
                numbers.stream()
                        .filter(n -> n >= 3)
                        .toList();

        System.out.println("Numbers >= 3: " + greaterNumbers);


        // 7. filter() - Find names starting with A

        List<String> studentNames =
                Arrays.asList(
                        "Arun",
                        "Arul",
                        "Bala",
                        "Anu",
                        "Kumar",
                        "Ajay",
                        "Abi",
                        "Sridhar",
                        "Sasi",
                        "Sai",
                        "Ravi",
                        "Rani"
                );

        List<String> namesStartingWithA =
                studentNames.stream()
                        .filter(name -> name.startsWith("A"))
                        .toList();

        System.out.println(
                "Names starting with A: " + namesStartingWithA
        );


        // 8. filter() - Find names with length >= 4

        List<String> longNames =
                studentNames.stream()
                        .filter(name -> name.length() >= 4)
                        .toList();

        System.out.println("Names with length >= 4: " + longNames);


        // 9. reduce() - Find the sum of numbers

        List<Integer> marks =
                Arrays.asList(10, 20, 30, 40, 50);

        int sum =
                marks.stream()
                        .reduce(0, (total, n) -> total + n);

        System.out.println("Sum: " + sum);


        // 10. map() with condition - Convert marks into grades

        List<Integer> studentMarks =
                Arrays.asList(95, 82, 72, 60, 45);

        List<String> grades =
                studentMarks.stream()
                        .map(mark -> {
                            if (mark >= 90)
                                return "A+";
                            else if (mark >= 80)
                                return "A";
                            else if (mark >= 70)
                                return "B";
                            else if (mark >= 60)
                                return "C";
                            else
                                return "Fail";
                        })
                        .toList();

        System.out.println("Grades: " + grades);
    }
}