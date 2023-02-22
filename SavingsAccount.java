
/****************************************
 * Java Course 3 Module Ungraded Activity
 * 
 * Savings Account Comparison
 * 
 * @author:Jellie Mae Ortiz
 * Date Created: May 24, 2022 
 ***************************************/

public class SavingsAccount {

    private int ACCOUNT_NUMBER;
    private double balance;
    private double annualInterestRate;

    public SavingsAccount(int acctNo, float intBal) {

        this.ACCOUNT_NUMBER = acctNo;
        this.balance = intBal;
    }

    public double addMonthlyInterest(double annualInterestRate) {

        this.balance = balance + (balance * annualInterestRate / 12);
        return balance;
    }

    /**
     * @return int return the ACCOUNT_NUMBER
     */
    public int getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    /**
     * @param ACCOUNT_NUMBER the ACCOUNT_NUMBER to set
     */
    public void setACCOUNT_NUMBER(int ACCOUNT_NUMBER) {
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
    }

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return double return the annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * @param annualInterestRate the annualInterestRate to set
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

}