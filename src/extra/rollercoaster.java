package extra;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String height=JOptionPane.showInputDialog("how tall are you in inches?");
	int tall = Integer.parseInt(height);
	if (tall>=48) {
		JOptionPane.showMessageDialog(null, "come on in");
	}
	if (tall<48) {
		JOptionPane.showMessageDialog(null, "GET OUTTTTTTT");
	}
}
}
