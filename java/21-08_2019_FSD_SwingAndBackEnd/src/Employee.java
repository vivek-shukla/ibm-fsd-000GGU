import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.employeeServices.EmployeeServiceClass;
import comm.jdbc.EmployeeModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
   private EmployeeServiceClass employeeServiceObj;
   private JTextField textField_4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee Id");
		lblEmployeeId.setBounds(10, 11, 69, 24);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(114, 13, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 50, 69, 24);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 52, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 96, 69, 24);
		contentPane.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 98, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 145, 46, 14);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 142, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  { 
				try {
					employeeServiceObj = new EmployeeServiceClass();
					employeeServiceObj.inserstEmployee(new EmployeeModel(Integer.parseInt(textField.getText()),textField_1.getText(),textField_2.getText(),textField_3.getText()));
					JOptionPane.showMessageDialog(contentPane,"added");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} 
		});
		btnRegister.setBounds(29, 190, 89, 23);
		contentPane.add(btnRegister);
		
		JLabel lblDeleteEmployeeBy = new JLabel("Delete Employee by Id");
		lblDeleteEmployeeBy.setBounds(10, 225, 119, 25);
		contentPane.add(lblDeleteEmployeeBy);
		
		textField_4 = new JTextField();
		textField_4.setBounds(139, 227, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				try {
					employeeServiceObj = new EmployeeServiceClass();
					employeeServiceObj.deleteEmployee(Integer.parseInt(textField_4.getText()));
					JOptionPane.showMessageDialog(contentPane,"deleted");
				} catch (SQLException e1) { 
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnDeleteEmployee.setBounds(248, 226, 119, 23);
		contentPane.add(btnDeleteEmployee);
		
		JButton btnViewAllEmployee = new JButton("View All Employee");
		btnViewAllEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				List<EmployeeModel> empList = null;
				try {
					new EmployeeTableFrame();
//					employeeServiceObj = new EmployeeServiceClass();
//					empList = employeeServiceObj.viewAllEmployee();
//					System.out.println("Id\t Name \t email");
//					for(EmployeeModel emp: empList)
//					{    
//						JOptionPane.showMessageDialog(contentPane, emp.getId()+"    "+emp.getFirstName()+" "+emp.getLastName()+"    "+emp.getEmail());
//					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnViewAllEmployee.setBounds(10, 282, 130, 23);
		contentPane.add(btnViewAllEmployee);
	}
}
