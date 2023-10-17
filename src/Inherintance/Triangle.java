package Inherintance;

//import src.Loan;

import java.util.Scanner;

public class Triangle extends Circle{

    public void area(Shapes s){
        System.out.println("Triangle");
    }

    public static class TestLoanClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter annual interest rate");
            double annualInterestRate = scanner.nextDouble();
            System.out.println("Enter number of years as an integer");
            int numberOfYears = scanner.nextInt();
            System.out.println("Enter loan amount ");
            double loanAmount = scanner.nextDouble();

           // Loan loan = new  Loan(annualInterestRate, numberOfYears, loanAmount);

           // System.out.printf("The loan was created on %s\n" + "The monthly payment is %2f\nThe total payment is %.2f\n",
                 //   loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                  //  loan.getTotalPayment());
        }
    }
}
