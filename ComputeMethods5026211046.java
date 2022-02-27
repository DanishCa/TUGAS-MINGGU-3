import javax.swing.JOptionPane;
import java.util.Random;

public class ComputeMethods5026211046 {
	
	public String getUserInputFahren(){
	JOptionPane jop = new JOptionPane();
	String input = jop.showInputDialog("Enter temp in Fahrenheit:");
	return input;
}

	public double fToC(double degreesF){
	return 5/9.0*(degreesF-32);	
} 
	public String getUserInputSideA (){
	JOptionPane jop = new JOptionPane();
	String input = jop.showInputDialog("Enter number for A side: ");
	return input;
}
	public String getUserInputSideB(){
	JOptionPane jop = new JOptionPane();
	String input = jop.showInputDialog("Enter number for B side: ");
	return input;
}
	public double hypotenuse(int a, int b){
	return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

} 	
	public int roll(){
	Random rndNum = new Random();
	int randomNum1 = rndNum.nextInt(6)+1;
	int randomNum2 = rndNum.nextInt(6)+1;
	return (randomNum1 + randomNum2);
	}

}