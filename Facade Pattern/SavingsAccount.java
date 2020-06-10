public class SavingsAccount implements BankAccount {

    double amount;

    public SavingsAccount(double amount){
        this.amount=amount;
    }

    @java.lang.Override
    public void printType() {
        System.out.println("Savings account.");
    }

    @java.lang.Override
    public void printTotal() {
        System.out.println(this.amount + " dollars.");
    }

    public void addMoney(double money){
        this.amount += money;
    }

    public void withdraw(){
        this.amount=0;
    }
}
