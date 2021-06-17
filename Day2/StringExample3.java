public class StringExample{
	public static void main(String []args)
	{
		String str1="String";
		String str2="String";
		if(str1.equals(str2))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equal");
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equal");
		}
		String fname=new String("Nithya");
		System.out.println(fname.toUpperCase());
		System.out.println(fname.toLowerCase());
		System.out.println(fname.charAt(2));
		String lname="Thanu";
		Sting fullName=fname.concat(lname);
		System.out.println("Full name is "+fullName);
		System.out.println("Length is "+fullName.length());
		String new=str11.replace('i','u');
		System.out.println(new);
		System.out.println(fullName.trim());
	}
}