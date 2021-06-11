/* 1.b) Write a JAVA program that displays the roots of a quadratic equation 
        ax2+bx+c=0. Calculate the discriminent D and basing on the value of D, 
        describe the nature of roots*/
import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[] args) 
      {
        int a, b, c;
        double root1, root2, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter Value for a: ");
        a = s.nextInt();
        System.out.print("Enter Value for b: ");
        b = s.nextInt();
        System.out.print("Enter Value for c: ");
        c = s.nextInt();
        System.out.println("Given quadratic equation: "+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        if(d > 0)
        {
            System.out.println("Roots are real and unequal...");
            root1 = ( - b + Math.sqrt(d))/(2*a);
            root2 = ( - b - Math.sqrt(d))/(2*a);
            System.out.println("First root is: "+root1);
            System.out.println("Second root is: "+root2);
        }
        else if(d == 0)
        {
            System.out.println("Roots are real and equal...");
            root1 = ( - b + Math.sqrt(d))/(2*a);
            System.out.println("Root: "+root1);
        }
        else
        {
            System.out.println("Roots are imaginary...");
        }
    }
}
