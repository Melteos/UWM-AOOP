public class OnlineAccountDecorator extends BankAccountDecorator {

    public OnlineAccountDecorator(BankAccount decoratedBA) {
        super(decoratedBA);
    }

    public void printType(){
        decoratedBA.printType();
        setOnlineAccount();
    }

    public void setOnlineAccount(){
        System.out.println("This is an online account.");
    }

    public void onlineMessage(){
        System.out.println("This is done online.");
    }

    public void printTotal() {
        decoratedBA.printTotal();
        onlineMessage();
    }

    public void addMoney(double money){
        decoratedBA.addMoney(money);
        onlineMessage();
    }

    public void withdraw(){
        decoratedBA.withdraw();
        onlineMessage();
    }

}
