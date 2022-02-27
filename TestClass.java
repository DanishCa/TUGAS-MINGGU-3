import javax.swing.JOptionPane;

public class TestClass{
	public static void main (String[] args){

	ComputeMethods5026211046 CM = new ComputeMethods5026211046();
	
	//CONVERTS GIVEN TEMPERATURE IN FAHRENHEIT TO CELCIUS
	String fahrenString = CM.getUserInputFahren();
	double fahrenDouble = Double.parseDouble(fahrenString);
	
	double fahren = CM.fToC(fahrenDouble); 
	
	//COMPUTES THE HYPOTENUSE LENGTH OF A TRIANGLE GIVEN ITS SIDE LENGTH
	String sideA = CM.getUserInputSideA();
	int sideAInt = Integer.parseInt(sideA);
	String sideB = CM.getUserInputSideB();
	int sideBInt = Integer.parseInt(sideB);

	double Hypot = CM.hypotenuse(sideAInt, sideBInt); 
	

	//SIMULATE THE ROLLING OF TWO 6-SIDED DICE AND DISPLAY THEIR SUM
	int diceSum = CM.roll();
	
	
	//PRINTING THE OUTPUT	
	System.out.println("Temp in celcius is " +fahren);
	System.out.println("Hypotenuse is " +Hypot);
	System.out.println("The sum of the dice values is " +diceSum); 
}	
	
}