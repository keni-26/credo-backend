public class Patterns {

    public static void main(String[] args) {

        // 1. Right Triangle Star Pattern

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("");


        // 2. Inverted Right Triangle

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

         System.out.println("");


        // 3. Square Star Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
        System.out.println("");

        // 4. Hollow Square Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

         System.out.println("");


        // 5. Number Triangle

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 6. Same Number Triangle

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 7. Inverted Number Triangle

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 8. Floyd's Triangle

        int number = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");

                number++;
            }

            System.out.println();
        }

         System.out.println("");


        // 9. 0-1 Triangle

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }

         System.out.println("");


        // 10. Right Aligned Triangle

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

         System.out.println("");


        // 11. Inverted Right Aligned Triangle

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

         System.out.println("");


        // 12. Pyramid Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

         System.out.println("");


        // 13. Inverted Pyramid

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

         System.out.println("");


        // 14. Diamond Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

         System.out.println("");


        // 15. Hollow Pyramid

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

         System.out.println("");


        // 16. Hollow Diamond

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

         System.out.println("");


        // 17. Number Pyramid

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 18. Palindromic Number Pyramid

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 19. Alphabet Triangle

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                char ch = (char) ('A' + j - 1);

                System.out.print(ch + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 20. Same Alphabet Triangle

        for (int i = 1; i <= n; i++) {

            char ch = (char) ('A' + i - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 21. Alphabet Increasing Triangle

        char alphabet = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(alphabet + " ");

                alphabet++;
            }

            System.out.println();
        }

         System.out.println("");


        // 22. Inverted Alphabet Triangle

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                char ch = (char) ('A' + j - 1);

                System.out.print(ch + " ");
            }

            System.out.println();
        }

         System.out.println("");


        // 23. Butterfly Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

         System.out.println("");


        // 24. Hollow Rectangle

        int rows = 5;
        int columns = 8;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= columns; j++) {

                if (i == 1 || i == rows
                        || j == 1 || j == columns) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

         System.out.println("");


        // 25. X Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j == i || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

         System.out.println("");


        // 26. Plus Pattern

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == (n + 1) / 2
                        || j == (n + 1) / 2) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

         System.out.println("");


        // 27. Multiplication Table Pattern

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                System.out.print((i * j) + "\t");
            }

            System.out.println();
        }

         System.out.println("");


        // 28. Pascal's Triangle

        for (int i = 0; i < n; i++) {

            int value = 1;

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(value + "   ");

                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }

    }
}