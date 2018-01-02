package bankingExercise;


public class Customer {
    private String firstName; //personal info
    private String lastName;
    private Account acc;


    //int defaultBalance = 100; //default balance for opening account

    public double withdraw;
    public double deposit;
    public double amount;
    public double transferOut;
    public double transferIn;
    public double transfer;

    TranActivities2 trc;



    public Customer(String firstName, String lastName) { //Customer naming with a String
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() { // Default costomer
        firstName = "John";
        lastName = "Doe";
    }

    public Customer(double amount) { // Amount to use
        this.withdraw = amount;
        this.deposit = amount;
        this.transferIn = amount;
        this.transferOut = amount;
        this.transfer = amount;
    }


        public void addAccount ( double initialBalance){
        acc = new Account();
        trc = new TranActivities2();
        acc.accountId = "ACCT ID = " + Account.getNextId();
        acc.balance = initialBalance;
        acc.displayAccountDetails();
        acc.withdraw = withdraw;
        acc.deposit = deposit;
        acc.amount = amount;



    }

        public void addAccount () { addAccount(100); }



    public void deposit(double depositAmount) {
        trc.displayAccountTransactionDeposit();

        acc.balance = acc.balance + depositAmount;
        System.out.println("You deposited " + depositAmount + " dollars");
        System.out.println("Your new deposit amount balance is " + acc.balance + " dollars");
        System.out.println("  ");
    }

    public void withdraw(double withdrawAmount) {
        trc.displayAccountTransactionWithdraw();

        acc.balance = acc.balance - withdrawAmount;
        System.out.println("You withdrawed " + withdrawAmount + " dollars");
        System.out.println("Your new withdraw amount balance is " + acc.balance + " dollars");
        System.out.println("  ");
    }


    public void transfer(double transferAmount) {
        trc.displaySameBankTrnsactionTransferAccountDetails();

        acc.balance = acc.balance - transferAmount;
        System.out.println("You added $" + transferAmount + " to internal account " + acc.ROUTING_NUMBER) ;
        System.out.println("The balance is now " + acc.balance);
        System.out.println(" ");
    }

    public void transferOut(double transferAmount) {
        trc.displayDifferentBankTransationTransferAccountDetails();

        acc.balance = acc.balance - transferAmount;
        System.out.println("You added $" + transferAmount + " to external account " + acc.ABRN);
        System.out.println("The balance is now " + acc.balance);
        System.out.println(" ");
    }

}







