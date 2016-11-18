import java.util.Scanner;

/**
 * Created by ashvinikumar on 16/11/16.
 */
class Matrix
{
    int row;
    int col;
    int mat[][]=new int[10][10];
    Matrix()
    {

    }
    Matrix(int row,int col)
    {
        this();
        this.row=row;
        this.col=col;

    }
    void set(int row1,int col1,int val)
    {
        if(val>0)
            mat[row1][col1]=val;
        else
            mat[row1][col1]=0;
    }
    public void display()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    int trans[][]=new int[10][10];

    public void transpose()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                trans[i][j]=mat[j][i];
            }
        }
    }
    public void displayTrans()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class MatrixProg {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows and cols");
        int r=sc.nextInt();
        int c=sc.nextInt();
        Matrix m=new Matrix(r,c);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {

                System.out.println("enter row no, col no, val ");
                int r1=sc.nextInt();
                int c1=sc.nextInt();
                int val=sc.nextInt();
                m.set(r1,c1,val);
            }
        }
        m.display();
        m.transpose();
        System.out.println("transpose :");
        m.displayTrans();
    }
}
