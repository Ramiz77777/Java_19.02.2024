package homeWorks.fourthWeek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount = new BankAccount();
    int[] arrayAccount = new int[14];

    @Test
    void getAccountNumber() {
        assertEquals(14,arrayAccount.length);
    }
    void isEveryNumberInAccountNotZero(){
        for (int i = 0; i < arrayAccount.length; i++) {
            assertNotEquals(0,bankAccount.getAccountNumber());
        }
        }

        @Test
        void isBankAccountIsNull() {
        assertNotEquals(null, bankAccount.getAccountNumber());

    }

    }
