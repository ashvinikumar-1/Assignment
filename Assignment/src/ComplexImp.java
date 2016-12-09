import java.util.Scanner;

/**
 * Created by ashvinikumar on 16/11/16.
 */
class ComplexNumber {
    private final double real;
    private final double imaginary;
    public ComplexNumber()
    {
        real=0;
        imaginary=0;
    }
    public ComplexNumber(double real, double imaginary) {
        this.real = real; this.imaginary = imaginary;
    }
    public ComplexNumber sum(ComplexNumber other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new ComplexNumber(r, i);
    }
    public ComplexNumber difference(ComplexNumber other) {
        double r = this.real - other.real;
        double i = this.imaginary - other.imaginary;
        return new ComplexNumber(r, i);
    }
    public void display(ComplexNumber c1,ComplexNumber c2,ComplexNumber c3,ComplexNumber c4)
    {
       System.out.println("sum of "+c1.real+" + "+c1.imaginary+"i"+" && "+c2.real+" + "+c2.imaginary+"i"+" is: "+c3.real+" + "+c3.imaginary+"i");
        System.out.println("Diff of "+c1.real+" + "+c1.imaginary+"i"+" && "+c2.real+" + "+c2.imaginary+"i"+" is: "+c4.real+" + "+c4.imaginary+"i");
    }
}


public class ComplexImp {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real and imag of complex 1 ");
        double a1=sc.nextDouble();
        double b1=sc.nextDouble();
        System.out.println("enter real and imag of complex 2 ");
        double a2=sc.nextDouble();
        double b2=sc.nextDouble();
        ComplexNumber c1 = new ComplexNumber(a1, b1);
        ComplexNumber c2 = new ComplexNumber(a2, b2);
        ComplexNumber sum = c1.sum(c2);
        ComplexNumber difference = c1.difference(c2);
        ComplexNumber aa=new ComplexNumber();
        aa.display(c1,c2,sum,difference);

    }
}
