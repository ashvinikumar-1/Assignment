import java.util.Scanner;

/**
 * Created by ashvinikumar on 17/11/16.
 */
class Number
{
    int firstnum;
    int secnum;
    double res;
    Number(int firstnum,int secnum)
    {
        this.firstnum=firstnum;
        this.secnum=secnum;
    }
    public double add(){
  res=firstnum+secnum; return res;
}
public double subtract()
{
res=firstnum-secnum;
return res;
}
public double mul()
{
res=firstnum*secnum;
return res;
}
public double div() throws ArithmeticException
{
if(secnum<0)
{
throw new ArithmeticException();
}
else
{
res=firstnum/secnum;
return res;
}
}
}
public class NumberDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=1;
while(t==1)
{
System.out.println("1.Add");
System.out.println("2.subtract");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
System.out.println("Enter your choice");
int k=sc.nextInt();System.out.println("enter two nos");int a=sc.nextInt();int b=sc.nextInt();Number nu=new Number(a,b);
switch (k)
{
case 1:System.out.println("sum of "+a+" and "+b+" is "+nu.add());break;
case 2:System.out.println("sub of "+a+" and "+b+" is "+nu.subtract());break;
case 3:System.out.println("mul of "+a+" and "+b+" is "+nu.mul());break;
case 4:try{
    System.out.println("dimvof "+a+" and "+b+" is "+nu.div());
}
catch (ArithmeticException e)
{System.out.println("div by zero:"+e);
}
break;
default:System.out.println("Wrong choice");
break;
}
System.out.println("if u want to continue enter 1 ");
t=sc.nextInt();
}
}
}