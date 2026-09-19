import java.util.Scanner;

public class ArrayProblems {

    public static void main(String[]args){

        // 1. Student Marks Management 

        int [] marks = {90,80,65,76,95,55,84,63,73,84};

        System.out.print("All Marks: ");

        for(int mark:marks){
            System.out.print(mark +" ");
        }

        System.out.println();

        int total=0;

        for(int mark:marks){
            total+=mark;
        }

        System.out.println("Total Marks: " + total);

        System.out.println("Average Mark: "+ (total/marks.length));

        int largest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > largest) {
                largest = marks[i];
            }
        }

        System.out.println("Highest mark = " + largest);

        int smallest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] < smallest) {
                smallest = marks[i];
            }
        }

        System.out.println("Lowest mark = " + smallest);

        
         // 2. Student Grade System


        System.out.println("Student Grade");

        for(int mark:marks){
            
            if (mark >= 90 && mark <= 100) {
                System.out.println("A Grade - " + mark);
            } 
            else if (mark >= 80 && mark <= 89) {
                System.out.println("B Grade - " + mark);
            } 
            else if (mark >= 70 && mark <= 79) {
                System.out.println("C Grade - " + mark);
            } 
            else if (mark >= 50 && mark <= 69) {
                System.out.println("D Grade - " + mark);
            } 
            else {
                System.out.println("Fail - " + mark);
            }
        }

        // 3. Employee Salary Analysis

        System.out.println("\nEmployee Salary Analysis");

        int[] salaries = {
            45000, 55000, 62000, 48000, 75000,
            52000, 68000, 39000, 85000, 47000,
            58000, 72000, 50000, 91000, 43000,
            67000, 56000, 49000, 78000, 61000
        };

        int salaryTotal = 0;

        for (int salary : salaries) {
            salaryTotal += salary;
        }

        double salaryAverage = (double) salaryTotal / salaries.length;

        System.out.println("Average Salary: " + salaryAverage);


        int highestSalary = salaries[0];

        for (int i = 1; i < salaries.length; i++) {

            if (salaries[i] > highestSalary) {
                highestSalary = salaries[i];
            }
        }

        System.out.println("Highest Salary: " + highestSalary);


        int lowestSalary = salaries[0];

        for (int i = 1; i < salaries.length; i++) {

            if (salaries[i] < lowestSalary) {
                lowestSalary = salaries[i];
            }
        }

        System.out.println("Lowest Salary: " + lowestSalary);


        System.out.println("Employees Earning Above Average:");

        for (int salary : salaries) {

            if (salary > salaryAverage) {
                System.out.print(salary+" ");
            }
        }


        int aboveFiftyThousand = 0;

        for (int salary : salaries) {

            if (salary > 50000) {
                aboveFiftyThousand++;
            }
        }

        System.out.println();

        System.out.print( "Employees earning more than 50000: "+ aboveFiftyThousand +" " );


        // 4. Product Price Management

        System.out.println("\nProduct Price Management");

        double[] prices = {
            450, 1200, 750, 2500, 1800,
            950, 3200, 600, 1450, 2100,
            850, 1750, 500, 2800, 1100
        };

        double priceTotal = 0;

        for (double price : prices) {
            priceTotal += price;
        }

        double priceAverage = priceTotal / prices.length;

        System.out.println("Average Price: " + priceAverage);


        double mostExpensive = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > mostExpensive) {
                mostExpensive = prices[i];
            }
        }

        System.out.println("Most Expensive Product: " + mostExpensive);


        double cheapest = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < cheapest) {
                cheapest = prices[i];
            }
        }

        System.out.println("Cheapest Product: " + cheapest);


        System.out.println("Products Above 1000:");

        for (double price : prices) {

            if (price > 1000) {
                System.out.print(price + " ");
            }
        }

        System.out.println();


        System.out.println("Products Between 500 and 2000:");

        for (double price : prices) {

            if (price >= 500 && price <= 2000) {
                System.out.print(price +" ");
            }
        }


        // 5. Online Shopping Cart

        System.out.println("\nOnline Shopping Cart");

        double[] cart = {1200, 850, 1500, 600, 2000};

        double cartTotal = 0;

        for (double price : cart) {
            cartTotal += price;
        }

        System.out.println("Total Amount: " + cartTotal);


        double discount;

        if (cartTotal >= 5000) {
            discount = cartTotal * 0.10;
        } 
        else if (cartTotal >= 3000) {
            discount = cartTotal * 0.05;
        } 
        else {
            discount = 0;
        }

        System.out.println("Discount: " + discount);


        double amountAfterDiscount = cartTotal - discount;

        double gst = amountAfterDiscount * 0.18;

        System.out.println("GST: " + gst);


        double finalAmount = amountAfterDiscount + gst;

        System.out.println("Final Payable Amount: " + finalAmount);

        
        // 6. Sales Analysis

        System.out.println("\nSales Analysis");

        int[] sales = {
            8500, 12000, 9500, 15000, 11000,
            7800, 13400, 10200, 9200, 16000,
            12500, 8800, 14500, 9900, 11500,
            10800, 7200, 13000, 15500, 9700,
            11200, 14000, 8600, 10500, 12300,
            9100, 15000, 11800, 7600, 13500
        };

        int salesTotal = 0;

        for (int sale : sales) {
            salesTotal += sale;
        }

        double salesAverage = (double) salesTotal / sales.length;

        System.out.println("Total Monthly Sales: " + salesTotal);
        System.out.println("Average Daily Sales: " + salesAverage);


        int highestSales = sales[0];

        for (int i = 1; i < sales.length; i++) {

            if (sales[i] > highestSales) {
                highestSales = sales[i];
            }
        }

        System.out.println("Highest Sales: " + highestSales);


        int lowestSales = sales[0];

        for (int i = 1; i < sales.length; i++) {

            if (sales[i] < lowestSales) {
                lowestSales = sales[i];
            }
        }

        System.out.println("Lowest Sales: " + lowestSales);


        int daysAboveTenThousand = 0;

        for (int sale : sales) {

            if (sale > 10000) {
                daysAboveTenThousand++;
            }
        }

        System.out.println(
            "Days Sales Exceeded 10000: "
            + daysAboveTenThousand
        );


        // 7. Bank Transaction Analysis

        System.out.println("\nBank Transaction Analysis");

        int[] transactions = {
            10000, -3000, 5000, -1500, 8000,
            -2000, 12000, -5000, 7000, -2500,
            4000, -1000, 15000, -6000, 3000,
            -2000, 9000, -3500, 6000, -1500
        };

        int totalDeposits = 0;
        int totalWithdrawals = 0;

        for (int transaction : transactions) {

            if (transaction > 0) {
                totalDeposits += transaction;
            } 
            else {
                totalWithdrawals += transaction;
            }
        }

        System.out.println("Total Deposits: " + totalDeposits);

        System.out.println(
            "Total Withdrawals: "
            + Math.abs(totalWithdrawals)
        );


        int finalBalance = totalDeposits + totalWithdrawals;

        System.out.println("Final Balance: " + finalBalance);


        int largestDeposit = 0;

        for (int transaction : transactions) {

            if (transaction > largestDeposit) {
                largestDeposit = transaction;
            }
        }

        System.out.println("Largest Deposit: " + largestDeposit);


        int largestWithdrawal = 0;

        for (int transaction : transactions) {

            if (transaction < largestWithdrawal) {
                largestWithdrawal = transaction;
            }
        }

        System.out.println(
            "Largest Withdrawal: "
            + Math.abs(largestWithdrawal)
        );


        // 8. ATM Cash Management

        System.out.println("\nATM Cash Management");

        int[] denominations = {2000, 500, 200, 100};

        int withdrawalAmount = 6800;

        System.out.println(
            "Withdrawal Amount: "
            + withdrawalAmount
        );

        for (int denomination : denominations) {

            int notes = withdrawalAmount / denomination;

            System.out.println(
                denomination + " Notes: " + notes
            );

            withdrawalAmount = withdrawalAmount % denomination;
        }

        System.out.println(
            "Remaining Amount: "
            + withdrawalAmount
        );

        // 9. Electricity Bill Analysis

        System.out.println("\nElectricity Bill Analysis");

        int[] consumption = {
            320, 450, 380, 520, 610, 580,
            490, 430, 350, 300, 370, 410
        };

        int annualConsumption = 0;

        for (int units : consumption) {
            annualConsumption += units;
        }

        double averageConsumption =(double) annualConsumption / consumption.length;

        System.out.println(
            "Annual Consumption: " + annualConsumption + " units"
        );

        System.out.println(
            "Average Consumption: " + averageConsumption + " units"
        );


        int highestConsumption = consumption[0];

        for (int i = 1; i < consumption.length; i++) {

            if (consumption[i] > highestConsumption) {
                highestConsumption = consumption[i];
            }
        }

        System.out.println( "Highest Consumption: " + highestConsumption + " units" );


        int lowestConsumption = consumption[0];

        for (int i = 1; i < consumption.length; i++) {

            if (consumption[i] < lowestConsumption) {
                lowestConsumption = consumption[i];
            }
        }

        System.out.println( "Lowest Consumption: " + lowestConsumption + " units");


        int monthsAboveAverage = 0;

        for (int units : consumption) {

            if (units > averageConsumption) {
                monthsAboveAverage++;
            }
        }

        System.out.println( "Months Above Average: " + monthsAboveAverage);


        // 10. Temperature Monitoring

        System.out.println("\nTemperature Monitoring");

        double[] temperatures = {
            32.5, 35.8, 36.2, 34.5, 37.1, 33.8, 36.5
        };

        double temperatureTotal = 0;

        for (double temperature : temperatures) {
            temperatureTotal += temperature;
        }

        double averageTemperature = temperatureTotal / temperatures.length;

        System.out.println( "Average Temperature: " + averageTemperature + "°C" );


        double highestTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {

            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
            }
        }

        System.out.println("Highest Temperature: "+ highestTemperature + "°C" );


        double lowestTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {

            if (temperatures[i] < lowestTemperature) {
                lowestTemperature = temperatures[i];
            }
        }

        System.out.println( "Lowest Temperature: " + lowestTemperature + "°C" );


        int daysAbove35 = 0;

        for (double temperature : temperatures) {

            if (temperature > 35) {
                daysAbove35++;
            }
        }

        System.out.println(  "Days Above 35°C: " + daysAbove35  );


        double temperatureDifference =  highestTemperature - lowestTemperature;

        System.out.println("Difference Between Highest and Lowest: "+ temperatureDifference + "°C");

        // 11. Duplicate Employee IDs

        int[] EmployeeID = {101, 102, 103, 101, 104, 105, 102};

        for(int i=0; i<EmployeeID.length;i++){
            
            for(int j=i+1;j<EmployeeID.length;j++){
                
                if(EmployeeID[i]==EmployeeID[j]){
                   
                    System.out.println("Duplicate ID = " + EmployeeID[i] );
                }
            }    
        }

        // 12. Remove Duplicate Product IDs

        int[] newEmpID = new int[EmployeeID.length];

        for(int i=0; i<EmployeeID.length;i++){
            
            for(int j=i+1;j<EmployeeID.length;j++){
                
                if(EmployeeID[i]!=EmployeeID[j] ){
                   
                    newEmpID[i]=EmployeeID[i];
                }
            }    
        }

        for (int empID:newEmpID ) {
            System.out.println(empID);
        }


        // 13. Search Product by ID

        int[] productIds = {101, 102, 103, 104, 105, 106};
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter Product ID: ");
        int searchId = sc.nextInt();

        boolean productFound = false;

        for (int id : productIds) {

            if (id == searchId) {
                productFound = true;
                break;
            }
        }

        if (productFound) {
            System.out.println("Product Exists");
        } else {
            System.out.println("Product Does Not Exist");
        }


        // 14. Student Rank System

        int[] studentMarks = {98, 85, 95, 76, 91, 88, 72, 90, 82, 69};

        int[] rankMarks = studentMarks.clone();

        for (int i = 0; i < rankMarks.length - 1; i++) {

            for (int j = 0; j < rankMarks.length - 1 - i; j++) {

                if (rankMarks[j] < rankMarks[j + 1]) {

                    int temp = rankMarks[j];
                    rankMarks[j] = rankMarks[j + 1];
                    rankMarks[j + 1] = temp;
                }
            }
        }

        System.out.println("Student Rankings:");

        for (int i = 0; i < rankMarks.length; i++) {
            System.out.println("Rank " + (i + 1) + " -> " + rankMarks[i]);
        }


        // 15. Employee Attendance

        int[] attendance = {1, 1, 0, 1, 0, 1, 1, 0, 1, 1};

        int present = 0;
        int absent = 0;

        for (int value : attendance) {

            if (value == 1) {
                present++;
            } else {
                absent++;
            }
        }

        double attendancePercentage =
                (present * 100.0) / attendance.length;

        System.out.println("Present Employees = " + present);
        System.out.println("Absent Employees = " + absent);
        System.out.println("Attendance Percentage = "
                + attendancePercentage + "%");


        // 16. Movie Ratings

        int[] ratings = {
                4, 5, 3, 4, 5,
                2, 5, 4, 3, 5,
                4, 3, 2, 5, 4,
                5, 3, 4, 2, 5
        };

        int totalRating = 0;
        int highestRating = ratings[0];
        int lowestRating = ratings[0];
        int fiveStarMovies = 0;

        for (int rating : ratings) {

            totalRating += rating;

            if (rating > highestRating) {
                highestRating = rating;
            }

            if (rating < lowestRating) {
                lowestRating = rating;
            }

            if (rating == 5) {
                fiveStarMovies++;
            }
        }

        double averageRating =
                (double) totalRating / ratings.length;

        System.out.println("Average Rating = " + averageRating);
        System.out.println("Highest Rating = " + highestRating);
        System.out.println("Lowest Rating = " + lowestRating);
        System.out.println("Movies with Rating 5 = " + fiveStarMovies);


        // 17. Bus Ticket Booking

        int[] seats = {
                0, 1, 0, 0, 1,
                0, 1, 0, 0, 1
        };

        System.out.println("Available Seats:");

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 0) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();

        int bookSeat = 3;

        if (seats[bookSeat - 1] == 0) {

            seats[bookSeat - 1] = 1;

            System.out.println(
                    "Seat " + bookSeat + " Booked"
            );

        } else {

            System.out.println(
                    "Seat " + bookSeat + " Already Booked"
            );
        }

        int cancelSeat = 2;

        if (seats[cancelSeat - 1] == 1) {

            seats[cancelSeat - 1] = 0;

            System.out.println(
                    "Seat " + cancelSeat + " Cancelled"
            );

        } else {

            System.out.println(
                    "Seat " + cancelSeat + " Is Already Available"
            );
        }

        System.out.println("Booked Seats:");

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 1) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();


        // 18. Parking Slot Management

        int[] parkingSlots = {
                0, 1, 0, 1, 0,
                0, 1, 0, 0, 1,
                0, 0, 1, 0, 0,
                1, 0, 0, 1, 0
        };

        int parkSlot = 3;

        if (parkingSlots[parkSlot - 1] == 0) {

            parkingSlots[parkSlot - 1] = 1;

            System.out.println(
                    "Vehicle Parked in Slot " + parkSlot
            );

        } else {

            System.out.println("Slot Already Occupied");
        }

        int removeSlot = 2;

        if (parkingSlots[removeSlot - 1] == 1) {

            parkingSlots[removeSlot - 1] = 0;

            System.out.println(
                    "Vehicle Removed from Slot " + removeSlot
            );

        } else {

            System.out.println("Slot Already Empty");
        }

        int occupiedSlots = 0;

        System.out.println("Available Parking Slots:");

        for (int i = 0; i < parkingSlots.length; i++) {

            if (parkingSlots[i] == 0) {
                System.out.print((i + 1) + " ");
            } else {
                occupiedSlots++;
            }
        }

        System.out.println();

        System.out.println(
                "Occupied Slots = " + occupiedSlots
        );


        // 19. Cricket Score Analysis

        int[] cricketScores = {
                45, 67, 32, 89, 12,
                55, 76, 34, 92, 48
        };

        int totalRuns = 0;
        int highestScore = cricketScores[0];
        int lowestScore = cricketScores[0];
        int scoresAbove50 = 0;

        for (int score : cricketScores) {

            totalRuns += score;

            if (score > highestScore) {
                highestScore = score;
            }

            if (score < lowestScore) {
                lowestScore = score;
            }

            if (score > 50) {
                scoresAbove50++;
            }
        }

        double averageRuns =
                (double) totalRuns / cricketScores.length;

        System.out.println("Total Runs = " + totalRuns);
        System.out.println("Average Runs = " + averageRuns);
        System.out.println("Highest Score = " + highestScore);
        System.out.println("Lowest Score = " + lowestScore);
        System.out.println(
                "Scores Above 50 = " + scoresAbove50
        );


        // 20. IPL Player Performance

        String[] playerNames = {
                "Virat", "Rohit", "Dhoni", "Gill", "Rahul",
                "Jaiswal", "Pant", "Surya", "Hardik", "Bumrah"
        };

        int[] playerRuns = {
                650, 590, 480, 720, 510,
                680, 450, 560, 390, 300
        };

        int totalPlayerRuns = 0;
        int topIndex = 0;
        int bottomIndex = 0;

        for (int i = 0; i < playerRuns.length; i++) {

            totalPlayerRuns += playerRuns[i];

            if (playerRuns[i] > playerRuns[topIndex]) {
                topIndex = i;
            }

            if (playerRuns[i] < playerRuns[bottomIndex]) {
                bottomIndex = i;
            }
        }

        double averagePlayerRuns =
                (double) totalPlayerRuns / playerRuns.length;

        System.out.println("Top Scorer = "
                + playerNames[topIndex]
                + " - " + playerRuns[topIndex]);

        System.out.println("Bottom Scorer = "
                + playerNames[bottomIndex]
                + " - " + playerRuns[bottomIndex]);

        System.out.println(
                "Average Score = " + averagePlayerRuns
        );

        int[] topThree = playerRuns.clone();

        for (int i = 0; i < topThree.length - 1; i++) {

            for (int j = 0; j < topThree.length - 1 - i; j++) {

                if (topThree[j] < topThree[j + 1]) {

                    int temp = topThree[j];
                    topThree[j] = topThree[j + 1];
                    topThree[j + 1] = temp;
                }
            }
        }

        System.out.println("Top 3 Scores:");

        for (int i = 0; i < 3; i++) {
            System.out.println(
                    "Rank " + (i + 1) + " = " + topThree[i]
            );
        }


        // 21. E-Commerce Product Inventory

        String[] products = {
                "Laptop", "Phone", "Tablet", "Headphone",
                "Keyboard", "Mouse", "Monitor", "Printer"
        };

        int[] stock = {
                15, 8, 25, 5, 30, 12, 7, 20
        };

        int addStock = 10;
        stock[1] += addStock;

        System.out.println( "Added " + addStock + " stock to Phone" );

        int removeStock = 5;

        if (stock[0] >= removeStock) {

            stock[0] -= removeStock;

            System.out.println("Removed " + removeStock + " Laptop stock" );
        }

        int searchProduct = 3;

        System.out.println(
                "Stock of " + products[searchProduct]
                + " = " + stock[searchProduct]
        );

        System.out.println("Low Stock Products:");

        int totalInventory = 0;

        for (int i = 0; i < stock.length; i++) {

            totalInventory += stock[i];

            if (stock[i] < 10) {

                System.out.println(
                        products[i] + " -> " + stock[i]
                );
            }
        }

        System.out.println(
                "Total Inventory = " + totalInventory
        );


        // 22. Hospital Patient Waiting List

        int[] patients = {
                101, 102, 103, 104, 105
        };

        int patientCount = patients.length;

        System.out.println("Patients:");

        for (int patient : patients) {
            System.out.print(patient + " ");
        }

        System.out.println();

        int searchPatient = 103;
        boolean patientFound = false;

        for (int patient : patients) {

            if (patient == searchPatient) {
                patientFound = true;
                break;
            }
        }

        if (patientFound) {
            System.out.println("Patient Found");
        } else {
            System.out.println("Patient Not Found");
        }

        System.out.println(
                "Number of Waiting Patients = " + patientCount
        );


        // 23. Food Delivery Order Analysis

        double[] orders = {
                250, 1200, 450, 850, 1500,
                280, 700, 1100, 320, 900,
                250, 1300, 600, 180, 750
        };

        double totalRevenue = 0;
        double highestOrder = orders[0];
        double lowestOrder = orders[0];
        int ordersAbove1000 = 0;
        int ordersBelow300 = 0;

        for (double order : orders) {

            totalRevenue += order;

            if (order > highestOrder) {
                highestOrder = order;
            }

            if (order < lowestOrder) {
                lowestOrder = order;
            }

            if (order > 1000) {
                ordersAbove1000++;
            }

            if (order < 300) {
                ordersBelow300++;
            }
        }

        double averageOrder =
                totalRevenue / orders.length;

        System.out.println("Total Revenue = $" + totalRevenue);
        System.out.println("Average Order Value = $" + averageOrder);
        System.out.println("Highest Order = $" + highestOrder);
        System.out.println("Lowest Order = $" + lowestOrder);
        System.out.println(
                "Orders Above $1000 = " + ordersAbove1000
        );
        System.out.println(
                "Orders Below $300 = " + ordersBelow300
        );


        // 24. Cab / Ride Fare Analysis

        double[] fares = {
                250, 600, 450, 800, 350,
                900, 550, 300, 750, 400
        };

        double totalFare = 0;
        double highestFare = fares[0];
        double lowestFare = fares[0];
        int ridesAbove500 = 0;

        for (double fare : fares) {

            totalFare += fare;

            if (fare > highestFare) {
                highestFare = fare;
            }

            if (fare < lowestFare) {
                lowestFare = fare;
            }

            if (fare > 500) {
                ridesAbove500++;
            }
        }

        double averageFare =
                totalFare / fares.length;

        System.out.println("Total Revenue = " + totalFare);
        System.out.println("Average Fare = " + averageFare);
        System.out.println("Highest Fare = " + highestFare);
        System.out.println("Lowest Fare = " + lowestFare);
        System.out.println(
                "Rides Above ₹500 = " + ridesAbove500
        );


        // 25. Mobile Recharge Analysis

        double[] recharges = {
                199, 299, 599, 799, 149,
                499, 999, 299, 599, 199,
                699, 399, 799, 249, 549,
                899, 299, 599, 199, 999
        };

        double totalRecharge = 0;
        double highestRecharge = recharges[0];
        int rechargeAbove500 = 0;

        for (double recharge : recharges) {

            totalRecharge += recharge;

            if (recharge > highestRecharge) {
                highestRecharge = recharge;
            }

            if (recharge > 500) {
                rechargeAbove500++;
            }
        }

        double averageRecharge =
                totalRecharge / recharges.length;

        System.out.println(
                "Total Recharge = " + totalRecharge
        );
        System.out.println(
                "Average Recharge = " + averageRecharge
        );
        System.out.println(
                "Highest Recharge = " + highestRecharge
        );
        System.out.println(
                "Customers Above 500 = " + rechargeAbove500
        );


        // 26. Exam Result Management

        int[] examMarks = {
                85, 45, 76, 92, 38,
                67, 55, 29, 88, 72
        };

        int passedStudents = 0;
        int failedStudents = 0;
        int highestMark = examMarks[0];
        int lowestMark = examMarks[0];
        int totalMarks = 0;

        for (int mark : examMarks) {

            totalMarks += mark;

            if (mark >= 50) {
                passedStudents++;
            } else {
                failedStudents++;
            }

            if (mark > highestMark) {
                highestMark = mark;
            }

            if (mark < lowestMark) {
                lowestMark = mark;
            }
        }

        double averageMark =
                (double) totalMarks / examMarks.length;

        double passPercentage =
                (passedStudents * 100.0)
                / examMarks.length;

        System.out.println("Total Students = " + examMarks.length);
        System.out.println("Passed Students = " + passedStudents);
        System.out.println("Failed Students = " + failedStudents);
        System.out.println("Highest Mark = " + highestMark);
        System.out.println("Lowest Mark = " + lowestMark);
        System.out.println("Average Mark = " + averageMark);
        System.out.println(
                "Pass Percentage = " + passPercentage + "%"
        );


        // 27. Number Frequency Analysis

        int[] numbers = {
                10, 20, 10, 30, 20, 10, 40
        };

        boolean[] visited = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {

                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(
                    numbers[i] + " -> " + count
            );
        }


        // 28. Array Sorting - Employee Salaries

        int[] salary = {
                45000, 75000, 55000, 90000,
                65000, 80000, 50000
        };

        for (int i = 0; i < salary.length - 1; i++) {

            for (int j = 0; j < salary.length - 1 - i; j++) {

                if (salary[j] > salary[j + 1]) {

                    int temp = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending Salary:");

        for (int s : salary) {
            System.out.print(s + " ");
        }

        System.out.println();

        System.out.println("Descending Salary:");

        for (int i = salary.length - 1; i >= 0; i--) {
            System.out.print(salary[i] + " ");
        }

        System.out.println();

        System.out.println("Top 3 Salaries:");

        for (int i = salary.length - 1; i >= salary.length - 3; i--) {
            System.out.println(salary[i]);
        }


        // 29. Second Highest Salary

        int[] employeeSalaries = {
                45000, 75000, 55000, 90000,
                65000, 80000, 50000
        };

        int HighestSalary = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int thirdHighest = Integer.MIN_VALUE;

        for (int salaryy : employeeSalaries) {

            if (salaryy > HighestSalary) {

                thirdHighest = secondHighest;
                secondHighest = highestSalary;
                HighestSalary = salaryy;

            } else if (salaryy > secondHighest
                    && salaryy != HighestSalary) {

                thirdHighest = secondHighest;
                secondHighest = salaryy;

            } else if (salaryy > thirdHighest
                    && salaryy != secondHighest
                    && salaryy != HighestSalary) {

                thirdHighest = salaryy;
            }
        }

        System.out.println("Highest Salary = " + HighestSalary);
        System.out.println(
                "Second Highest Salary = " + secondHighest
        );
        System.out.println(
                "Third Highest Salary = " + thirdHighest
        );


        // 30. Sales Dashboard Using Arrays

        String[] productNames = {
                "Laptop", "Phone", "Tablet",
                "Headphones", "Keyboard"
        };

        double[] productPrices = {
                50000, 25000, 30000, 5000, 3000
        };

        int[] quantitySold = {
                5, 10, 4, 15, 20
        };

        double[] revenue = new double[productNames.length];

        double totalSales = 0;
        int highestRevenueIndex = 0;
        int lowestRevenueIndex = 0;
        int topSellingIndex = 0;

        for (int i = 0; i < productNames.length; i++) {

            revenue[i] =
                    productPrices[i] * quantitySold[i];

            totalSales += revenue[i];

            if (revenue[i] > revenue[highestRevenueIndex]) {
                highestRevenueIndex = i;
            }

            if (revenue[i] < revenue[lowestRevenueIndex]) {
                lowestRevenueIndex = i;
            }

            if (quantitySold[i] > quantitySold[topSellingIndex]) {
                topSellingIndex = i;
            }

            System.out.println(
                    productNames[i]
                    + " Revenue = ₹"
                    + revenue[i]
            );
        }

        double averageRevenue =
                totalSales / productNames.length;

        System.out.println("Total Revenue = ₹" + totalSales);

        System.out.println(
                "Highest Revenue Product = "
                + productNames[highestRevenueIndex]
                + " - ₹"
                + revenue[highestRevenueIndex]
        );

        System.out.println(
                "Lowest Revenue Product = "
                + productNames[lowestRevenueIndex]
                + " - ₹"
                + revenue[lowestRevenueIndex]
        );

        System.out.println(
                "Average Revenue = ₹" + averageRevenue
        );

        System.out.println(
                "Top-Selling Product = "
                + productNames[topSellingIndex]
                + " - "
                + quantitySold[topSellingIndex]
                + " units"
        );






    }
    
}
