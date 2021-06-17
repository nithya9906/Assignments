import java.util.Scanner;
class Calculation{
	int num1;
	int num2;
	Calculation(int a,int b)
	{
		num1=a;
		num2=b;
	}
	int add(int n1,int n2)
	{
		return (n1+n2);
	}
	int sub(int n1,int n2)
	{
		return (n1-n2);
	}
	int multiply(int n1,int n2)
	{
		return (n1*n2);
	}
	int division(int n1,int n2)
	{
		return (n1/n2);
	}
}
public class ArithmeticOperation{
	public static void main(String []args){
		int num1,num2,ch;
		Scanner in=new Scanner(System.in);
		num1=in.nextInt();
		num2=in.nextInt();
		Calculation cal=new Calculation(num1,num2);
		do{
			System.out.println("Select 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Addition of two numbers="+cal.add(num1,num2));
					break;
				case 2:
					System.out.println("Subtraction of two numbers="+cal.sub(num1,num2));
					break;
				case 3:
					System.out.println("Multiplication of two numbers="+cal.multiply(num1,num2));
					break;
				case 4:
					System.out.println("Division of two numbers="+cal.division(num1,num2));
					break;
				default:
					System.out.println("Invalid choice\n");
			}
		
		}while(ch>0 && ch<5);
	}	
	
}