public class ControlStatementsExamples{
	public static void main(String []args){
		
		int day = 2;
		System.out.println("Example of switch case:");
		System.out.print("Today is ");
		switch (day) {
		  case 1:
			System.out.println("Monday");
			break;
		  case 2:
			System.out.println("Tuesday");
			break;
		  case 3:
			System.out.println("Wednesday");
			break;
		  case 4:
			System.out.println("Thursday");
			break;
		  case 5:
			System.out.println("Friday");
			break;
		  case 6:
			System.out.println("Saturday");
			break;
		  case 7:
			System.out.println("Sunday");
			break;
		}
		System.out.println("Example of enhanced forloop case:");
		int employId[]={12,45,33,75,33};
		System.out.println("Employee ids are:");
		for(int id:employId)
		{
			System.out.println(id);
		}
		System.out.println("Example of forloop case:");
		int i,fact=1;  
		int number=5;
		for(i=1;i<=number;i++){    
			fact=fact*i;    
		}    
		System.out.println("Factorial of "+number+" is: "+fact); 
		System.out.println("Example of whileloop case:");
		int remainder,sum=0,temp;    
		int n=454;
		temp=n;    
		while(n>0){    
			remainder=n%10;  
			sum=(sum*10)+remainder;    
			n=n/10;    
	    }    
		if(temp==sum)    
			System.out.println("Number "+temp+" is palindrome number ");    
		else    
			System.out.println("Number "+temp+" is not palindrome number ");    
		  
		System.out.println("Example of dowhileloop case:");
		System.out.println("Print all even number from 1 to 10:");
		int no=1;
		do{
			if((no%2)==0)
			{
				System.out.println(no);
			}
			no++;
		}while(no<11);
		System.out.println("Example of continue statement:");
		System.out.println("Print all numbers from 1 to 10 except multiple of 5:");
		for(int j=1;j<11;j++)
		{
			if(j==5 | j==10)
			{
				continue;
			}
			else
			{
				System.out.println(j);
			}
		}
	}	
	
}