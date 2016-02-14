import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class Ptice 
{
	Scanner gold = new Scanner(System.in);
	int round;
	int num1=0,num2=0,num3=0;
	String a;
	
	
	public String getData()
	{
		
		round = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Round : ","Input",JOptionPane.QUESTION_MESSAGE));
		
		while(round <=0 || round >100)
		{
			JOptionPane.showMessageDialog(null,"Error Round","Message",JOptionPane.ERROR_MESSAGE);
			round = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Round : ","Input",JOptionPane.QUESTION_MESSAGE));
		}
		System.out.println();

		a = JOptionPane.showInputDialog(null,"Enter Answer : ","Input",JOptionPane.QUESTION_MESSAGE);

		while(a.length() != round)
		{
			JOptionPane.showMessageDialog(null,"Error Answer","Message",JOptionPane.ERROR_MESSAGE);
			a = JOptionPane.showInputDialog(null,"Enter Answer : ","Input",JOptionPane.QUESTION_MESSAGE);
		}
		System.out.println();
		return (a);
	}
	
	public void Calc(String Adrian,String Bruno , String Goran,String answer)
	{
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
	}
	
	public void Print()
	{
		if(num1 == num2)
		{
			if(num1 == num3)
			{
				JOptionPane.showMessageDialog(null,num1+"\n"+"Adrian\n"+"Bruno\n"+"Goran","Message",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null,num1+"\n"+"Adrian\n"+"Bruno\n","Message",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(num2 == num3)
		{
			JOptionPane.showMessageDialog(null,num2+"\n"+"Bruno\n"+"Goran","Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(num1 == num3)
		{
			JOptionPane.showMessageDialog(null,num1+"\n"+"Adrian\n"+"Goran","Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(num1 > num2)
		{
			if(num1 > num3)
			{
				JOptionPane.showMessageDialog(null,num1+"\n"+"Adrian","Message",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null,num3+"\n"+"Goran","Message",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(num2 > num3)
		{
			JOptionPane.showMessageDialog(null,num2+"\n"+"Bruno","Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null,num3+"\n"+"Goran","Message",JOptionPane.INFORMATION_MESSAGE);
			System.out.println(num3);
			System.out.println("Goran");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner gold = new Scanner(System.in);
		String Adrian,Bruno,Goran;	
		String answer;
		Adrian="ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABC";
		Bruno="BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABC";
		Goran="CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABB";
		
		
		Ptice PT = new Ptice();
		answer = PT.getData();
		PT.Calc(Adrian,Bruno,Goran,answer);
		PT.Print();
			
	}

}
