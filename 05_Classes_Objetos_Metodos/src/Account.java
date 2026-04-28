public class Account {
    String accountNumber;
    String accoundOWner;
    double balance;

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Seu Deposito precisa ser maior que 1 R$");
        }
    }

    void withdraw(double amount){
        if(amount > 0){
            balance -= amount;
        }
    }
    void transfer(double amount, Account targetAccount){
        withdraw(amount);
        targetAccount.deposit(amount);
    }
    void printBalance(){
        System.out.println("Balance: R$ "+balance);
    }
}
