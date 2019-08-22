package swing.firstProgram;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener { 
	private JLabel label;
	private JTextField textField;
	private JButton button;
	public MyFrame() throws HeadlessException  {
		super();
		label = new JLabel();
		label.setText("Enter yourn name");
		textField = new JTextField("Enter your name");
		button = new JButton("Show my name");
		this.setTitle("First Swing Frame");
		this.setSize(400,300);
		this.setLayout(new FlowLayout());
		this.add(label);
		this.add(textField);
		this.add(button);
		button.addActionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		System.out.println(textField.getText());
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) { 
		JOptionPane.showMessageDialog(this, "Hello "+textField.getText());
		// TODO Auto-generated method stub
		
	}
	
	

}
