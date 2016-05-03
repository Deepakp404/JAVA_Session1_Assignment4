
public class Session1_Assignment4 
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 10;
		int result;
		int Action = 5;
		
		switch(Action)		
		{
		case 1:		
			result = x + y * 2;
			System.out.println("x + y * 2 = " + result);
			break;	
		case 2:		
			result = x - y + 2;
			System.out.println("x - y + 2 = " + result);
			break;		
		case 3:
			result = (x + y) * 2;
			System.out.println("(x + y) * 2 = " + result);
			break;
		case 4:
			result = y%x;
			System.out.println("y%x = " + result);
			break;
		default:
			System.out.println("Enter correction action");
			break;			
		}
		
		
	}
}
