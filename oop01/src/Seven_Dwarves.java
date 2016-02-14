import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class Seven_Dwarves 
{
	Scanner gold = new Scanner(System.in);
	int num1,num2,num3,num4,num5,num6,num7,num8,num9,sum;
	
	public void getData()
	{
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People1 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num1 >= 100)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People1 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People2 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num2 >= 100 || num2 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People2 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People3 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num3 >= 100 || num3 == num2 || num3 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People3 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People4 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num4 >= 100 || num4 == num3 || num4 == num2 || num4 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People4 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People5 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num5 >= 100 || num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People5 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num6 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People6 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num6 >= 100 || num6 == num5 || num6 == num4 || num6 == num3 || num6 == num2 || num6 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num6 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People6 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num7 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People7 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num7 >= 100 || num7 == num6 || num7 == num5 || num7 == num4 || num7 == num3 || num7 == num2 || num7 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num7 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People7 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num8 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People8 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num8 >= 100 || num8 == num7 || num8 == num6 || num8 == num5 || num8 == num4 || num8 == num3 || num8 == num2 || num8 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num8 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People8 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		num9 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People9 : ","Input",JOptionPane.QUESTION_MESSAGE));
		while(num9 >= 100 || num9 == num8 || num9 == num7 || num9 == num6 || num9 == num5 || num9 == num4 || num9 == num3 || num9 == num2 || num9 == num1)
		{
			JOptionPane.showMessageDialog(null,"Error Score","Message",JOptionPane.ERROR_MESSAGE);
			num9 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter People9 : ","Input",JOptionPane.QUESTION_MESSAGE));
			System.out.println();
		}
		
		
		sum = num1+num2+num3+num4+num5+num6+num7+num8+num9;
	}
	
	public void Print()
	{
		if((sum - num1 - num2) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num1 - num3) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num1 - num4) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num1 - num5) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num1 - num6) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num1 - num7) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num1 - num8) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num1 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num2 - num3) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num2 - num4) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num2 - num5) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num2 - num6) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num2 - num7) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num2 - num8) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num2 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num3 - num4) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num3 - num5) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num3 - num6) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num3 - num7) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num3 - num8) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num3 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num4 - num5) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num6+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num4 - num6) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num4 - num7) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num4 - num8) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num4 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num5 - num6) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num7+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num5 - num7) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num5 - num8) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num5 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num6 - num7) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num8+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num6 - num8) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num6 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num7 - num8) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num9,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num7 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((sum - num8 - num9) == 100)
		{
			JOptionPane.showMessageDialog(null,"Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7,"Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Error Score All","Message",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static void main(String[] args) 
	{		
		Seven_Dwarves SD = new Seven_Dwarves();
		SD.getData();
		SD.Print();
	}
		
}
