import java.util.*;
public class Factorial{
	static int factorial(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int result=factorial(num);
		System.out.println("Factorial of "+num+" is "+result);
	}
}