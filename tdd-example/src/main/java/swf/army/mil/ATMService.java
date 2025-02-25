package swf.army.mil;

public class ATMService {
    public static final int OVERDRAFT_FEE = 30;
    public static final int WITHDRAW_LIMIT = 500;
    private int balance;


    public int getBalance() {
        return balance;
    }

    public void depositAmount(int amountToDeposit) {
        balance += amountToDeposit ;
    }

    public void withdrawAmount(int amountToWithdraw) {
        if (amountToWithdraw > WITHDRAW_LIMIT) throw new IllegalArgumentException();
        if (balance < amountToWithdraw) balance -= amountToWithdraw + OVERDRAFT_FEE;
        else balance -= amountToWithdraw ;
    }

}
