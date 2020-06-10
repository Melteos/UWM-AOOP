public class AccountMaker {

    private BankAccount savingsAcc;
    private BankAccount checkingAcc;

    public AccountMaker() {
        savingsAcc = new SavingsAccount(0);
        checkingAcc = new CheckingAccount(0);
    }

    public void printTypeSavings() {
        savingsAcc.printType();
    }

    public void printTotalSavings() {
        savingsAcc.printTotal();
    }

    public void addMoneySavings(double money){
        savingsAcc.addMoney(money);
    }

    public void withdrawSavings(){
        savingsAcc.withdraw();
    }

    public void printTypeChecking() {
        checkingAcc.printType();
    }

    public void printTotalChecking() {
        checkingAcc.printTotal();
    }

    public void addMoneyChecking(double money){
        checkingAcc.addMoney(money);
    }

    public void withdrawChecking(){
        checkingAcc.withdraw();
    }

}
