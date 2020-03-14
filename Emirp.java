import java.util.*;
public class Emirp
{
	public static void main(String args[])
	{
		Scanner inp =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x=inp.nextInt();
		int n=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				n++;
			}
		}
		
		if(n==2)
		{
			System.out.println(x+" is a prime ");
		}
		else
		{
			System.out.println(x+" is not a prime ");
		}
		
		
		
		
		int a=x%10;
		int b=x/10;
		
		String s1=valueof
	}
}