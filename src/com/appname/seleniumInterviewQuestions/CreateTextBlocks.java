package com.appname.seleniumInterviewQuestions;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreateTextBlocks {

	public static void main(String[] args) {
		     //Create and set up the window
		 JFrame frame = new JFrame("Create TextField ");
	        // Create JTextField object
	        JTextField textField = new JTextField();
	        // Set Text field properties
	        textField.setBounds(50, 50, 50, 50);
	        textField.setText("Learn Java");
	  	   // Add Text field to JFrame
	        frame.add(textField);
	        // Set JFrame size and Make it visible
	        frame.setSize(300, 300);
	        frame.setVisible(true);
	     }
}
