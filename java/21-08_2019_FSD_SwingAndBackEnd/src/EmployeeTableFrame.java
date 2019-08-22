import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class EmployeeTableFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private RS2XmlConfig RS2oBJ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeTableFrame frame = new EmployeeTableFrame();
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
	public EmployeeTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 82, 296, 125);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(347, 82, 17, 48);
		contentPane.add(scrollBar);
		
		JButton btnViewAllEmployee = new JButton("View All Employee");
		btnViewAllEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				ResultSet rs;
				try {
					RS2oBJ = new RS2XmlConfig();
					rs = RS2oBJ.fetchAllEmployees();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnViewAllEmployee.setBounds(78, 227, 131, 23);
		contentPane.add(btnViewAllEmployee);
		setVisible(true);
	}
}
