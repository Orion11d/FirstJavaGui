package GUI;

import javax.swing.*;

public class FirstGui {

	public static void main(String[] args){
		JFrame frame = new JFrame("Hello!");
		frame.getContentPane().add(new JLabel ("Hello, world!"));
		frame.pack();
		frame.setVisible(true);
}
}
