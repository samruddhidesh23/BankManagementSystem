import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Container {

    ArrayList<BankAccount> list;

    public Container(){
        list = new ArrayList<>();
    }

    public void addBankAccount(BankAccount bankAccount){
        list.add(bankAccount);
    }

    public void removeBankAccount(BankAccount bankAccount){
        list.remove(bankAccount);
    }

    public boolean UpdateInfo(BankAccount bankAccount,int id,String name,float balance){
        if(list.contains(bankAccount)){
            bankAccount.setId(id);
            bankAccount.setName(name);
            bankAccount.setBalance(balance);
            return true;
        }
        return false;
    }

    public void Search(Object element){

    }

    public void storeInfoIntofile(BankAccount [] bankAccounts){
        String path = "C:\\Users\\Lenovo\\Desktop\\java\\demoFiles\\bankAccount_Details.txt";

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(path,true)
            );

            for(BankAccount b : bankAccounts){
                out.writeObject(b);
            }

            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  ArrayList<BankAccount> getDetailsOfBankAccount(){

        String path = "C:\\Users\\Lenovo\\Desktop\\java\\demoFiles\\bankAccount_Details.txt";

        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(path)
            );

            ArrayList<BankAccount> bankAccounts = new ArrayList<>();

            int i = 0;

            while (i<4){
                BankAccount bankAccount = (BankAccount) in.readObject();
                bankAccounts.add(bankAccount);
                i++;
            }
            in.close();
            return bankAccounts;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public void veiwDetail(BankAccount bankAccount){
        bankAccount.veiwAccountStatement();
    }
}

