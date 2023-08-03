package swings_dsa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackDatastructure = new JLabel("STACK DATASTRUCTURE");
		lblStackDatastructure.setBounds(123, 10, 187, 19);
		lblStackDatastructure.setForeground(new Color(245, 64, 54));
		lblStackDatastructure.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblStackDatastructure);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER STACK LENGTH :");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(23, 65, 127, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENTER THE INTEGER ELEMENT :");
		lblNewLabel_2_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(23, 105, 173, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnCreateStack = new JButton("CREATE STACK");
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating the stack here//
				int len=Integer.valueOf(textField.getText());
				size=len;
				s=new int[len];
				String message="Stack of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCreateStack.setForeground(new Color(0, 128, 128));
		btnCreateStack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreateStack.setBounds(295, 63, 118, 19);
		contentPane.add(btnCreateStack);
		
		JButton btnNewButton_1_1 = new JButton("PUSH");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code//
				for(int i=0;i<s.length;i++) {
				if(top==size-1) {
					String message="push not possible";
					JOptionPane.showMessageDialog(contentPane, message);
					break;
				}
				else {
				int ele=Integer.valueOf(textField_1.getText());
				++top;
				s[top]=ele;
				String message="element "+ele+" is pushed";
				JOptionPane.showMessageDialog(contentPane, message);
				textField_1.setText("");
				}
				}
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 128, 64));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBounds(292, 101, 89, 19);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_3_1 = new JButton("DISPLAY");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code//
				String message="";
				for(int i=top;i>=0;i--) {
					message=message+" "+s[i];
				}
				textField_2.setText(message);
			}
		});
		btnNewButton_3_1.setForeground(new Color(153, 96, 174));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3_1.setBounds(158, 178, 89, 23);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1 = new JButton("POP AN ELEMENT");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code//
				if(top==-1) {
					String message="pop not possible";
					JOptionPane.showMessageDialog(contentPane, message);
					}
				else {
				int ele=s[top];
				top--;
				String message="element "+ele+" is poped";
				JOptionPane.showMessageDialog(contentPane, message);
				}	
			}
		});
		btnNewButton_2_1.setForeground(new Color(0, 128, 64));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1.setBounds(123, 144, 153, 23);
		contentPane.add(btnNewButton_2_1);
		
		textField = new JTextField();
		textField.setBounds(196, 62, 89, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 102, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 212, 229, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
