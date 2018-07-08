public class MinMaxAccount extends BankingAccount {
    int min =0;
    int max =0;

    public MinMaxAccount(Startup s) {
        super(s); //constructs a new object BankingAccount with s object
        min = s.startup_getBalance(); // initializes min
        max = s.startup_getBalance(); // initializes max
    }

    public void debit(Debit d) {
        super.debit(d); //updates debit balance
        int balance = getBalance(); //then gets balance from what super.debit(d) updated

        if (balance > max) { //if it's more than max field, updates that to be new highest account
            max = balance;
        } else if(balance < min) {
            min = balance;
        }

    }

    public void credit(Credit c) {
        super.credit(c);
        int balance = c.credit_getBalance();

        if (balance > max) {
            max = balance;
        } else if(balance < min) {
            min = balance;
        }

    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }



}
