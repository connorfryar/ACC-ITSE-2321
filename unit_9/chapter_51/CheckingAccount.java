public class CheckingAccount 
{
    private String accountNumber;
    private String accountHolder;
    private int balance;

    public void processDeposit( int amount )
    { // scope of amount starts here
        balance = balance + amount;
    } // scope for amount stops here

    public void processDeposit( int amount, int serviceCharge) 
    {
        balance = balance + amount - serviceCharge ; 
    }

    public void processCheck( int amount ) 
    { // scope for amount starts here
        // int balance = 0; Bad idea to reuse instance variables as local variables
        // local variable ends up shadowing the instance variable.

        // this.balance == instance 
        // balance == method
        // int balance = 0;
        // this.balance = balance + amount;


        // int amount; // cannot use a formal paramater name as a local variable simultaneously.
        int charge; // scope of charge starts here

        incrementUse();
        if ( blanace < 100000 )
            charge = 15;
        else
            charge = 0;

        balance = balance - amount - charge; // scope of charge stops here
        

        amount = 0; // demonstrating the fact that this will not effect anything outside of this method
        // scope for amount ends here
    }


    public String toString() 
    [
        return "Account: " + accountNumber + "\tName: " + accountHolder + "\tBalance: " + balance;
    ]

    // not possible to see "charge due to scope issues"
    // void showCharge()
    // [
    //     System.out.println(charge)
    // ]

    // modifying defulat toString();
    // In chapter lesson there is a consideration to variable scopes.
}


// public class CheckingTester
// {

//     public static void main(String[] args) {
//         CheckingAccount act;
//         int check = 5000;
//         act = new CheckingAccount( "123-345-99", "Wanda Fish", 100000 );

//         System.out.println( "check:" = check);

//         act.processCheck( check );

//         System.out.println("check: " + check ); 
//     }
// }

public class CheckingAccountTester
{
    public static void main(String[] args) 
    {
        
        CheckingAccount bobsAccount = new CheckingAccount("999", "Bob", 100);

        bobsAccount.processDeposit(200); // statement A

        bobsAccount.processDeposit(200, 25); // statement B
        
    }    
}

// method signature == name and the number && types of its parameters, in order
// return type is not apart of the signature