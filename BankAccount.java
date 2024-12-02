import java.io.Serializable;
import java.util.Comparator;

public  class BankAccount implements UPI, Serializable {
    private int id;
    private String name;
    private float balance;

    public BankAccount(int id, String name, float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void veiwAccountStatement(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }

    public float withdraw(float amt){
        if(amt>balance){
            return 0;
        }
        balance = balance-amt;
        return balance;
    }
    private boolean deposit(float amt){
        if(amt<=0){
            return false;
        }
        balance = balance+amt;
        return true;
    }

    @Override
    public void pay() {
        System.out.println("paying........");
    }

    @Override
    public void receive() {
        System.out.println("receiving.............");
    }
}

class compareById implements Comparator<BankAccount>{
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if(o1.getId()>o2.getId()){
            return 1;
        }
        if(o1.getId()<o2.getId()){
            return -1;
        }

        return 0;
    }
}

class compareByBalance implements Comparator<BankAccount>{
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if(o1.getBalance()>o2.getBalance()){
            return 1;
        }
        if(o1.getBalance()<o2.getBalance()){
            return -1;
        }
        return 0;
    }
}
