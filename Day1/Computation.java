import java.util.Scanner;
public class Computation{
	public static void main(String []args){
		boolean a=true;
		boolean b=false;
		System.out.println("Complement of a:"+!a);
		System.out.println("logical OR of a and b:"+(a|b));
		System.out.println("Computation of (!a&b)|(a&!b):"+((!a&b)|(a&!b)));
	
	}
	
}