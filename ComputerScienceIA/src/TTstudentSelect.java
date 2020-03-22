import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TTstudentSelect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void HomePage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTstudentSelect frame = new TTstudentSelect();
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
	public TTstudentSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Maryam");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TTMaryamSelectsubject frame = new TTMaryamSelectsubject(); 
				frame.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton.setBounds(167, 75, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_2 = new JButton("Amal");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TTAmalSelectsubject frame = new TTAmalSelectsubject();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(167, 164, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New Student");
		btnNewButton_3.setBounds(301, 210, 123, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("Lillie");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TTLillieSelectsubject frame = new TTLillieSelectsubject();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(167, 120, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("please select student");
		lblNewLabel.setBounds(10, 11, 130, 30);
		contentPane.add(lblNewLabel);
	}
}
