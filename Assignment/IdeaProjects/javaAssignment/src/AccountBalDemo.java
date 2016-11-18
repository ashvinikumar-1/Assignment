/**
 * Created by ashvinikumar on 18/11/16.
 */
import bankaccount.BankAccount;
import currentless.CurrentLess;
import negativebal.NegativeBal;
import savingless.SavingLess;

import java.util.Scanner;

public class AccountBalDemo {
    public static void main(String args[])
    {
        BankAccount  bc=null;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter account No.");
            int accno = sc.nextInt();
            System.out.println("Please enter account Holder Name.");
            String custN = sc.next();
            System.out.println("Please enter account type Savings/Current");
            String accType = sc.next();
            System.out.println("Please enter Initial deposit //Savings min 1000 Current min 5000)");
            double bal = sc.nextDouble();
        try {
          bc = new BankAccount(accno, custN, accType, bal);


            int t = 1;
            while (t == 1) {
                System.out.println("**********Menu***********");
                System.out.println("1.Deposite 2.Withdraw 3.DisplayBal");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        try {
                            System.out.println("Please enter Balance.");
                            int dep = sc.nextInt();
                            bc.deposit(dep);
                            break;
                        }
                        catch (NegativeBal ne)
                        {
                            System.out.println(ne);
                        }
                    case 2:
                        try{
                        System.out.println("Please enter Balance.");
                        int with = sc.nextInt();
                        bc.withdraw(with);
                        break;
                        }catch (CurrentLess cl)
                        {
                            System.out.println(cl);
                        }
                        catch (SavingLess sl)
                        {
                            System.out.println(sl);
                        }
                        catch (NegativeBal ne)
                        {
                            System.out.println(ne);
                        }
                    case 3:
                        System.out.println("your balance="+bc.getBalance());
                        break;
                    default:System.out.println("you entered wrong choice");
                        break;
                }
                System.out.println("if you want to continue enter 1");
                t  = sc.nextInt();

            }
        }
        catch (NegativeBal nb) {
            System.out.println(nb);
        }
        catch (SavingLess sl) {
            System.out.println(sl);
        }
        catch (CurrentLess cl) {
            System.out.println(cl);
        }


    }
}
