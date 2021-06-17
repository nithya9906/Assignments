import java.util.*;
public class VowelsCount{
	static int vowelsCount(String line)
	{
		int count=0;
		for(int i=0;i<line.length();i++)
		{ 
			char ch=line.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();
		int count=vowelsCount(line);
		System.out.println("Number of vowels in given sentence is "+count);
	}
}