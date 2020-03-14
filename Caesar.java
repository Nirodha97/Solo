import java.util.*;
public class Caesar
{
	public static void main(String args[])
	{
		Scanner inp=new Scanner (System.in);
		System.out.println("Enter the word : ");
		String word=inp.nextLine();
		int n=word.length();
		char arr[]=new char[n];
		System.out.println(word.length());
		for(int i=0;i<n;i++)
		{
			arr[i]=word.charAt(i);
		}
		
		for(int j=0;j<n;j++)
		{
		switch(arr[j])
		{
			case 'a': arr[j]++;
			break;
			case 'b': arr[j]++;
			break;
			case 'c': arr[j]++;
			break;
			case 'd': arr[j]++;
			break;
			case 'e': arr[j]++;
			break;
			case 'f': arr[j]++;
			break;
			case 'g': arr[j]++;
			break;
			case ' ': arr[j]=' ';
			break;
			
			default: System.out.println("Error!!!");
			
		}
		}
		
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"");
		}
		
	
	}
}