import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class Trik {

	public static void main(String[] args) 
	{
		Scanner gold = new Scanner(System.in);
		String round;
		boolean num1= true,num2=false,num3=false,b=false;
		
		System.out.printf("Enter Input : ");
		round = gold.next();
		
		for(int i=0;i<round.length();i++)
		{
			char a;
			a = round.charAt(i);
			if((a != 'A') && (a != 'B') && (a != 'C'))
			{
				System.out.println("Error");
				round = " ";
			}
		}
		
		for(int i=0;i<round.length();i++)
		{
			char a;
			a = round.charAt(i);
			if(a == 'A')
			{
				b = num2;
				num2 = num1;
				num1 = b;
			}
			else if(a == 'B')
			{
				b = num3;
				num3 = num2;
				num2 = b;
			}
			else if(a == 'C')
			{
				b = num3;
				num3 = num1;
				num1 = b;
			}
		}
		
		if(round.equals(" "))
		{
			
		}
		else if(num1)
		{
			System.out.println("1");
		}
		else if(num2)
		{
			System.out.println("2");
		}
		else if(num3)
		{
			System.out.println("3");
		}
	}

}
