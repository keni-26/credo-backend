class NestedIfElse {
    public static void main(String[] args) {

        System.out.println("College Admission Eligibility");

        int age = 20;
        int marks = 75;

        if (age >= 18) {

            if (marks >= 60) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }

        } else {
            System.out.println("Not Eligible");
        }

        System.out.println("-----------");

        System.out.println("Loan Eligibility");

        int salary = 60000;
        int creditScore = 750;

        if (salary >= 30000) {

            if (creditScore >= 700) {
                System.out.println("Person is eligible for loan");
            } else {
                System.out.println("Person is not eligible because credit score is low");
            }

        } else {
            System.out.println("Person is not eligible because salary is low");
        }
    }
}