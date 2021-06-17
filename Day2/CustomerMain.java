import java.util.*;
class Customer{
	private int custId;
	private String name;
	private String address;
	static int customerCount=0;
	static final String shopName="Alexander Shop";
	private double amount=0.0;
	public Customer()
	{
		customerCount++;
		custId=0;
		name="";
		address="";
	}
	public Customer(int id,String name,String addr)
	{
		custId=id;
		name=name;
		address=addr;
	}
	public void getData()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter customer id:");
		custId=in.nextInt();
		System.out.println("Enter customer name:");
		name=in.next();
		System.out.println("Enter customer address:");
		address=in.next();
	}
	public void display()
	{
		System.out.println("ID:"+custId);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		
	}
	public double calculateBill(double a,double b)
	{
		 amount=a+b;
		 return amount;
	}
	public double calculateBill(double a,double b,double c)
	{
		amount=a+b+c;
		return amount;
	}
}
public class CustomerMain{
	public static void main(String []args)
	{
		Customer c1=new Customer();
		Customer c2=new Customer();
		c1.getData();
		double amount=c1.calculateBill(22.0,34.0,75.0);
		c2.getData();
		System.out.println("Customer details of "+Customer.shopName);
		c1.display();
		System.out.println("Amount: "+amount);
		amount=c2.calculateBill(22.0,66.0);
		c2.display();
		System.out.println("Amount: "+amount);
		System.out.println("Number of customer visited is "+Customer.customerCount);
		
	}
}
