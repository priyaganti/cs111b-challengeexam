import java.util.Scanner;
public class AverageMeridian 
{
	public static void main (String[]args)
	{
		Scanner Keyboard = new Scanner(System.in);

		int[] num =  new int[6];

		System.out.print("Enter any numbers in an ascending order : " );
		for(int i = 0; i < num.length; i ++ )
			num[i] = Keyboard.nextInt();
		double average = Average(num);
		System.out.println("The Average of the given numbers is: " + average);
		double median = Median(num);
		System.out.println("The Median of the given numbers is: " + median);
	}

	public static double Average(int[] n)
	{
		int sum = 0;
		for( int i = 0; i < n.length; i ++)
		{
			sum += n[i];	
		}
		return sum/n.length;
	} 
	public static double Median(int[] n)
	{
		int middle = n.length/2;
		if(n.length % 2 == 1)
		{
			return n[middle];
		}
		else
		{
			return (n[middle-1] + n[middle])/2.0;

		}	

	}
}
