public class CashRegister {

    private final String name;
    private Double totalCash;
    private Double lastTransactionAmount;
    private Long noOfTransactions;


    public CashRegister(String name) {
        this.name = name;
        this.totalCash = 0.0;
        this.lastTransactionAmount = 0.0;
        this.noOfTransactions = 0L;
    }


    public void transact(Double amount) {
        this.totalCash += amount;
        makeChange();
        this.lastTransactionAmount = amount;
    }

    public void makeChange() {
        this.noOfTransactions += 1;
    }

    public void emptyOut() {
        this.totalCash = 0.0;
    }

    public Double showLastTransactionAmount() {
        return getLastTransactionAmount();
    }

    public void clearHistory() {
        this.totalCash = 0.0;
        this.noOfTransactions = 0L;
        this.lastTransactionAmount = 0.0;
    }

    public Double getTotalCash() {
        return totalCash;
    }

    public Double getLastTransactionAmount() {
        return lastTransactionAmount;
    }

    public Long getNoOfTransactions() {
        return noOfTransactions;
    }


    @Override
    public String toString() {
        return "CashRegister{" +
                "name='" + name + '\'' +
                ", totalCash=" + totalCash +
                ", lastTransactionAmount=" + lastTransactionAmount +
                ", noOfTransactions=" + noOfTransactions +
                '}';
    }
}
