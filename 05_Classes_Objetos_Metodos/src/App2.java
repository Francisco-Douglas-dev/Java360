public class App2 {
    public static void main(String[] args){
        Account a = new Account();

        a.deposit(200);
        a.printBalance();
        a.deposit(100);
        a.printBalance();
        a.withdraw(112);
        a.printBalance();
        a.deposit(0);
        a.printBalance();
    }
}
