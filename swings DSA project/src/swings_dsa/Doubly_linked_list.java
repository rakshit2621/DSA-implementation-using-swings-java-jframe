package swings_dsa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doubly_linked_list extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	class Node {
		int data;
		Node prelink;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doubly_linked_list frame = new Doubly_linked_list();
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
	public Doubly_linked_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(249, 249, 227));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 51, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setBounds(73, 11, 283, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(142, 48, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT RARE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rare//
				Node temp;
				int elem;
				elem=Integer.valueOf(textField.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.nextlink = null;
				newnode.prelink = null;
				if (first == null)
				{
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "the element inserted at Rear end");
					textField.setText("");
				}
				else
				{
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					
					temp.nextlink = newnode;
					newnode.prelink = temp;
					JOptionPane.showMessageDialog(contentPane, "the value inserted at rear end");
					textField.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setBounds(267, 47, 107, 23);
		contentPane.add(btnNewButton);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front//
				int elem;
				elem=Integer.valueOf(textField_1.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.nextlink = null;
				newnode.prelink = null;
				if (first == null)
				{
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "the element inserted at Front end");
					textField_1.setText("");
				}
				else
				{
					newnode.nextlink = first;
					first.prelink = newnode;
					first = newnode;
					JOptionPane.showMessageDialog(contentPane, "the value Inserted at front");
					textField_1.setText("");
				}
			}
		});
		btnInsertFront.setForeground(new Color(0, 128, 128));
		btnInsertFront.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInsertFront.setBounds(267, 82, 122, 23);
		contentPane.add(btnInsertFront);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_2.setForeground(new Color(0, 128, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 86, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 79, 107, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("DELETE RARE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rare//
				Node temp;
				if (first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Is Not Possible");
				}
				if (first.nextlink == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deleted Element Is :"+first.data);
					first = null;
				}
				else
				{
				temp = first;
				while (temp.nextlink.nextlink != null) {
					temp = temp.nextlink;
				}
				 String msg="The deleted element is:"+temp.nextlink.data;
				 JOptionPane.showMessageDialog(contentPane, msg);
				System.out.println("The deleted element is" + temp.nextlink.data);
				temp.nextlink = null;
			}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(89, 121, 107, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE FRONT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front//
				if (first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				if (first.nextlink == null)
				{
					String msg="Deleted Element is :"+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first = null;
				}
				else
				{
					String msg="The deleted element is"+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					System.out.println("the deleted element is" + first.data);
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(new Color(0, 128, 128));
		btnNewButton_2.setBounds(221, 121, 115, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY FORWARD");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display forward//
				Node temp;
				if (first == null)
				{
					textField_2.setText("");
					JOptionPane.showMessageDialog(contentPane, "Display is not Possible");
				}
				else if (first.nextlink == null)
				{
					String msg="";
					msg=msg+" "+first.data;
					textField_2.setText(msg);
				}
				else
				{
					String msg=" ";
					temp = first;
					while (temp!= null)
					{
						msg=msg+" "+temp.data+" ";
						temp = temp.nextlink;
					}
					textField_2.setText(msg);
				}
			}
		});
		btnNewButton_3.setForeground(new Color(0, 128, 128));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(240, 240, 240));
		btnNewButton_3.setBounds(55, 172, 141, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("DISPLAY REVERSE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display reverse//
				Node temp;
				if (first == null)
				{
					textField_2.setText("");
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
				}
				else if (first.nextlink == null)
				{
					String str="";
					str=str+" "+first.data;
					textField_2.setText(str);
				}
				else
				{
					String msg="";
					temp = first;
					while (temp.nextlink != null) {
						temp = temp.nextlink;
					}
					while (temp != null)
					{
						msg=msg+" "+temp.data;
						temp = temp.prelink;
					}
					textField_2.setText(msg);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setForeground(new Color(0, 128, 128));
		btnNewButton_4.setBounds(221, 172, 135, 23);
		contentPane.add(btnNewButton_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 213, 257, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
