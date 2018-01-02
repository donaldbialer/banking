package bankingExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Donald
 */
public class TranActivities2 {


    Date myDate = new Date();
    SimpleDateFormat sm = new SimpleDateFormat("MM-dd-yyyy");
    String strDate = sm.format(myDate);
    private String internalBank = "Local TD Bank";
    private String transactionDeposit = "Deposit";
    private String externalBank = "Chase";
    private String trans2 = "12-21-2017";
    private String trans3 = "12-20-2017";
    private String trans4 = "12-19-2017";
    private String transactionWithdraw = "Withdraw";
    private String transacionSameBankTransfer = "Internal TD Bank Transfer";
    static final int ROUTING_NUMBER = 12345;
    static final int ABRN = 54321;


    public void displayAccountTransactionDeposit () {
        System.out.println(trans2 + " " + internalBank + " " + transactionDeposit + " " + ROUTING_NUMBER);
    }

    public void displayAccountTransactionWithdraw () {
        System.out.println(strDate + " " + internalBank + " " + transactionWithdraw + " " + ROUTING_NUMBER);
    }

    public void displaySameBankTrnsactionTransferAccountDetails () {
        System.out.println(trans3 + " " + internalBank + " " + transacionSameBankTransfer  + " " + ROUTING_NUMBER);
    }

    public void displayDifferentBankTransationTransferAccountDetails () {
        System.out.println(trans4 + " " + internalBank + " transfer to " + externalBank + " " + ABRN);
    }



}