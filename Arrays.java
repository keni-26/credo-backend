public class Arrays {

    public static void main(String args[]){

        // 1. Array Basics

        int[] marks = {80, 90, 100, 95, 100};

        System.out.println("Array Length: " + marks.length);

        System.out.println("First Element: " + marks[0]);
        System.out.println("Second Element: " + marks[1]);
        System.out.println("Third Element: " + marks[2]);
        System.out.println("Fourth Element: " + marks[3]);
        System.out.println("Fifth Element: " + marks[4]);

        marks[0] = 85;

        System.out.println("After Changing First Element: " + marks[0]);


        // 2. Display Array Using For Loop

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // 3. Enhanced For Loop

        for (int mark : marks) {
            System.out.println(mark);
        }


        // 4. Sum of Array Elements

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum = " + sum);

        // 5. Average of Array

        int[] studentMarks = {80, 90, 70, 85, 75};

        int total = 0;

        for (int mark : studentMarks) {
            total = total + mark;
        }

        double average = (double) total / studentMarks.length;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);


        // 6. Find Largest Number

        int[] Numbers = {25, 80, 45, 95, 30};

        int largest = Numbers[0];

        for (int i = 1; i < Numbers.length; i++) {

            if (Numbers[i] > largest) {
                largest = Numbers[i];
            }
        }

        System.out.println("Largest = " + largest);

        // 7. Find Smallest Number


        int smallest = Numbers[0];

        for (int i = 1; i < Numbers.length; i++) {

            if (Numbers[i] < smallest) {
                smallest = Numbers[i];
            }
        }

        System.out.println("Smallest = " + smallest);


        // 8. Even and Odd Numbers

        int[] evenOdd = {10, 15, 25, 30};

        for (int number : evenOdd) {

            if (number % 2 == 0) {
                System.out.println(number + " - Even Number");
            } else {
                System.out.println(number + " - Odd Number");
            }
        }

        // 9. Reverse Array

        int[] reverse = {10, 20, 30, 40, 50};

        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i] + " ");
        }

        System.out.println();

        // 10. Search an Element

        int[] searchNumbers = {10, 20, 30, 40, 50};

        int search = 30;

        boolean found = false;

        for (int number : searchNumbers) {

            if (number == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " Found");
        } else {
            System.out.println(search + " Not Found");
        }

        // 11. Count Even and Odd Numbers

        int[] values = {10,15,20,25,30,35};

        int evenCount=0;
        int oddCount=0;

        for(int number:values){
            if(number%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);

        // 11. 12. Count Positive, Negative and Zero

        int[] numbers2 = {10, -20, 0, 30, -40, 0, 50};

        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;

        for(int number:numbers2){
            if(number > 0){
                positiveCount++;
            }
            else if(number < 0){
                negativeCount++;
            }
            else{
                zeroCount++;
            }
        }

        System.out.println("Positive = " + positiveCount);
        System.out.println("Negative = " + negativeCount);
        System.out.println("Zero = " + zeroCount);

        // 13. Find Second Largest Number

        int[] secondLargestArray = {10, 50, 30, 80, 60};

        int largestNumber=secondLargestArray[0];
        int secondLargest=Integer.MIN_VALUE;

        for(int number : secondLargestArray){

            if(number>largestNumber){
                secondLargest=largestNumber;
                largestNumber=number;
            }
            else if(number>secondLargest && number != largestNumber){
                secondLargest=number;
            }
        }

        System.out.println("Second Largest = " + secondLargest);

        // 14. Find Second Smallest Number

        int[] secondSmallestArray = {10, 50, 30, 80, 60};

        int smallestNumber = secondSmallestArray[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : secondSmallestArray) {

            if (number < smallestNumber) {
                secondSmallest = smallestNumber;
                smallestNumber = number;
            } else if (number < secondSmallest && number != smallestNumber) {
                secondSmallest = number;
            }
        }

        System.out.println("Second Smallest = " + secondSmallest);

        // 15. Frequency of an Element

        int[] frequencyArray = {10, 20, 10, 30, 10, 40};

        int searchElement = 10;
        int count = 0;

        for(int number : frequencyArray){
            if(number==searchElement){
                count++;
            }
        }

        System.out.println( searchElement + " Occurs " + count + " Times" );


        // 16. Print Duplicate Elements

        int[] duplicateArray = {10, 20, 30, 10, 20, 40, 40};

        for(int i=0; i<duplicateArray.length;i++){
            
            for(int j=i+1;j<duplicateArray.length;j++){
                
                if(duplicateArray[i]==duplicateArray[j]){
                   
                    System.out.println("Duplicate = " + duplicateArray[i] );
                }
            }    
        }

        // 17. String Array

        String[] names = {"Keni","Kenisha","Ken","Dorthy"};

        for (String name : names) {
            System.out.println(name);
        }


        // 18. 2D Array

        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // 19. Access 2D Array Element

        System.out.println(matrix[1][1]);


        // 20. Change 2D Array Element

        matrix[1][1] = 500;

        System.out.println(matrix[1][1]);

    }
    
}
