package comm.Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastSever { 
	private static int portNumber = 4444;
	
	public static void main(String[] args) throws IOException
	{
		MulticastSocket muticastSocketObj = new MulticastSocket(portNumber);
        System.out.println("MulticastSocket is created...");
        
        // Determine the IP address of a host, given the host name
        InetAddress group =
                InetAddress.getByName("228.0.0.1");
        
        // getByName- returns IP address of given host
        muticastSocketObj.joinGroup(group);
        System.out.println("joinGroup method is called...");
        boolean infinite = true;
        String msg;
        // Continually receives data and prints them 
        while(infinite) {
            byte buf[] = new byte[1024];
            DatagramPacket data =
                    new DatagramPacket(buf, buf.length);
            muticastSocketObj.receive(data);
            msg = new String(data.getData());
            if(msg!=null)
            {
            	System.out.println("Message received from" + msg);
            }
            muticastSocketObj.send(data);
        }
        
        muticastSocketObj.close();
		
	}

}
