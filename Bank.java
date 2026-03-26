package multithreading;

public class Bank {

    private int balance=100;

    public synchronized void withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName()+"Attemplting to Withdraw");
        if(balance >=amount)
        {
            System.out.println(Thread.currentThread().getName()+"procceding to Withdraw"); 
            try{  Thread.sleep(3000);}
          catch(Exception e)
          {
            System.out.println(e.getMessage());
          }
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+"Withdraw succeded "+ balance);

        }
        else{
            System.out.println(Thread.currentThread().getName()+" Insufficient balance");
        }
    }

}
