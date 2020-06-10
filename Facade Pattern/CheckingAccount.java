public class CheckingAccount implements BankAccount {
    double amount;

    public CheckingAccount(double amount){
        this.amount=amount;
    }

    public void printType() {
        System.out.println("Checking account.");
    }

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
