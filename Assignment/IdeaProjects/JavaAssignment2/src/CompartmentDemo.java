import java.util.Random;

/**
 * Created by ashvinikumar on 17/11/16.
 */
abstract class Compartment{
    abstract void notice();
}
class FirstClass extends Compartment
{
    public void notice()
    {
        System.out.println("Hey! yor are in FirstClass");
    }
}
class Ladies extends Compartment
{
    public void notice()
    {
        System.out.println("hey!! You are in ladies Compartment");
    }
}
class General extends Compartment
{
    public void notice()
    {
        System.out.println("hey!! this is General class");
    }
}
class Luggage extends Compartment
{
    public void notice()
    {
        System.out.println("hey!! this is luggage class");
    }
}
public class CompartmentDemo {
    public static void main(String arga[])
    {
        Compartment co[]=new Compartment[10];
        Random num=new Random();

        co[0]=new FirstClass();
        co[1]=new Ladies();
        co[2]=new General();
        co[3]=new Luggage();
        for(int i=0;i<10;i++)
        {
            co[num.nextInt(4)].notice();
        }




    }
}
