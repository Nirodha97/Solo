import java.util.*;
public class Scrabble
{
	public static void main(String args[])
	{
		String s="challenge";
		int x=s.length();
		int total=0;
		System.out.println(s);
		char arra1[]=new char[x];
		for(int i=0;i<x;i++)
		{
			arra1[i]=s.charAt(i);
		}
		
		for(int j=0;j<x;j++)
		{
			switch(arra1[j])
			{
				case 'c': total+=1;
				break;
				case 'h': total+=2;
				break;
				case 'a': total+=3;
				break;
				case 'l': total+=4;
				break;
				case 'e': total+=5;
				break;
				case 'n': total+=6;
				break;
				case 'g': total+=7;
				break;
				
			}
		}
		System.out.println(total);
		
		
	}
}