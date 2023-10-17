package loan;

import Inherintance.Main;

import java.util.Date;

public class Loan {



    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;


    
     public Loan(){
         this(2.5,1,1000);
     }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

   // public double getMonthlyPayment() {

   // }

   // public double getTotalPayment() {

   // }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
