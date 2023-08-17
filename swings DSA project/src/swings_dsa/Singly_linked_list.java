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
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Singly_linked_list extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	class Node {
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singly_linked_list frame = new Singly_linked_list();
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
	public Singly_linked_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSinglyLinkedList = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblSinglyLinkedList.setBounds(75, 10, 283, 17);
		lblSinglyLinkedList.setForeground(Color.RED);
		lblSinglyLinkedList.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSinglyLinkedList);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 42, 122, 19);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("INSERT RARE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert element at rare//
				Node temp;
				int elem=Integer.valueOf(textField.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "the element inserted at Rear end");
					textField.setText("");
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
					}
					
					temp.link=newnode;
					
					JOptionPane.showMessageDialog(contentPane, "the value inserted at rear end");
					textField.setText("");
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(274, 38, 107, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_2.setForeground(new Color(0, 128, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 76, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front//
				int elem=Integer.valueOf(textField_1.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "the element inserted at Front end");
					textField_1.setText("");
					}
				else
				{
					newnode.link=first;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "the value Inserted at front");
					textField_1.setText("");
				}
			
			}
		});
		btnInsertFront.setForeground(new Color(0, 128, 128));
		btnInsertFront.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInsertFront.setBounds(274, 72, 122, 23);
		contentPane.add(btnInsertFront);
		
		JButton btnNewButton_1 = new JButton("DELETE RARE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//to delete rear//
				Node temp;
				if(first==null)
				{
					textField_2.setText("");
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
				}
				 if(first.link==null)
				{
					 JOptionPane.showMessageDialog(contentPane, " The deleted element is"+first.data);
					first=null;
				}
				 else
				 {
					 temp=first;
					 while(temp.link.link!=null)
					 {
						 temp=temp.link;
					 }
			     String msg="The deleted element is:"+temp.link.data;
				 JOptionPane.showMessageDialog(contentPane, msg);
				 temp.link=null;
				 }
			}
		});
		btnNewButton_1.setForeground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(75, 119, 107, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE FRONT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front//
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
				}
				else if(first.link==null)
				{
					String msg=" Deleleted element is :"+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first=null;
				}
				else
				{
					String msg="The Deleted element is"+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
				first=first.link;
				}
			}
		});
		btnNewButton_2.setForeground(new Color(0, 128, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(243, 119, 115, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display//
			    Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display is not possible");
					textField_2.setText("");
				}
				else if(first.link==null)
				{
					String msg="";
					msg=msg+" "+first.data;
					textField_2.setText(msg);
				}
				else
				{
					String msg="";
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					textField_2.setText(msg);
				}
			}
		});
		btnNewButton_3.setForeground(new Color(0, 128, 128));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(SystemColor.menu);
		btnNewButton_3.setBounds(143, 181, 133, 23);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(142, 41, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 73, 108, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 215, 250, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
