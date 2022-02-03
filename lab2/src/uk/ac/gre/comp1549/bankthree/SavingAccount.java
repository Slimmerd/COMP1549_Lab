package uk.ac.gre.comp1549.bankthree;

public class SavingAccount extends BankAccount implements AvailableOnline{


    public SavingAccount(String accountNumber) {
        super(accountNumber);
    }

    public String getURL() {
        return "https://gohome.com/savings";
    }

    public String getItemDescription() {
        return "Pretty high percentages";
    }

    public String getEmail() {
        return "goHome@ar.ac";
    }
}
