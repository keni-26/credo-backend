class BankAccount {

    String accountNumber;
    String accountHolder;
    double balance;

    void displayAccountDetails() {

        System.out.println("Bank Account Details");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : ₹" + balance);
    }


    void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            System.out.println( "Deposited : " + amount );

            System.out.println( "New Balance : " + balance );

        } else {

            System.out.println( "Invalid Deposit Amount" );
        }
    }


    void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println(  "Invalid Withdrawal Amount" );

        } else if (amount > balance) {

            System.out.println(  "Insufficient Balance" );

        } else {

            balance = balance - amount;

            System.out.println( "Withdrawn : " + amount);

            System.out.println( "Remaining Balance : " + balance );
        }
    }


    void checkBalance() {

        System.out.println( "Current Balance : " + balance);
    }


    void addInterest(double rate) {

        double interest = balance * rate / 100;

        balance = balance + interest;

        System.out.println( "Interest Added : " + interest );

        System.out.println( "New Balance : " + balance );
    }


    void transfer(BankAccount receiver, double amount) {

        if (amount <= 0) {

            System.out.println( "Invalid Transfer Amount" );

        } else if (amount > balance) {

            System.out.println( "Insufficient Balance for Transfer" );

        } else {

            balance = balance - amount;

            receiver.balance = receiver.balance + amount;

            System.out.println( "Transferred : " + amount
            );

            System.out.println( "Transferred To : " + receiver.accountHolder );

            System.out.println( "Remaining Balance : " + balance );
        }
    }


    void checkMinimumBalance(double minimumBalance) {

        if (balance >= minimumBalance) {

            System.out.println( "Minimum Balance Maintained" );

        } else {

            System.out.println( "Minimum Balance Not Maintained" );
        }
    }
}

public class Account {

    public static void main(String[] args) {


        // 1. Create First Bank Account

        BankAccount account1 = new BankAccount();

        account1.accountNumber = "ACC1001";
        account1.accountHolder = "Kenisha";
        account1.balance = 20000;


        // 2. Display Account Details

        account1.displayAccountDetails();


        System.out.println("--------------------");


        // 3. Deposit Money

        account1.deposit(5000);


        System.out.println("--------------------");


        // 4. Withdraw Money

        account1.withdraw(3000);


        System.out.println("--------------------");


        // 5. Check Balance

        account1.checkBalance();


        System.out.println("--------------------");


        // 6. Add Interest

        account1.addInterest(5);


        System.out.println("--------------------");


        // 7. Minimum Balance Check

        account1.checkMinimumBalance(10000);


        System.out.println("--------------------");


        // 8. Create Second Account

        BankAccount account2 = new BankAccount();

        account2.accountNumber = "ACC1002";
        account2.accountHolder = "Keni";
        account2.balance = 10000;


        account2.displayAccountDetails();


        System.out.println("--------------------");


        // 9. Transfer Money

        account1.transfer(account2, 5000);


        System.out.println("--------------------");


        // 10. Display Both Accounts

        System.out.println("Account 1");

        account1.displayAccountDetails();

        System.out.println();

        System.out.println("Account 2");

        account2.displayAccountDetails();
    }
}