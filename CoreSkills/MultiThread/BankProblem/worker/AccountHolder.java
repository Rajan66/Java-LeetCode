package CoreSkills.MultiThread.BankProblem.worker;

import CoreSkills.MultiThread.BankProblem.model.Account;

public class AccountHolder implements Runnable{
    private Account account;

    public AccountHolder(Account account){
        this.account = account;
    }
    @Override
    public void run() {
        for(int i =1;i<=4;i++){
            makeWithdrawal(2000);
            if(account.getBalance()<0){
                System.out.println("Account is overdrawn!");
            }
        }
    }

    public void makeWithdrawal(int withdrawAmount){
        if(account.getBalance() >= withdrawAmount){
            System.out.println(Thread.currentThread().getName() +" is going to withdraw $" + withdrawAmount);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.withdraw(withdrawAmount);
            System.out.println(Thread.currentThread().getName() +" has completed the withdrawal of $" + withdrawAmount);
        }else{
            System.out.println("Not enough balance in account for " + Thread.currentThread().getName()+ " to withdraw, " + account.getBalance());
        }

    }
}
