package uk.ac.gre.comp1549.baone;

/**
 *
 * Class to represent some basic details of a BankAccount
 */
public class BankAccount {

// balance and accountNumber are instance variables
    protected float balance;
    protected String accountNumber;
    
// interestRate is a static class variable i.e.  shared by all instances
    protected static float interestRate = 0;

// constructor for BankAccount
// initialises instance variables
    public BankAccount(String accountNumber) {
// note the use of "this." to distinguish
// between the instance variable
// accountNumber and the
// parameter accountNumber
        this.accountNumber = accountNumber;
        balance = 0.0f;
    }

// instance methods
    public float acceptDeposit(float amount) {
        balance += amount;
        return balance;
    }

    public void acceptWithdrawal(float amount) {
        balance -= amount;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

// static class methods
    public static void setRate(float iRate) {
        interestRate = iRate;
    }

    public static float getRate() {
        return interestRate;
    }
} // end of class BankAccount
