import java.util.Scanner;
public class BiggestNumber{
	public static void main(String []args){
		int num1,num2,num3;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		num1=in.nextInt();
		num2=in.nextInt();
		num3=in.nextInt();
		if((num1>num2) && (num1>num3))
		{
			System.out.println("Biggest number is "+num1);
		}
		else if((num2>num1) && (num2>num3))
		{
			System.out.println("Biggest number is "+num2);
		}
		else 
		{
			System.out.println("Biggest number is "+num3);
		}
	}
	
}