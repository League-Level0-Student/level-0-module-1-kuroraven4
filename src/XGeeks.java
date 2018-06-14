//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) { 
	String kevin = "invisible";
	String tra = "super tall";
	String diego = "super super super good look";
	String daniel = "super strong";
	String name = JOptionPane.showInputDialog("Enter a name of someone at your table.");
if (name.equals("daniel")) {
	JOptionPane.showMessageDialog(null,"Daniel's superpower is," + daniel);
}

if (name.equals("tra")) {
	JOptionPane.showMessageDialog(null,"Tra's superpower is," + tra);
	
}

if (name.equals("kevin")){
	JOptionPane.showMessageDialog(null, "Kevin's Superpower is," + kevin);
	
}

if (name.equals("diego")) {
	JOptionPane.showMessageDialog(null, "Diego's super power is," + diego);
	
}

		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}

