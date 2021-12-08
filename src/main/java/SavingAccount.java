import java.util.Date;

public class SavingAccount extends Account{
    protected float interest = 5;

    //Parameterized Constructor
    public SavingAccount(User user, float initDeposit){
        accountcnt++;
        accountnum = accountcnt;
        this.user = user;
        Name = user.getName();
        date_created = new Date();
        balance = initDeposit;
        this.user.setSaveAcc(this);
    }

    //Make Deposit
    public void makeDeposit(float deposit){
        if (deposit>0){
            balance+=deposit;

            this.printStatement(deposit);
        }
        else {
            System.out.println("INVALID DEPOSIT AMOUNT \n");
        }
    }

    //Make withdrawal
    public void makeWithdrawal(float amount)
    {
        //Withdrawal wont proceed if amount exceeds balance
        if( amount <= this.balance )
        {
            balance -= amount; //amount deducted

            this.printStatement(amount);
        }
        else
        {
            System.out.println("TRANSACTION FAILED ! \n (Amount exceeds current Balance)\n");
        }
    }

    //Interest
    public float calculateInterest()
    {
        return interest * balance;
    }

    //Zakat
    public float calculateZakat()
    {
        if( balance >= 20000 )
        {
            return (balance*(float)2.5) /100;
        }
        else
        {
            return 0;
        }
    }

    public void displayAllDeductions()
    {
        if( balance >= 20000 )
        {
            //float zakat = ( (balance*(float)2.5)/100 );


            System.out.println("Total Zakat deducted : "  + Float.toString(this.calculateZakat()) + " PKR" + '\n');
        }
        else
        {
            System.out.println("NO DEDUCTIONS HAVE BEEN MADE ! \n");
        }
    }
}
