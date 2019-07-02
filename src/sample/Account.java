package sample;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        balance = 0.00;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate /12;
    }

    public double getMonthlyInterest(){
        return this.balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit (double amount){
        this.balance += amount;
    }

}
