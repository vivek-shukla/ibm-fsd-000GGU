package comm.Multicast;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;

public class MulticastChatClient extends JFrame {
	private static int count=0;
    private static byte buf[] = new byte[1024];
    private static DatagramPacket dataRecieved =
            new DatagramPacket(buf, buf.length);
    private static String msgRecieved = "";
	private JPanel contentPane;
	private JTextArea textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MulticastChatClient frame = new MulticastChatClient();
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
	 */
	public MulticastChatClient() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 30, 298, 132);
		contentPane.add(scrollPane);
		
		textField = new JTextArea();
		scrollPane.setViewportView(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(200, 173, 199, 77);
		contentPane.add(scrollPane_1);
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		count = count+1;
		MulticastSocket chatMulticastSocket;
		chatMulticastSocket = new MulticastSocket(4444);
		InetAddress group =
                InetAddress.getByName("225.0.0.2");
        chatMulticastSocket.joinGroup(group);
		JButton btnSendMessage = new JButton("Send Message");
		btnSendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			        
			        // Prompt a user to enter a message
			        String msg;
			        msg = "\n Client "+ (count) +": "+textField.getText();
			       
		
			        
			        // Send the message to Multicast address
			        DatagramPacket data = new
			                DatagramPacket(msg.getBytes(), 0,
			                msg.length(), group, 1236);
			        
			        try {
			        	chatMulticastSocket.send(data);
						chatMulticastSocket.receive(dataRecieved);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        
			        msgRecieved = msgRecieved +  new String(dataRecieved.getData());
			        textArea.setText("\n"+msgRecieved);
			        // Close the socket
			        //chatMulticastSocket.close();
		        
		        // Determine the IP address of a host, given the host name
		        
			}
		});
		btnSendMessage.setBounds(36, 193, 138, 32);
		contentPane.add(btnSendMessage);
		
	
	}
}
