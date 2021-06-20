import java.util.Scanner;
public class StringComparison{
   public static void main(String args[]){
     int mat[6][6];
	 Scanner in=new Scanner(System.in);
	 for(int i=0;i<6;i++)
	 {
		 for(int j=0;j<6;j++)
		 {
			 mat[i][j]=in.nextInt();
		 }
	 }
	 int result
   }
   public static String findFirstWord(String str1,String str2){
	    
	    if(str1.toLowerCase().charAt(0)<str2.toLowerCase().charAt(0))
		{
			return str1;
		}
		else
		{
			return str2;
		}
	}
  
}
