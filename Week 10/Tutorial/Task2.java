package Tutorial;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class Task2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtResult;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Task2 frame = new Task2();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Task2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setBounds(31, 25, 120, 25);
		contentPane.add(textField);

		textField_1 = new JTextField();
		textField_1.setBounds(196, 25, 120, 25);
		contentPane.add(textField_1);

		txtResult = new JTextField();
		txtResult.setBounds(31, 187, 200, 25);
		contentPane.add(txtResult);

		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(31, 80, 60, 30);
		contentPane.add(btnAdd);

		JButton btnSub = new JButton("-");
		btnSub.setBounds(100, 80, 60, 30);
		contentPane.add(btnSub);

		JButton btnMul = new JButton("*");
		btnMul.setBounds(170, 80, 60, 30);
		contentPane.add(btnMul);

		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(240, 80, 60, 30);
		contentPane.add(btnDiv);

		btnAdd.addActionListener(e -> {
			try {
				double a = Double.parseDouble(textField.getText());
				double b = Double.parseDouble(textField_1.getText());
				txtResult.setText("Result: " + (a + b));
			} catch (Exception ex) {
				txtResult.setText("Invalid");
			}
		});

		btnSub.addActionListener(e -> {
			try {
				double a = Double.parseDouble(textField.getText());
				double b = Double.parseDouble(textField_1.getText());
				txtResult.setText("Result: " + (a - b));
			} catch (Exception ex) {
				txtResult.setText("Invalid");
			}
		});

		btnMul.addActionListener(e -> {
			try {
				double a = Double.parseDouble(textField.getText());
				double b = Double.parseDouble(textField_1.getText());
				txtResult.setText("Result: " + (a * b));
			} catch (Exception ex) {
				txtResult.setText("Invalid");
			}
		});

		btnDiv.addActionListener(e -> {
			try {
				double a = Double.parseDouble(textField.getText());
				double b = Double.parseDouble(textField_1.getText());
				if (b == 0) {
					txtResult.setText("Cannot divide by 0");
				} else {
					txtResult.setText("Result: " + (a / b));
				}
			} catch (Exception ex) {
				txtResult.setText("Invalid");
			}
		});
	}
}