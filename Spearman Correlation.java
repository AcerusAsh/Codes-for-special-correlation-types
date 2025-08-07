import java.util.*;
public class Spearman
{
    static void main()
    {
        double rho;
        double t;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of observations");
        n= sc.nextInt();
        double p[]= new double[n];
        double r[]=new  double[n];
        System.out.println("Enter the ordinal scores of variable A");
        for(int a=0;a<n;++a)
        {
            p[a]= sc.nextDouble();
        }
        System.out.println("Enter the ordinal scores of variable B");
        for(int b=0;b<n;++b)
        {            
            r[b]= sc.nextDouble();
        }
        double sig2= 0;
        for(int c=0;c<n;c++)
        {
            sig2= sig2 + Math.pow((p[c] - r[c]),2);
        }
        rho= 1 - (6*(sig2))/(n*((n*n) - 1));
        System.out.println("The spearman correlation is: "+rho);
    }
}

