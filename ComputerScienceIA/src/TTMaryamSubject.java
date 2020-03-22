import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class TTMaryamSubject extends JFrame {

	private JPanel contentPane;
	private JTextField txtSelectSubject;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTMaryamSubject frame = new TTMaryamSubject();
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
	public TTMaryamSubject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSelectSubject = new JTextField();
		txtSelectSubject.setText("Select maryam's Subject ");
		txtSelectSubject.setBounds(237, 11, 137, 20);
		contentPane.add(txtSelectSubject);
		txtSelectSubject.setColumns(10);
		
		JList list = new JList();
		list.setBounds(28, 204, 218, -95);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(10, 45, 1, 1);
		contentPane.add(list_1);
	}
}
