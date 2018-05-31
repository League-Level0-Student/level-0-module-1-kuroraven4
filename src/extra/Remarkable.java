package extra;

import javax.swing.JOptionPane;

public class Remarkable { public static void main(String[] args) {
	String question= JOptionPane.showInputDialog("What's your name?");
	
	if(question.equals("Kevin")) {
		JOptionPane.showMessageDialog(null,"Heyo Potato.");
	}
    if(question.equals("Tra")) {
    	JOptionPane.showMessageDialog(null, "");
	}
	
}

}
