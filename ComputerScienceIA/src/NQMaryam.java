import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.util.*;
public class NQMaryam extends JFrame {

	private JPanel contentPane;
	// String Arrays for the select chapter drop down
	private String[][] chapters = {{("writing"), ("reading")} , 
			{("wrijyting"), ("readijyjng")},
			{("m1"), ("m2")},
			{("ph1"), ("ph3")},
			{("cs2"), ("cs1")},
			{("chem1"), ("chem2")},
			{("jgie"), ("ogeo")},
			{("his"), ("her")},
			{("isl1"), ("isl2")}};
	private String[] subjects = {"English", "Urdu", "Maths", "Physics", "Computer Science", "Chemistry", "Geography", "History", "Islamiyat"};
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NQMaryam frame = new NQMaryam();
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
	public NQMaryam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(subjects));
		comboBox.setBounds(110, 11, 103, 22);
		contentPane.add(comboBox);


		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select chapter"}));
		comboBox_1.setBounds(110, 43, 103, 22);
		contentPane.add(comboBox_1);
		//if statements to show correct chapters in the dropdown menu
		

		JLabel lblNewLabel = new JLabel("Select Subject");
		lblNewLabel.setBounds(22, 15, 83, 14);
		contentPane.add(lblNewLabel);


		JLabel lblSelectChaptert = new JLabel("Select chapter");
		lblSelectChaptert.setBounds(10, 40, 83, 14);
		contentPane.add(lblSelectChaptert);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indexofSub = Arrays.asList(subjects).indexOf(comboBox.getSelectedItem().toString());
				comboBox_1.setModel(new DefaultComboBoxModel(chapters[indexofSub]));
				
			}
		});
		btnNewButton.setBounds(234, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("next");
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(19, 93, 277, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 153, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(265, 153, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 184, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 184, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("C)");
		lblNewLabel_1.setBounds(209, 156, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A)");
		lblNewLabel_2.setBounds(10, 156, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("B)");
		lblNewLabel_2_1.setBounds(10, 187, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("D)");
		lblNewLabel_2_2.setBounds(209, 187, 46, 14);
		contentPane.add(lblNewLabel_2_2);

		contentPane.add(btnNewButton);



	}
}



