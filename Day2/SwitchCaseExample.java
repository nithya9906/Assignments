import java.util.*;
public class SwitchCaseExample{
	public static void main(String []args)
	{
		char choice;
		Scanner in=new Scanner(System.in);
		do{
			choice=in.next().charAt(0);
			switch(choice)
			{
				case '1':
					System.out.println("Moving Right");
					break;
				case '2':
					System.out.println("Moving Left");
					break;
				case '3':
					System.out.println("Moving Up");
					break;
				case '4':
					System.out.println("Moving Bottom");
					break;
				case 'q':
					System.exit(0);
				default:
					System.out.println("Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
			}
		}while(true);
	}
}