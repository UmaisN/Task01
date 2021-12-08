import java.util.Date;

public class Account {

    //attributes
    protected User user;
    protected int accountnum;
    static protected int accountcnt = 0;
    protected String Name;
    protected float balance;
    protected Date date_created;
    protected float total_deductions = 0;

    public Account(){

    }

    //Parameterized Constructor
    public Account(User user, float initDeposit){
        accountcnt++;
        accountnum = accountcnt;
        Name = user.getName();
        date_created = new Date();
        balance = initDeposit;
    }

    //Make Deposit
    public void makeDeposit(float deposit){

    }

    //Make Withdrawal
    public void makeWithdrawal(float amount){

    }

    //Display all deductions
    public void DisplayDeductions(){

    }

    //Transfer amount
    public void transferAmount(int amount, int accountno){

    }

    //Print Statement
    public void printStatement(float transactionAmount){
        Date transactionTime = new Date();
        System.out.println( "--------------------------------------------------\n"
                + "              TRANSACTION STATEMENT\n"
                +"-------------------------------------------------\n"
                + "Account Number     : " + Integer.toString(this.getAccountNum()) + '\n'
                +  "Transaction Amount : " + Float.toString(transactionAmount) + '\n'
                +  "Remaining Balance  : " + Float.toString(balance) + '\n'
                +  "Transaction Time   : " + transactionTime + '\n');
        user.displayDetails() ;
        System.out.println( "--------------------------------------------------\n"	);
    }

    //Check balance method
    public void CheckBalance(){
        System.out.println("Account Number      : " + this.getAccountNum() + '\n'
        +                  "User Name           : " + user.getUserName() + '\n'
        +                  "Balance             : " + balance + '\n');
    }


    public int getAccountNum(){
        return accountnum;
    }
}
