
public class MatrixChallenge
	{

	public static void main(String[] args)
		{
		challenge1();	
		challenge2();
		System.out.println("");
		challenge3();
		}
	public static void challenge1()
		{
		int [] [] myMatrix = new int [3][2];
		int num = 10;
		
		for(int row = 0; row < myMatrix.length; row++)
			{
			for(int col = 0; col < myMatrix[0].length; col++)
				{
				myMatrix[row][col] = num;	
				num = num + 10;
				}
			}
		System.out.println(myMatrix[2][1]);
		}
	//challenge 2
	public static void challenge2()
		{
		String [][] myMatrix = new String [4][3];
		
		for(int row = 0; row < myMatrix.length; row++)
			{
			for(int col = 0; col < myMatrix[0].length; col++)
				{
				myMatrix[row][col] = "MHS";	
				}
			}
		//print it
		for(int rowTwo = 0; rowTwo < myMatrix.length; rowTwo++)
			{
			System.out.println();
			for(int colTwo = 0; colTwo < myMatrix[0].length; colTwo ++)
				{
				System.out.print(myMatrix[rowTwo][colTwo] + "   ");	
				}
			}
		}
	//challenge 3
	public static void challenge3()
		{
		int [][] myMatrix = new int [3][3];
		int counter = 0;
		
		for(int row = 0; row < myMatrix.length; row++)
			{
			for(int col = 0; col < myMatrix.length; col++)
				{
				counter ++;
				myMatrix[row][col]= counter;
				}
			}
		for(int rowTwo = 0; rowTwo < myMatrix.length; rowTwo++)
			{
			System.out.println();
			for(int colTwo = 0; colTwo < myMatrix[0].length; colTwo++)
				{
				System.out.print(myMatrix[rowTwo][colTwo] + "  ");	
				}
			}
		int sum = myMatrix[0][0] + myMatrix[0][2] + myMatrix[2][0] + myMatrix[2][2];
		System.out.println("");
		System.out.println("The sum of the four corners is " + sum);
		}
	

	}
