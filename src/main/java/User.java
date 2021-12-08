import java.util.Date;

public class User {

    //All the user attributes
    static private int usercnt=0;
    private String userName;
    private String name;
    private String address;
    private String phone_no;
    private String dob;
    private Date date_created;
    private CheckingAccount checkacc;
    private SavingAccount savacc;

    //Constructor to make user object
    public User(String nam, String add, String pn, String dob){
        usercnt++; //incrementing this as new user created

        name = nam;
        address = add;
        phone_no = pn;
        date_created = new Date();
        this.dob = dob;

        //Creating a unique username
        userName = name.replaceAll("\\s","") + Integer.toString(usercnt);
    }

    //Method to display all user attributes/details
    public void displayDetails(){
        System.out.println("Username      : " + getUserName() + '\n'
        + "Full Name      : " + getName() + '\n'
        + "Joining Date   : " + date_created + '\n'
        + "Address        : " + address + '\n'
        + "Phone Number   : " + phone_no + '\n'
        + "Date of Birth  : " + dob + '\n'
        );

        this.CheckStatus();
    }

    //Check both accounts status of user
    public void CheckStatus(){
        if (checkacc == null){
            System.out.println("Checking Account    : INACTIVE ");
        }
        else {
            System.out.println(("Checking Account   : ACTIVE "));
        }

        if (savacc == null){
            System.out.println(("Saving Account     : INACTIVE "));
        }
        else {
            System.out.println(("Saving Account     : ACTIVE "));
        }
    }

    public String getUserName(){
        return userName;
    }

    public String getName(){
        return name;
    }

    public void setCheckAcc(CheckingAccount checkacc){
        this.checkacc = checkacc;
    }

    public CheckingAccount getCheckacc(){
        return checkacc;
    }

    public SavingAccount getSavacc(){
        return savacc;
    }

    public void setSaveAcc(SavingAccount savacc){
        this.savacc = savacc;
    }
}
