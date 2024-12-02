public class StudentSavingAccount extends SavingAccount{

    private int age;

    public StudentSavingAccount(int id, String name, float balance, int interestRate, int age) {
        super(id, name, balance, interestRate);
        this.age = age;
    }

    @Override
    public void veiwAccountStatement() {
        super.veiwAccountStatement();
        System.out.println("Age of the student: "+age);
    }
}
