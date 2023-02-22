
/****************************************
 * Java Course 3 Module Ungraded Activity
 * 
 * Savings Account Comparison
 * 
 * @author:Jellie Mae Ortiz
 * Date Created: May 24, 2022 
 ***************************************/

import java.text.DecimalFormat;

public class SavingsAccountDriver {

    public static void main(String[] args) {

        DecimalFormat dForm = new DecimalFormat("0.00");// used to get the 2 decimal digits only

        double finalBalance; // declare this variable to compute the total balance for both accounts

        SavingsAccount saver1 = new SavingsAccount(10002, 2000);
        SavingsAccount saver2 = new SavingsAccount(10003, 3000);

        System.out.println("\t \t \t \t \t Monthly balances for one year with 0.05 annual interest:\n");
        System.out.printf("%45s %12s %10s %12s %10s", "Month", "Account#", "Balance", "Account#", "Balance");
        System.out.printf("\n%80s", "****************************************************\n");
        System.out.printf("%42s %12s %10s %12s %10s", "0", saver1.getACCOUNT_NUMBER(),
                saver1.getBalance(), saver2.getACCOUNT_NUMBER(), saver2.getBalance()); // displays the default/ initial
                                                                                       // balance of both accounts and
                                                                                       // with account numbers


        for (int i = 1; i < 13; i++) {

            // displays the account numbers and balances each month after that month’s interest has been added
            System.out.printf("\n%42s %12s %10s  %12s %10s", i,
                    saver1.getACCOUNT_NUMBER(), dForm.format(saver1.addMonthlyInterest(0.05)),
                    saver2.getACCOUNT_NUMBER(), dForm.format(saver2.addMonthlyInterest(0.05)));
        }

        finalBalance = saver1.getBalance() + saver2.getBalance(); // getting the total of both account balance
        System.out.println("\n \t \t \t \t \t Final balance of both accounts combined: " + dForm.format(finalBalance));

    } // end of main()

}
