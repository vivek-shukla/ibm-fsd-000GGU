package comm.SwingAndSocket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class ClientPage extends JFrame {

	private JPanel contentPane;
	int portOfServer = 2240;
	Socket client = new Socket(InetAddress.getLocalHost(),portOfServer);
	
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientPage frame = new ClientPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public ClientPage() throws UnknownHostException, IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterMessage = new JLabel("Enter Message");
		lblEnterMessage.setBounds(10, 26, 96, 25);
		contentPane.add(lblEnterMessage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(134, 26, 249, 141);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Send Message to Client");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
		         
		         try {
		        	 
					 OutputStream clientOutput = client.getOutputStream();
			         PrintWriter writer = new PrintWriter(clientOutput); 
			         String msg = textArea.getText();
			         writer.println(msg);
			         writer.close();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		         
		         
			}
		});
		btnNewButton.setBounds(158, 208, 170, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterEmploeeId = new JLabel("Enter Emploee Id");
		lblEnterEmploeeId.setBounds(10, 284, 96, 25);
		contentPane.add(lblEnterEmploeeId);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(134, 284, 88, 25);
		contentPane.add(textArea_1);
		
		JButton btnFing = new JButton("Find");
		btnFing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
		         
		         try {
					 OutputStream clientOutput = client.getOutputStream();
			         PrintWriter writer = new PrintWriter(clientOutput); 
			         String msg = textArea_1.getText();
			         writer.print(msg+" ");
			         writer.close();
			         
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		         
			} 
		});
		btnFing.setBounds(265, 285, 89, 23);
		contentPane.add(btnFing);
	}
}
