package Tutorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Task1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ctextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task1 frame = new Task1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Task1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Clevel = new JLabel("Celsius");
		Clevel.setForeground(new Color(0, 0, 0));
		Clevel.setBounds(44, 10, 65, 12);
		contentPane.add(Clevel);
		
		ctextField = new JTextField();
		ctextField.setBounds(110, 7, 96, 18);
		contentPane.add(ctextField);
		ctextField.setColumns(10);
		
		JLabel fah = new JLabel("Fahrenheit");
		fah.setBounds(44, 90, 116, 12);
		contentPane.add(fah);

		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c = Double.parseDouble(ctextField.getText());
				double f = (c * 9 / 5) + 32;
				fah.setText("Fahrenheit: " + f);
			 
				System.out.println(f);
			}
		});
		btnNewButton.setBounds(95, 49, 84, 20);
		contentPane.add(btnNewButton);
		

	}
}
