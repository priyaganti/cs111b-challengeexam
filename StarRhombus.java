
public class StarRhombus {

	public static void main(String[] args)
	{
		int starVertical;

		for(starVertical = 0; starVertical < 10; starVertical++ )
		{
			printStars(15);
		}
	}

	public static void printStars(int width)
	{
		int midpoint = width / 2;
		for(int i = 0; i < width; i++)
		{
			if(i == midpoint)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("");
	}
}
