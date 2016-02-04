import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class Ptice {

	public static void main(String[] args) 
	{
		Scanner gold = new Scanner(System.in);
		int round,num1=0,num2=0,num3=0;
		String Adrian,Bruno,Goran,answer="";
		Adrian="ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABC";
		Bruno="BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABC";
		Goran="CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABB";
		
		System.out.printf("Enter Round : ");
		round = gold.nextInt();
		while(round <=0 || round >100)
		{
			System.out.println("Error Round");
			System.out.printf("Enter Round : ");
			round = gold.nextInt();
		}
		System.out.println();

		System.out.printf("Enter Answer : ");
		answer = gold.next();
		while(answer.length() != round)
		{
			System.out.println("Error Answer");
			System.out.printf("Enter Answer : ");
			answer = gold.next();
		}
		System.out.println();
		
		
		for(int i=0;i<round;i++)
		{
			if(answer.charAt(i) == Adrian.charAt(i))
			{
				num1 = num1 + 1;
			}
			if(answer.charAt(i) == Bruno.charAt(i))
			{
				num2 = num2 + 1;
			}
			if(answer.charAt(i) == Goran.charAt(i))
			{
				num3 = num3 + 1;
			}
		}
		
		
		
		if(num1 == num2)
		{
			if(num1 == num3)
			{
				System.out.println(num1);
				System.out.println("Adrian");
				System.out.println("Bruno");
				System.out.println("Goran");
			}
			else
			{
				System.out.println(num1);
				System.out.println("Adrian");
				System.out.println("Bruno");
			}
		}
		else if(num2 == num3)
		{
			System.out.println(num2);
			System.out.println("Bruno");
			System.out.println("Goran");
		}
		else if(num1 == num3)
		{
			System.out.println(num1);
			System.out.println("Adrian");
			System.out.println("Goran");
		}
		else if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println(num1);
				System.out.println("Adrian");
			}
			else
			{
				System.out.println(num3);
				System.out.println("Goran");
			}
		}
		else if(num2 > num3)
		{
			System.out.println(num2);
			System.out.println("Bruno");
		}
		else 
		{
			System.out.println(num3);
			System.out.println("Goran");
		}
	}

}
