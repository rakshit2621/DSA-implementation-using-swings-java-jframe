package swings_dsa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Arrays extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private int a[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arrays frame = new Arrays();
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
	public Arrays() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 224));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(245, 64, 54));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 11, 194, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1.setBounds(38, 54, 135, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(183, 51, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE ARRAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array//
				int len=Integer.valueOf(textField.getText());
				a=new int[len];
				String message="Array of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBounds(285, 52, 118, 19);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE INTEGER ELEMENT :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(0, 128, 192));
		lblNewLabel_2.setBounds(10, 91, 173, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 88, 92, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER POSITION :");
		lblNewLabel_3.setForeground(new Color(0, 128, 192));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(74, 128, 99, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(183, 125, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for inserting //
				int ele=Integer.valueOf(textField_1.getText());
				int pos=Integer.valueOf(textField_2.getText());
				if(pos>=0 && pos<Integer.valueOf(textField.getText())) {
				a[pos]=ele;
				textField_1.setText("");
				textField_2.setText("");
				String message=ele+" has been inserted at position "+pos;
		  	    JOptionPane.showMessageDialog(contentPane, message);
		  	    }
				else {
					String message="position "+pos+" is invalid";
			  	    JOptionPane.showMessageDialog(contentPane, message);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(0, 128, 64));
		btnNewButton_1.setBounds(285, 124, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER ELEMENT POSITION TO DELETE :");
		lblNewLabel_4.setForeground(new Color(0, 128, 192));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 170, 218, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(223, 167, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deleting the element//
				
				int pos=Integer.valueOf(textField_3.getText());
				if(a[pos]==0) {
					String message="position "+pos+" is empty";
			  	    JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					int ele=a[pos];
					a[pos]=0;
					String message="element "+ele+" at position "+pos+" is deleted";
			  	    JOptionPane.showMessageDialog(contentPane, message);
			  	  textField_3.setText("");
		        	}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(0, 128, 64));
		btnNewButton_2.setBounds(319, 166, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code to display the array//
				String text="";
				for(int i=0;i<a.length;i++) {
					text=text+" "+a[i];					
			}
				textField_4.setText(text);
			}
		});
		btnNewButton_3.setForeground(new Color(153, 96, 174));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(180, 199, 89, 23);
		contentPane.add(btnNewButton_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 230, 244, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(183, 79, 20, -30);
		contentPane.add(horizontalStrut);
	}
}
