public class App5 {
    public static void main(String[] args){
        var a = new EncappsulatedAccount();
        a.deposit(1000);
        a.balance = 2000;
        a.printBalance();

        System.out.println();
    }
}
