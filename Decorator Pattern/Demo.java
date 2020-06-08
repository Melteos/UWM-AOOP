public class Demo {

    public static void main(String[] args){

        BankAccount savingsAcc = new SavingsAccount(0);

        BankAccount onlineSavingsAcc = new OnlineAccountDecorator(new SavingsAccount(23.3));

        BankAccount onlineCheckingAcc = new OnlineAccountDecorator(new CheckingAccount(2));

        System.out.println("Normal savings account");
        savingsAcc.printType();
        savingsAcc.printTotal();
        System.out.println("Online savings account");
        onlineSavingsAcc.printType();
        System.out.println("Online checking account");
        onlineCheckingAcc.printType();
        onlineCheckingAcc.printTotal();

    }
}
