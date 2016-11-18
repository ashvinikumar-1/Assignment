package bankaccount;
import negativebal.NegativeBal;
import savingless.SavingLess;
import currentless.CurrentLess;
/**
 * Created by ashvinikumar on 18/11/16.
 */
public class BankAccount {
    int accNumber;
    String custName;
    String accType;
   static double balance;
    public BankAccount(int accNumber,String custName,String accType,double balance) throws NegativeBal,SavingLess,CurrentLess
    {
        this.accNumber=accNumber;
        this.custName=custName;
        this.accType=accType;
        if(balance<0)
        {
          NegativeBal ne=new NegativeBal("entered bal is negative");
            throw ne;
        }
        else if(this.accType.equals("Savings"))
        {
            if(balance<1000)
            {
              SavingLess sl=new SavingLess("your saving account should have minimum bal 1000");
                throw sl;
            }
            else
                this.balance=balance;
        }
        else if(this.accType.equals("Current"))
        {
            if(balance<5000)
            {
              CurrentLess cl=new CurrentLess("your Current account should have minimum balance 5000");
                throw cl;
            }
            else
                this.balance=balance;
        }


    }
    public void deposit(double bal) throws NegativeBal
    {
        if(bal<0)
        {
           NegativeBal nb=new NegativeBal("you have entered negative amount");
            throw nb;
        }
        else
            balance=balance+bal;
    }
    public void withdraw(double bal) throws NegativeBal,SavingLess,CurrentLess
    {
        if(bal<0)
        {
        NegativeBal ne=new NegativeBal("you entered negative amount");
            throw  ne;
        }
        if(accType.equals("Savings"))
        {
            if((balance-bal)<1000)
            {
               SavingLess sl=new SavingLess("entered amount will violat the minimum balance of saving account,please enter less amount ");
               throw sl;
            }
            else
            {
                balance=balance-bal;
            }
        }
        if(accType.equals("Current"))
        {
            if((balance-bal)<5000)
            {
                CurrentLess cl=new CurrentLess("entered amount will violat the minimum balance of Current account,please enter less amount ");
                throw cl;
            }
            else
            {
                balance=balance-bal;
            }
        }
    }
    public double getBalance()
    {
        return balance;

    }
}
