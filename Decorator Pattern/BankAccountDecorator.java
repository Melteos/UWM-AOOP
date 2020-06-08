public abstract class BankAccountDecorator implements BankAccount {
    protected BankAccount decoratedBA;

    public BankAccountDecorator(BankAccount ba) {
        this.decoratedBA = ba;
    }

    public void printType(){
        this.decoratedBA.printType();
    }

    public void printTotal() {
        this.decoratedBA.printTotal();
    }

    public void addMoney(double money){
        this.decoratedBA.addMoney(money);
    }

    public void withdraw(){
        this.decoratedBA.withdraw();
    }
}
