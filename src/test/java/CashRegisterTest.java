import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashRegisterTest {

    CashRegister cashRegister;

    @BeforeEach
    void setUp() {
        cashRegister = new CashRegister("ch-1");
    }


    @Test
    void shouldCreateACashRegister() {

        assertNotNull(cashRegister);
    }

    @Test
    void shouldCreateAnotherCashRegister() {
        CashRegister anotherCashregister = new CashRegister("ch-2");

        assertNotNull(cashRegister);
        assertNotNull(anotherCashregister);
    }

    @Test
    void shouldAdd_5_ToTheRegisterWhenTransactMethodIsCalled() {
        cashRegister.transact(5.0);

        assertEquals(5.0, cashRegister.getTotalCash());
    }

    @Test
    void shouldAdd_15_ToTheRegisterWhenTransactMehtodIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);

        assertEquals(15.0, cashRegister.getTotalCash());
    }

    @Test
    void shouldUpdateTheNoOfTransactionsWhenUpdateIsCalled() {
        cashRegister.transact(5.0);

        assertEquals(1, cashRegister.getNoOfTransactions());
    }

    @Test
    void shouldUpdateTheNoOfTranstionsWhenUpdateIsCalledThrice() {
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);

        assertEquals(3, cashRegister.getNoOfTransactions());
    }


    @Test
    void shouldUpdateLastTranasctionAmountWhenUpdateIsCalled() {
        cashRegister.transact(5.0);

        assertEquals(5.0, cashRegister.getLastTransactionAmount());
    }

    @Test
    void shouldUpdateLastTranasctionAmountWhenUpdateIsCalledMultipleTimes() {
        cashRegister.transact(5.0);
        cashRegister.transact(6.0);
        cashRegister.transact(7.0);
        cashRegister.transact(9.0);

        assertEquals(9.0, cashRegister.getLastTransactionAmount());
    }

    @Test
    void shouldUpdateTheNoOfTransactionsWhenMakeChangeIsCalled() {
        cashRegister.makeChange();

        assertEquals(1, cashRegister.getNoOfTransactions());
        assertEquals(0.0, cashRegister.getTotalCash());
    }


    @Test
    void shouldUpdateTheNoOfTranstionsWhemakeChangeIsCalledMultipleTimes() {
        cashRegister.makeChange();
        cashRegister.makeChange();
        cashRegister.makeChange();

        assertEquals(3, cashRegister.getNoOfTransactions());
        assertEquals(0.0, cashRegister.getTotalCash());
        assertEquals(0.0, cashRegister.getLastTransactionAmount());
    }


    @Test
    void shouldClearMoneyInTheRegisterWhenEmptyOutIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.emptyOut();

        assertEquals(0.0, cashRegister.getTotalCash());
    }

    @Test
    void shouldClearMoneyInTheRegisterWhenEmptyOutIsCalledAndWhenATransactionsHasOccuredMutipleTimes() {
        cashRegister.transact(5.0);
        cashRegister.transact(10.0);
        cashRegister.transact(15.0);
        cashRegister.emptyOut();

        assertEquals(0.0, cashRegister.getTotalCash());
    }

    @Test
    void shouldShowTheLastTransactionAmountWhenShowLastTransactionIsCalled() {
        cashRegister.transact(5.0);

        Double actualData = cashRegister.showLastTransactionAmount();

        assertEquals(cashRegister.getLastTransactionAmount(), actualData);
    }

    @Test
    void shouldShowTheLastTransactionAmountWhenShowLastTransactionIsCalledWhenMultipleTrasactiosnArecalled() {
        cashRegister.transact(5.5);
        cashRegister.transact(10.5);
        cashRegister.transact(15.6);
        cashRegister.transact(20.3);

        Double actualData = cashRegister.showLastTransactionAmount();

        assertEquals(cashRegister.getLastTransactionAmount(), actualData);
    }

    @Test
    void shouldResetTotalCashWhenClearHistoryIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.clearHistory();

        assertEquals(0.0, cashRegister.getTotalCash());
    }

    @Test
    void shouldResetTransactionCountAmountWhenClearHistoryIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.clearHistory();

        assertEquals(0L, cashRegister.getNoOfTransactions());
    }

    @Test
    void shouldResetTransactionCountAmountWhenClearHistoryWhenMultipleTransactIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);

        cashRegister.clearHistory();

        assertEquals(0L, cashRegister.getNoOfTransactions());
    }

    @Test
    void shouldResetLastTransactionAmountWhenClearHistoryIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.clearHistory();

        assertEquals(0.0, cashRegister.getLastTransactionAmount());
    }

    @Test
    void shouldResetLastTransactionAmountWhenClearHistoryIsCalledWhenMultipleTransactIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.clearHistory();

        assertEquals(0.0, cashRegister.getLastTransactionAmount());
    }

    @Test
    void shouldResetTransactionCountWhenClearHistoryIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.clearHistory();

        assertEquals(0, cashRegister.getNoOfTransactions());
    }

    @Test
    void shouldResetTransactionCountWhenClearHistoryIsCalledWhenMultipleTransactIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.clearHistory();

        assertEquals(0, cashRegister.getNoOfTransactions());
    }

    @Test
    void shouldResetEveryValueExceptNameWhenClearHistoryIsCalled() {
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.transact(5.0);
        cashRegister.clearHistory();

        assertEquals(0, cashRegister.getNoOfTransactions());
        assertEquals(0.0, cashRegister.getLastTransactionAmount());
        assertEquals(0L, cashRegister.getNoOfTransactions());
    }
}

