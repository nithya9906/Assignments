public class HardCodedNumbers{
	public static void main(String []args){
		int num1=27,num2=9;
		System.out.println("Addition of two numbers="+add(num1,num2));
		System.out.println("Subtraction of two numbers="+sub(num1,num2));
		System.out.println("Multiplication of two numbers="+multiply(num1,num2));
		System.out.println("Division of two numbers="+division(num1,num2));
	}
	static  int add(int n1,int n2)
	{
		return (n1+n2);
	}
	static int sub(int n1,int n2)
	{
		return (n1-n2);
	}
	static int multiply(int n1,int n2)
	{
		return (n1*n2);
	}
	static int division(int n1,int n2)
	{
		return (n1/n2);
	}
}