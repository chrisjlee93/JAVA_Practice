package swf.army.mil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ATMServiceTest {
    private ATMService service;
    @BeforeEach
    void setUp() {
        service = new ATMService();
    }

    @Test
    void shouldStartWithZeroBalance() {

        int actual = service.getBalance();
        assertEquals(0, actual);
        
    }

    @Test
    void shouldIncreaseBalanceWhenDepositingAmount() {

        service.depositAmount(200);
        assertEquals(200, service.getBalance());
        service.depositAmount(300);
        assertEquals(500, service.getBalance());

    }

    @Test
    void shouldDecreaseBalanceWhenWithdrawing() {
        service.depositAmount(400);
        service.withdrawAmount(100);
        assertEquals(300, service.getBalance());
        service.withdrawAmount(50);
        assertEquals(250, service.getBalance());

    }

    @Test
    void shouldDecreaseBalanceWithWithdrawAmountPlusOverdraftFee() {
        int amountToDeposit = 100;
        int amountToWithdraw = 120;
        service.depositAmount(amountToDeposit);
        service.withdrawAmount(amountToWithdraw);
        int expectedOverdraftFee = 30;
        assertEquals(amountToDeposit-amountToWithdraw- expectedOverdraftFee, service.getBalance());
    }

    @Test
    void shouldLimitWithdrawAmountInASingleTransaction() {
        int expectedTransactionLimit = 500 ;
        service.depositAmount(800);
        assertThrows(IllegalArgumentException.class,
                () -> service.withdrawAmount(expectedTransactionLimit + 10));

    }
}
