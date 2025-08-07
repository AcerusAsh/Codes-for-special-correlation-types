import java.util.*;
class Phi_coefficient
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b,c,d");
        // 0,0 is a; 0,1 is b; 1,0 is c; 1,1 is d
        int[] data = new int[4];
        for (int i= 0; i<4;i++)
        {
           data[i]= sc.nextInt();
        }
        int a= data[0];
        int b= data[1];
        int c= data[2];
        int d= data[3];
        
        double phi = ((a*d)-(b*c))/(Math.sqrt((a+b)*(c+d)*(a+c)*(b+d)));
        System.out.println("Phi-coefficient correlation value is "+phi);
    }
}
