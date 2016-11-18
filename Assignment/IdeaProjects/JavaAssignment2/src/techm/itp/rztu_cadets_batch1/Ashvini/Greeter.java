package techm.itp.rztu_cadets_batch1.Ashvini;

/**
 * Created by ashvinikumar on 17/11/16.
 */
public class Greeter {
    String name;
   public Greeter(String name)
    {
        this.name=name;
    }
    public String sayHello()
    {
        return "Hello, "+name+"!!";
    }
    public String sayGoodBye()
    {
        return "GoodBye, "+name+"!!";
    }
}
