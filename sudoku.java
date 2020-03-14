import java.util.*;
public class sudoku
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner(System.in);
		int x[]={0,0,0,0,0,0,0,0,0};
		int n=0;
			
		int array[][]=
		{
			{3,5,2,9,1,8,6,7,4},
			{8,9,7,2,4,6,5,1,3},
			{6,4,1,7,5,3,2,8,9},
			{7,8,3,5,6,9,4,2,1},
			{9,2,6,1,3,4,7,5,8},
			{4,1,5,8,2,7,9,3,6},
			{1,6,4,3,7,5,8,9,2},
			{2,7,8,4,9,1,3,6,5},
			{5,3,9,6,8,2,1,4,7}
		};
		
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				switch(array[i][j])
				{
					case 1:x[0]++;
					break;
					case 2:x[1]++;
					break;
					case 3:x[2]++;
					break;
					case 4:x[3]++;
					break;
					case 5:x[4]++;
					break;
					case 6:x[5]++;
					break;
					case 7:x[6]++;
					break;
					case 8:x[7]++;
					break;
					case 9:x[8]++;
					break;
					default: System.out.println("Number not found");
				 
				}
			}
		}
		
		
			for(int a=0;a<9;a++)
			{
				if(x[a]==9)
				{
					n++;
				}
			}
			
				if(n==9)
				{
					System.out.println("TRUE");
				}
				else
				{
					System.out.println("FALSE");
				}
	
	}
}