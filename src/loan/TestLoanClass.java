package loan;

import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the annual interest rate ");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("enter the number of years");
        int numberOfYears  = scanner.nextInt();
        System.out.println("enter loan amount");
        double loanAmount = scanner.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

       // System.out.printf("The loan was created on %s\n" +
                //"The monthly payment is %.2f\nThe total payment is %.2f\n",
              //  loan.getLoanDate().toString(), loan.getMonthlyPayment(),
              //  loan.getTotalPayment());
    }
}

