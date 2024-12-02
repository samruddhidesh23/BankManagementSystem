public class SavingAccount extends BankAccount{

    private int interestRate;

    public SavingAccount(int id, String name, float balance, int interestRate) {
        super(id, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void veiwAccountStatement() {
        super.veiwAccountStatement();
        System.out.println("Interest Rate: "+interestRate);
    }




}
