package uk.ac.gre.comp1549.baone;

/**
 *
 * Class LoanAccount inherits basic details from BankAccount and adds 
 * a payBackPeriod and associated methods.
 */
public class LoanAccount extends BankAccount {

    private int payBackPeriod;

// constructor for LoanAccount.  Note that it has
// to invoke the constructor using "super" for BankAccount passing it
// the accountNumber.  
    
    public LoanAccount(String accountNumber, int payBackPeriod) {
        super(accountNumber); // What happens in you remove this line? Why?
        this.payBackPeriod = payBackPeriod;
    }

    public float getBalance() {
        return balance-10;
    }

    public float calculateInterest() {
        return balance * (interestRate / 100);
    }
}