/* BankDemo
 *  Original example changed to demonstrate interfaces  
 */
package uk.ac.gre.comp1549.bankthree;

public class BankDemoThree {

    public static void main(String argv[]) {
        BankAccount myAccount,
                yourAccount;

        myAccount = new BankAccount("126542");
        yourAccount = new BankAccount("996545");

        BankAccount.setRate(3);

        myAccount.acceptDeposit(75);
        yourAccount.acceptDeposit(100);
        yourAccount.acceptWithdrawal(25);

        displayDetails(myAccount);
        displayDetails(yourAccount);

        myAccount.setRate(5);

        myAccount.acceptWithdrawal(50);
        yourAccount.acceptDeposit(5);

        displayDetails(myAccount);
        displayDetails(yourAccount);

// show the use of the interface
        LoanAccount la = new LoanAccount("7777777", 5);
        InsurancePolicy ip = new InsurancePolicy();

//        printBrochureItem(myAccount); // can't do because BankAccount
//                                      //   doesn't implement BrochureItem
        printBrochureItem(la); // can do
        printBrochureItem(ip); // can do       

    } // end of main()

    public static void displayDetails(BankAccount anAccount) {

        System.out.println("Account No:"
                + anAccount.getAccountNumber()
                + " Balance: "
                + anAccount.getBalance()
                + " Rate: "
                + anAccount.getRate());
    }

// Note that the parameter type is the interface.  So all the method
// knows about what has been passed to it is that it has a
// getItemDescription() method.
    public static void printBrochureItem(BrochureItem b) {
        System.out.println("*** This is what will appear in the brochure:\n    " + b.getItemDescription());
        // b.getBalance(); // can't do because getBalance isn't defined
        //                              in BrochureItem
    }
} // end of class
