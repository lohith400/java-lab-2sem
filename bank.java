abstract class BankA {
    double balance;
    BankA(double b) {
        balance = b;
    }

    abstract double withdraw(double amount);

    double deposit(double amount) {
        System.out.println("Amount deposited " + amount);
        balance+=amount;
        return amount;
}
    void showbalance() {
        System.out.println("Balance is " + balance);
    }

}

class SavingsAccount extends BankA {
    SavingsAccount(double b) {
        super(b);
    }

    double withdraw(double amount) {
        if (amount <= balance && amount <= 1000000) {
            System.out.println("Savings Account Amount is withdrawn " + amount);
            balance-=amount;
            return amount;
        
        } else {
            System.out.println("Withdrawal limit is exceeded");
            return 0;
        }

    }



    
}

class CurrentAccount extends BankA {
    CurrentAccount(double b) {
        super(b);
    }

    double withdraw(double amount) {
        if (amount <= balance) {
            System.out.println("Currentaccount Amount is withdrawn " + amount);
            balance-=amount;
            return amount;
        
        } else {
            System.out.println("Withdrawal limit is exceeded");
            return 0;
        }

    }



    
}


public class BankMain {
    public static void main(String[] args) {
        //savings acc
        SavingsAccount B = new SavingsAccount(1000);
        //Current acc
        CurrentAccount C = new CurrentAccount(100000);

        BankA x;
        x = B;
        //x.deposit(10000);
        //x.withdraw(1000);

        x = C;
        x.showbalance();
        x.deposit(1000);
        x.showbalance();
        x.withdraw(2000);
        x.showbalance();

        


    }
}


