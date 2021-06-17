public class VarArg{
	public static void main(String []args){
		int result=add(3,4,5,6);
		System.out.println("Result="+result);
	}
	static int add(int ...x)
	{
		int sum=0;
		for(int num:x)
		{
			sum=sum+num;
		}
		return sum;
	}
	static int asomeMethod(int String,int d,double...x){
		return 0;
	}
	static int asomeMethod(int ...String,int d,double x){
		return 0;
	}
}