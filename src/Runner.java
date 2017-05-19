import javax.swing.JOptionPane;

/* INSTRUCTIONS
 * 1. Create FinalExam_lastName Java Project
 * 2. Create class "Runner," and class "Converter"
 * 3. Instantiate both classes in main
 * 4. Use JOP's for all I/O -- do not leave any syso you might have
 *    used for debugging
 * 5. In myRunner.enterInteger(); tell allowable range is 0 - 255,
 *    and test for that range; if outside of that range tell them
 *    and ask for another try at entering a base-10 number 0-255
 * 6. Complete all necessary code, below
 * 7. Create and use a Git repository
 * 8. Create and use a GitHub repository
 * 9. Show Mr. M for a grade!
 */

public class Runner {

	public static void main(String[] args) {

		int intBase10 = 0;
		String hexAnswer = "";

		Runner myRunner = new Runner();
		Converter myConverter = new Converter();

		myRunner.welcome();

		intBase10 = myRunner.enterInteger();

		hexAnswer = myConverter.changeToHex(intBase10);

		// for testing, remove all syso when done
		// System.out.println(
		// "0-255 entry: " + intBase10 + ", hex conversion: " +
		// Integer.toHexString(intBase10).toUpperCase());
		JOptionPane.showMessageDialog(null,
				" 0-255 entry: " + intBase10 + ", hex conversion: " + Integer.toHexString(intBase10).toUpperCase());
		// now JOP the answer
		// then JOP "Do you want to enter another 0-255 Yes or No"
		int poop = JOptionPane.showConfirmDialog(null, "Would you like to enter a new number?");
		// System.out.println(poop);

		if (poop == 1) {
			System.exit(0);
		}

		else if (poop == 0) {
			myRunner.main(null);
		}

		else {
			JOptionPane.showMessageDialog(null, "Request has been cancelled");
		}

		// place this in a loop, keep looping as long as they answer Yes

	}

	private int enterInteger() {
		// int input = 0;
		String input = "";
		input = JOptionPane.showInputDialog(null, "Input a number between 0-225");
		int output = Integer.valueOf(input);
		return output;
	}

	private void welcome() {
		JOptionPane.showMessageDialog(null,
				"Welcome, this program converts base-10 integers " + "between 0-255 to hexadecimal");
	}

}
