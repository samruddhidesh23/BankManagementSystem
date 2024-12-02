public class CurrentAccount extends BankAccount{

    private int transactionLimit = 5;

    public CurrentAccount(int id, String name, float balance) {
        super(id, name, balance);
    }

    @Override
    public void veiwAccountStatement() {
        super.veiwAccountStatement();
        System.out.println("TransactionLimit: "+transactionLimit);
    }
}
