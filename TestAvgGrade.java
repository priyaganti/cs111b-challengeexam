import java.util.Scanner;
public class TestAvgGrade {
	public static void main(String[]args)
	{
		int[] scores = new int[5];
		Scanner keyboard = new Scanner(System.in);
		for(int i = 1; i < 6; i++)
		{
			System.out.print("Enter the score of Test " + i + " : ");
			scores[i-1] = keyboard.nextInt();
		}
		for(int val: scores)
			System.out.println(val);
		//calcAverage(scores[i-1]);
	}		

public static double calcAverage(int[] testValues)
{	sum = 0;
   double average = /5;
}
public static char determineGrade()
{

}