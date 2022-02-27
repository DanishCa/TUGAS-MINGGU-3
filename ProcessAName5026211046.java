import javax.swing.JOptionPane;

public class ProcessAName5026211046 {
	

	public static void main(String[] args){
	JOptionPane jop = new JOptionPane();
	String userFirstName = jop.showInputDialog("Insert your first name: ");
	String userLastName = jop.showInputDialog("Insert your last name: ");
	

/*	jop.showMessageDialog(
	null,
	userFirstName.length() + "\n"+
	"Your name is: " + userLastName + ", " + userFirstName.charAt(0),
	"Processed Name",
	1); */
	
	System.out.println(userFirstName.length());
	System.out.println("Your name is: " + userFirstName + ", " + userLastName.charAt(0));
}


}