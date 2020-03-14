import java.util.*;
public class collatz
{
	public static void main(String args[])
	{
		int n=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int x=inp.nextInt();
		
		System.out.println("x = "+x);
		while(x!=1)
		{
		if(x%2==0)
			{
				x/=2;
				System.out.println((x*2)+"/2 = "+x);
				n++;
			}
		else
			{
				x=x*3+1;
				System.out.println(((x-1)/3)+"*3+1= "+x);
				n++;
			}
			
				if(x==1)
				{
					break;
				}
		}
		
		System.out.println("No of iterations : "+n);
		System.out.println(dateFormat.format(date));
		
	}
}