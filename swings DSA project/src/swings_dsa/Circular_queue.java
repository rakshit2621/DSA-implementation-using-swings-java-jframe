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

public class Circular_queue extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circular_queue frame = new Circular_queue();
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
	public Circular_queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER LENGTH :");
		lblNewLabel_1_1.setBounds(21, 58, 124, 14);
		lblNewLabel_1_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblCircularQueueDatastructure = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblCircularQueueDatastructure.setBounds(92, 11, 277, 19);
		lblCircularQueueDatastructure.setForeground(new Color(245, 64, 54));
		lblCircularQueueDatastructure.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblCircularQueueDatastructure);
		
		JButton btnCreateCircularQueue = new JButton("CREATE ");
		btnCreateCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating the circular-queue here//
				int len=Integer.valueOf(textField.getText());
				size=len;
				q=new int[len];
				String message="Queue of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				}
		});
		btnCreateCircularQueue.setForeground(new Color(0, 128, 128));
		btnCreateCircularQueue.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreateCircularQueue.setBounds(285, 56, 95, 19);
		contentPane.add(btnCreateCircularQueue);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENTER THE INTEGER ELEMENT :");
		lblNewLabel_2_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(21, 96, 173, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_1 = new JButton("PUSH");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert code//
				int ele=Integer.valueOf(textField_1.getText());
				if(count==size) {
					String mes="push not possible";
					JOptionPane.showMessageDialog(contentPane, mes);
				}
				else {
					if(count<size) {
					r=(r+1)%size;
					q[r]=ele;
					count++;
					String mes="element "+ele+" pushed";
					JOptionPane.showMessageDialog(contentPane, mes);
				}
					else {
						String mes="push not possible";
						JOptionPane.showMessageDialog(contentPane, mes);
					}
			}
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 128, 64));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBounds(285, 92, 89, 19);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("POP AN ELEMENT");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code//
				if(count==0) {
					String mes="pop not possible";
					JOptionPane.showMessageDialog(contentPane, mes);
				}
				else {
					if(count>0) {
				       String mes="the element popped is "+q[f];
				       JOptionPane.showMessageDialog(contentPane, mes);
				       q[f]=-1;
				       f=(f+1)%size;
				       count--;
				    }
				    else {
					   String mes="pop not possible";
					   JOptionPane.showMessageDialog(contentPane, mes);
				    }
			     }
			  }
		});
		btnNewButton_2_1.setForeground(new Color(0, 128, 64));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2_1.setBounds(137, 132, 153, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("DISPLAY");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display//
				String diaplay="";
				for(int i=0;i<size;i++) {
					diaplay=diaplay+" "+q[i];
				}
				textField_2.setText(diaplay);
			}
		});
		btnNewButton_3_1.setForeground(new Color(153, 96, 174));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3_1.setBounds(163, 183, 89, 23);
		contentPane.add(btnNewButton_3_1);
		
		textField = new JTextField();
		textField.setBounds(189, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 93, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(74, 217, 277, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
