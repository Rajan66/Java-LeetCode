package CoreSkills.MultiThread;

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
                System.out.println("Not enough balance!");
            }
        }
    }
}
