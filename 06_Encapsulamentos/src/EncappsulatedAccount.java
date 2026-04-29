public class EncappsulatedAccount {
    private String accountNumber;
    private String accountOwner;
    private double balance;

    boolean deposit(double amount){
        if(amount > 0){
            balance += amount;
            return true;
        }
        return false;
    }

    boolean deposit(String amount){
        return deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount){
        if(amount > 0){
            balance -= amount;
            return true;
        }
    }

    void transfer(double amount, EncappsulatedAccount targetAccount){
        withdraw(amount);
        targetAccount.deposit(amount);
    }
    voit printBalance(){
        System.out.println("Balance: R$ "+balance);
    }
}
