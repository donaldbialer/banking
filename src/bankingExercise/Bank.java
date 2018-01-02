package bankingExercise;

public class Bank {

    public static void main(String[] args) {

        Customer howard = new Customer("Howard", "Guzman");//Customer Accout
        howard.addAccount(1000); //Customer Balance
        howard.withdraw(4); // Customer withdraw
        howard.deposit(5); //Customer deposit
        howard.transfer(5); //Transfer amount to internal or external bank
        howard.transferOut(54);

        Customer vitali = new Customer("Vitali", "Doe");
        vitali.addAccount();
        vitali.withdraw(34);
        vitali.deposit(4);
        vitali.transfer(7);
        vitali.transferOut(4);
        //vitali.amount(50);
        //howard.transferOut(12.9);

    }

}
