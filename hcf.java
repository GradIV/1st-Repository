import java.util.Scanner;
public class hcf{
 int a, d,hcf;
public  hcf(int b,int f){
 a = b;
 d = f;
}
public void calculate(){
 int b = a, f = d;
 for(int i = 1; i<=b && i<=f; i++)//we will use this loop to increment the number "i" till both nums are divisible by it and hcf is found
 if (b%i == 0 && f % i ==0)
  hcf = i;
 System.out.println("HCF is "+hcf);
}
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("the first integer is ");
 int b = sc.nextInt();
 System.out.println("the second integer is ");
 int f = sc.nextInt();
 sc.close();
 hcf obj = new hcf(b,f);
        obj.calculate();

}}
 
 
