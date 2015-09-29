import java.util.Scanner;

public class TowersOfHanoi {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int disks = 0;
	
		System.out.println("Enter the number of disks in the Towers of Hanoi game: ");
		disks = input.nextInt();
		
		System.out.println(towers(disks, 'a', 'b', 'c'));
		
		input.close();
	}
	
	public static String towers(int n, char beg, char aux, char end)
	{
		final String MoveCommand = "Move disk " + n + " from " + beg + " to " + end + "\n";
		String result = "";

		if (n == 1)
		{
			return MoveCommand;
		}
		else
		{
			result = towers(n-1, beg, end, aux);
			result += MoveCommand;
			result += towers(n-1, aux, beg, end);
		}
		return result;
	}
}
