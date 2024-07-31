package com.example.ex11;


//----------------------------------------
//domain/Model layer
//----------------------------------------
class Account {
    private String number;
    private double balance;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

//----------------------------------------
//data/repo layer
//----------------------------------------
class SqlAccountRepository {
    public Account load(String number) {
        // database logic
        return new Account(number, 1000);
    }

    public void update(Account account) {
        // database logic
    }
}

//----------------------------------------
//Exception Classes
//----------------------------------------
// checked exception
class NotEnoughBalanceException extends Exception {
    private String message;

    public NotEnoughBalanceException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

//----------------------------------------
//service layer
//----------------------------------------
class UPIPaymentService {

    private SqlAccountRepository accountRepository;

    public UPIPaymentService(SqlAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean transfer(String from, String to, double amount) throws NotEnoughBalanceException,IllegalArgumentException {

        System.out.println("Transfer initiated");

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount should be greater than zero");
        }

        Account fromAccount = accountRepository.load(from);
        Account toAccount = accountRepository.load(to);
        if (fromAccount.getBalance() < amount) {
            throw new NotEnoughBalanceException("Not enough balance, current balance:" + fromAccount.getBalance());
        }
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        accountRepository.update(fromAccount);
        accountRepository.update(toAccount);
        System.out.println("Transfer completed");

        return true;

    }
}

public class MoneyTransferApp {
    public static void main(String[] args) {

        SqlAccountRepository accountRepository = new SqlAccountRepository();
        UPIPaymentService upiPaymentService = new UPIPaymentService(accountRepository);
        try {
            boolean b = upiPaymentService.transfer("1", "2", 2000);
        } catch (NotEnoughBalanceException | IllegalArgumentException e) {
            // how to handle exception
            // friendly message to user
            // send email to admin
            // log exception
            // rollback transaction
            // re-throws exception
            // convert exception to another exception
            // release resources
            System.out.println("Transfer failed, reason: " + e.getMessage());

        }catch (Exception e){
            System.out.println("Something went wrong, please try again later");
        }


    }
}
