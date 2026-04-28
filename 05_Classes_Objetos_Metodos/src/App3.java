public class App3 {
    public static void main(String[] args){
        Account a = new Account();
        a.deposit(1225);
        a.printBalance();

        Account b = new Account();
        b.deposit(234);
        b.printBalance();

        a.transfer(200, b);
        b.printBalance();
        a.printBalance();
    }
}
