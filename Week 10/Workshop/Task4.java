package Workshop;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Task4 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Task4 frame = new Task4();
					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}
			}
		});
	}

	public Task4() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		String[] column = {
				"FIRST_NAME",
				"LAST_NAME",
				"ADDRESS",
				"CONTACT_NUMBER",
				"SEMESTER"
		};

		DefaultTableModel model = new DefaultTableModel(column, 0);

		table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 10, 650, 230);

		contentPane.setLayout(null);
		contentPane.add(scrollPane);

		try {

			BufferedReader br = new BufferedReader(new FileReader("student.csv"));

			String line;

			br.readLine();

			while ((line = br.readLine()) != null) {

				String[] data = line.split(",");

				model.addRow(data);

			}

			br.close();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}