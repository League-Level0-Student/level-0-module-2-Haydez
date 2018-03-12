//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		Random gen = new Random();
		r=gen.nextInt(101);
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		

		//4. Limit the random number between 0 and 100

		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		r=gen.nextInt((50)+1)+25;
		//6. Challenge: Limit the random number between -222 and 88

		//1. Print out the value of r
		JOptionPane.showMessageDialog(null, r);
	
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}