package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 616, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(57, 25, 368, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + button_7.getText();
				textField.setText(EnterNumber);
			}
		});
		button_7.setBounds(27, 118, 97, 25);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(159, 118, 97, 25);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(292, 118, 97, 25);
		frame.getContentPane().add(button_9);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(27, 183, 97, 25);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(169, 183, 97, 25);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(292, 183, 97, 25);
		frame.getContentPane().add(button_6);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(27, 262, 97, 25);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(159, 262, 97, 25);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(292, 262, 97, 25);
		frame.getContentPane().add(button_3);
		
		JButton button_plus = new JButton("+");
		button_plus.setBounds(431, 129, 97, 25);
		frame.getContentPane().add(button_plus);
		
		JButton button_equal = new JButton("=");
		button_equal.setBounds(431, 183, 97, 25);
		frame.getContentPane().add(button_equal);
	}
}
