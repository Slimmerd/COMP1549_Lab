package uk.ac.gre.comp1549.bankthree;

/**
 *   class LoanAccount inherits from BankAcount
 *      and  implements BrouchureItem
 */
public class LoanAccount extends BankAccount implements AvailableOnline {
       private int payBackPeriod;

    public LoanAccount(String accountNumber, int payBackPeriod) {
        super(accountNumber);
        this.payBackPeriod = payBackPeriod;
    }
    public float calculateInterest() {
        return balance * (interestRate/100);
    }
    // must have this because it is defined in the interface
    public String getItemDescription() {
        return "Low interest - never need to repay";
    }
    public String getEmail() {return "goHome@bank.com"; }
    public String getURL() {return "https://gohome.com";}
}
