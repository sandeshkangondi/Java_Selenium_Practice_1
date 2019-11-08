package Sandesh_Program_Practice.Sandesh_Program_Practice;
import javax.swing.JOptionPane;

public class GUI {
public static void main(String args[]){
	
	
	int a[] = {1,2,3};

	String fn = JOptionPane.showInputDialog("Enter the first number");
	String sn = JOptionPane.showInputDialog("Enter the second number");
	
	int x = Integer.parseInt(fn);
	int y = Integer.parseInt(sn);
	
	int sum;
	sum = x+y;
	
	JOptionPane.showMessageDialog(null, "The sum is " + sum);
}
}
