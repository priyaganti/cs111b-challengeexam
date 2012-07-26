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
			char grade = determineGrade(scores[i-1]);
			System.out.println("Grade: " + grade);
		}
		for(int val: scores)
			System.out.println(val);

		double avg = calcAverage(scores);
		System.out.println("Average = " + avg);
	}


	public static double calcAverage(int[] testValues)
	{	
		int sum = 0;
		for(int i = 0; i < testValues.length; i++) {
			sum += testValues[i];
		}
		double average = sum/5;
		return average;

	}

	public static char determineGrade(int testValues)
	{
		if (testValues <= 100 && testValues >= 90)
			return 'A';
		else if(testValues < 89 && testValues >= 80)
			return 'B';
		else if (testValues < 79 && testValues >= 70)
			return 'C';
		else if (testValues < 69 && testValues >= 60)
			return 'D';
		else 
			return 'F';
	}
}
