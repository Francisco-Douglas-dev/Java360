public class App {
    public static void main(String[] args){
       Account a1 = new Account();
       a1.accountNumber = "5798";
       a1.accoundOWner = "Maria";
       a1.balance = 200;

        Account a2 = new Account();
        a2.accountNumber = "4768";
        a2.accoundOWner = "Pedro";
        a2.balance = 450;

        System.out.println(a1.accoundOWner);
        System.out.println(a1.accountNumber);
    }
}
