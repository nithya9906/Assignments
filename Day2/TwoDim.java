import java.lang.Math;
public class TwoDim{
	public static void main(String []args)
	{
		int i,j;
		double arr[][]=new double[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=Math.random();
			}		
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}	
			System.out.println("\n");
		}
	}
}