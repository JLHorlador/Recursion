import java.util.Scanner;

public class FactorialRecursion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int factorValue = 0;
		System.out.println("Enter a value: ");
		factorValue = input.nextInt();
		System.out.println(factorials(factorValue));
		
		input.close();
	}
	
	public static int factorials(int num)
	{
		if (num > 1)
			num = num * factorials(num - 1);
		else
			return 1;
		return num;	
	}
}