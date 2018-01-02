package bankingExercise;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.Callable;

public class Account {

    double balance;
    String accountId;
    double amount;
    double withdraw;
    double deposit;
    static int nextId = 1;
    static final int ROUTING_NUMBER = 12345;
    static final int ABRN = 54321;
    double transferAmount;



    public void displayAccountDetails() {
        System.out.println("*** Account Information ***");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + balance );
        System.out.println(" ");

    }

    public static String getNextId() {
        return "ACCT#" + nextId++;
    }
}
