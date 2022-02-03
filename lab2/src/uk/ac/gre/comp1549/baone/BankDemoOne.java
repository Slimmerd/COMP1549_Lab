/* BankDemoOne
 This program demonstrates some of
 the basics of how Java deals with
 classes and inheritance.  It is not  
 realistic in terms of business logic 
 but demonstrates the concepts.
 */
package uk.ac.gre.comp1549.baone;

public class BankDemoOne {

    public static void main(String argv[]) {

// declare two reference variables of type BankAccount
        BankAccount myAccount,
                yourAccount;

// create two instances of class BankAccount
        myAccount = new BankAccount("126542");
        yourAccount = new BankAccount("996545");

// call static method setRate()
        BankAccount.setRate(3);

// call the instance methods
        myAccount.acceptDeposit(75);
        yourAccount.acceptDeposit(100);
        yourAccount.acceptWithdrawal(25);

        System.out.println(myAccount); // What does this output?  Why?

// report the current state of the accounts
        displayDetails(myAccount);
        displayDetails(yourAccount);

// call the static class method again to change the rate
        myAccount.setRate(5); // Why does this line have a warning?

// call instance methods again
        myAccount.acceptWithdrawal(50);
        yourAccount.acceptDeposit(5);

// report the current state fo the accounts again
        displayDetails(myAccount);
        displayDetails(yourAccount);

// demonstrate default equals() method        
        BankAccount accA = new BankAccount("126542"),
                accB = new BankAccount("126542");

// 1. Does this output what you'd expect?
        if (accA.equals(accB)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
        
// 2. Does this output what you'd expect?
        accA.acceptDeposit(400);
        if (accA.equals(accB)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
        
// 3. Does this output what you'd expect?
        accA = accB;
        if (accA.equals(accB)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }


        //        Another two instances of Loan
        LoanAccount myLoanAccount = new LoanAccount("126546", 24);
        myLoanAccount.acceptDeposit(300);
        myLoanAccount.acceptWithdrawal(150);
        displayDetails(myLoanAccount);



    } // end of main()

// the method accepts a bankAccount as a
// parameter and calls its methods to
// display the account details
    public static void displayDetails(BankAccount anAccount) {

        System.out.println("Account No.:"
                + anAccount.getAccountNumber()
                + " Balance: "
                + anAccount.getBalance()
                + " Rate: "
                + anAccount.getRate());
    }
} // end of class
