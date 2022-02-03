package uk.ac.gre.comp1549.bankthree;

/**
 * Class InsurancePolicy is included to demonstrate the 
 * interface.  Note that it is not part of the BankAccount
 * inheritance hierarchy.
 */

public class InsurancePolicy implements BrochureItem {
    private String typeOfCover;
    private int premium;
    
    public void processClaim() {
        // do something useful
    }
    
    // must have this because it is defined in the interface
    public String getItemDescription() {
        return "Low premiums - everything covered";
    }
    public String getEmail() {return "goHome@bank.com";}
}

