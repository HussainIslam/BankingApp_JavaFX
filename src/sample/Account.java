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
    private int pin;

    public Account(){
        id = 0;
        balance = 0.00;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, String fName, String lName, double balance, int pin){
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.balance = balance;
        this.pin = pin;
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

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    @Override
    public String toString(){
        return  Integer.toString(id);
    }
}
