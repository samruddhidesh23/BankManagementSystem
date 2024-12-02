//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        BankAccount b1 = new SavingAccount(44,"samruddhi",200,7);
        BankAccount b2 = new CurrentAccount(34,"vaishanavi",500);
        BankAccount b3 = new SavingAccount(56,"nidhi",800,7);
        BankAccount b4 = new CurrentAccount(33,"snehal",600);

        BankAccount [] bankAccounts = new BankAccount[]{b1,b2,b3,b4};

        Container c = new Container();
        c.addBankAccount(b1);
        c.addBankAccount(b2);
        c.addBankAccount(b3);
        c.addBankAccount(b4);

        c.veiwDetail(b1);

        c.storeInfoIntofile(bankAccounts);
        System.out.println(c.getDetailsOfBankAccount());

        Util.sort(bankAccounts,new compareByBalance());

        for(BankAccount b : bankAccounts){
            b.veiwAccountStatement();
        }

        c.UpdateInfo(b2,87,"bhavana",900);

        for(BankAccount b : bankAccounts){
            b.veiwAccountStatement();
        }



    }
}