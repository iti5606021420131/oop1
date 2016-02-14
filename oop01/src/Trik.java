import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class Trik 
{
	boolean num1= true,num2=false,num3=false,b=false;
	
	public void getData(String round)
	{
		for(int i=0;i<round.length();i++)
		{
			char a;
			a = round.charAt(i);
			if((a != 'A') && (a != 'B') && (a != 'C'))
			{
				JOptionPane.showMessageDialog(null,"Error","Message",JOptionPane.ERROR_MESSAGE);
				round = " ";
			}
		}
	}
	
	public void Calc(String round)
	{
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
	}
	
	public void Print(String round)
	{

		if(round.equals(" "))
		{
			
		}
		else if(num1)
		{
			JOptionPane.showMessageDialog(null,"1","Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(num2)
		{
			JOptionPane.showMessageDialog(null,"2","Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(num3)
		{
			JOptionPane.showMessageDialog(null,"3","Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner gold = new Scanner(System.in);
		String round;
		
		round = JOptionPane.showInputDialog(null,"Enter Input : ","Input",JOptionPane.QUESTION_MESSAGE);
		
		Trik TK = new Trik();
		TK.getData(round);
		TK.Calc(round);
		TK.Print(round);
	}

}
