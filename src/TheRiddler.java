import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		String riddle="riverbed";
		String guess= JOptionPane.showInputDialog("Whathas abed but never sleeps?");
	if(guess.equals(riddle)) {
		JOptionPane.showMessageDialog(null,"Correct!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong! it's" + riddle);
	}

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	}
}

