import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class HomeNewquestion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNewQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeNewquestion frame = new HomeNewquestion();
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
	public HomeNewquestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNewQuestion = new JTextField();
		txtNewQuestion.setText("new question");
		txtNewQuestion.setBounds(129, 0, 93, 20);
		contentPane.add(txtNewQuestion);
		txtNewQuestion.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Maryam ", "lillie ", "Amal"}));
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(278, 59, 106, 22);
		contentPane.add(comboBox);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(154, 104, 106, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"english", "urdu", "mathematics", "GP", "physics", "chemistry ", "history", "geography"}));
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(278, 92, 106, 22);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setMaximumRowCount(3);
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(148, 59, 106, 22);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setMaximumRowCount(3);
		comboBox_5.setEditable(true);
		comboBox_5.setBounds(148, 92, 106, 22);
		contentPane.add(comboBox_5);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setMaximumRowCount(3);
		comboBox_7.setEditable(true);
		comboBox_7.setBounds(10, 59, 106, 22);
		contentPane.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setMaximumRowCount(3);
		comboBox_8.setEditable(true);
		comboBox_8.setBounds(10, 92, 106, 22);
		contentPane.add(comboBox_8);
	}
}
