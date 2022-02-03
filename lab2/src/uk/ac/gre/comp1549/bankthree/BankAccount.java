package uk.ac.gre.comp1549.bankthree;
public class BankAccount {

    protected float balance;
    protected String accountNumber;
    protected static float interestRate = 0;

    public static void setRate(float iRate) {
        interestRate = iRate;
    }

    public static float getRate() {
        return interestRate;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0.0f;
    }

    public void acceptDeposit(float amount) {
        balance += amount;
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
}
