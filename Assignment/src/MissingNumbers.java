/**
 * Created by ashvinikumar on 30/11/16.
 */
public class MissingNumbers {
    public static void main(String args[])
    {
        int arr[]={1,1,2,3,3,1,1,1,3,2,10,20,10,19,15,16,17,17,17,17};
        int availNum[]=new int[20];
        for(int i=0;i<20;i++)
        {
            availNum[arr[i]%20]=1;
        }
        for(int i=1;i<=20;i++)
        {
            if(availNum[i%20]==0)
            {

                System.out.println("missing nos="+i);
            }
        }
    }
}
