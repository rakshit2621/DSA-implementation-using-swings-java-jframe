package swings_dsa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2273016471608946845L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER QUEUE LENGTH :");
		lblNewLabel_1_1.setBounds(21, 55, 127, 14);
		lblNewLabel_1_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1_1);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(282, 16, 1, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setForeground(Color.WHITE);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(245, 64, 54));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 11, 194, 19);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(38, 54, 135, 14);
		contentPane_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(183, 51, 86, 20);
		contentPane_1.add(textField);
		
		JButton btnNewButton = new JButton("CREATE ARRAY");
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(285, 52, 118, 19);
		contentPane_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE INTEGER ELEMENT :");
		lblNewLabel_2.setForeground(new Color(0, 128, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 91, 173, 14);
		contentPane_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 88, 92, 20);
		contentPane_1.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER POSITION :");
		lblNewLabel_3.setForeground(new Color(0, 128, 192));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(74, 128, 99, 14);
		contentPane_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 125, 86, 20);
		contentPane_1.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.setForeground(new Color(0, 128, 64));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(285, 124, 89, 23);
		contentPane_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER ELEMENT POSITION TO DELETE :");
		lblNewLabel_4.setForeground(new Color(0, 128, 192));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 170, 218, 14);
		contentPane_1.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(223, 167, 86, 20);
		contentPane_1.add(textField_3);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setForeground(new Color(0, 128, 64));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(319, 166, 89, 23);
		contentPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY");
		btnNewButton_3.setForeground(new Color(153, 96, 174));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(180, 199, 89, 23);
		contentPane_1.add(btnNewButton_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(108, 230, 244, 20);
		contentPane_1.add(textField_4);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(183, 79, 20, -30);
		contentPane_1.add(horizontalStrut);
		
		JLabel lblQueueDatastructure = new JLabel("QUEUE DATASTRUCTURE");
		lblQueueDatastructure.setForeground(new Color(245, 64, 54));
		lblQueueDatastructure.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQueueDatastructure.setBounds(119, 16, 194, 19);
		contentPane.add(lblQueueDatastructure);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENTER THE INTEGER ELEMENT :");
		lblNewLabel_2_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(21, 94, 173, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnCreateQueue = new JButton("CREATE QUEUE");
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating the queue here//
				int len=Integer.valueOf(textField_5.getText());
				size=len;
				q=new int[len];
				String message="Queue of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				}
		});
		btnCreateQueue.setForeground(new Color(0, 128, 128));
		btnCreateQueue.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreateQueue.setBounds(306, 53, 118, 19);
		contentPane.add(btnCreateQueue);
		
		JButton btnNewButton_1_1 = new JButton("INSERT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert code//
				if(r==size-1) {
					String message="push not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
				int ele=Integer.valueOf(textField_6.getText());
				++r;
				q[r]=ele;
				String message="element "+ele+" is pushed";
				JOptionPane.showMessageDialog(contentPane, message);
				textField_1.setText("");
				}
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 128, 64));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBounds(316, 94, 89, 19);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("DELETE AN ELEMENT");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code//		
				if(r==-1 || f>r) {
					String message="pop not possible";
					JOptionPane.showMessageDialog(contentPane, message);
					}
				else {
				String message="element "+q[f]+" is poped";
				q[f]=-1;
				f++;
				JOptionPane.showMessageDialog(contentPane, message);
				}	
			}
		});
		btnNewButton_2_1.setForeground(new Color(0, 128, 64));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1.setBounds(141, 135, 153, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("DISPLAY");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			String diaplay="";
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<q.length;i++) {
					diaplay=diaplay+q[i]+" ";
				}
				textField_7.setText(diaplay);
			}
		});
		btnNewButton_3_1.setForeground(new Color(153, 96, 174));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3_1.setBounds(168, 173, 89, 23);
		contentPane.add(btnNewButton_3_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(197, 52, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(197, 91, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(85, 207, 268, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}

}
