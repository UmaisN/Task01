import java.util.Date;

public class CheckingAccount extends Account {

    protected float transactionFees = 10;

    //Parameterized Constructor
    public CheckingAccount(User user, float initDeposit){
        accountcnt++;
        accountnum = accountcnt;
        this.user = user;
        Name = user.getName();
        date_created = new Date();
        balance = initDeposit;
        this.user.setCheckAcc(this);
    }

    //Make Deposit
    public void makeDeposit(float deposit){
        if (deposit>0){
            balance+=deposit;
            balance-=transactionFees;
            total_deductions+=transactionFees;

            this.printStatement(deposit);
        }
        else {
            System.out.println("INVALID DEPOSIT AMOUNT \n");
        }
    }

    //Make Withdrawal
    public void makeWithdrawal(float amount){
        if (this.balance-amount>=5000){
            balance-=amount;
            balance-=transactionFees;
            total_deductions+=transactionFees;

            this.printStatement(amount);
        }
        else {
            System.out.println("TRANSACTION FAILED \n MAX DEBT REACHED \n");
        }
    }

    //Display all deductions
    public void DisplayDeductions(){
        float tax = ( (balance*(float)4) / 100 );


        System.out.println("Total Tax deducted : " + Float.toString(tax) + " PKR" + '\n');
    }


}
