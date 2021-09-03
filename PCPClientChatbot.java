package tcpclientserver;
import java.net.*;
import java.io.*;
public class PCPClientChatbot {

	public static void main(String[] args) 
	{
		
		try
        {
            Socket s = new Socket("Localhost",8000);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg;
            System.out.println("To stop chatting with server type STOP");
            System.out.print("Client Says: ");
            while((msg = br.readLine()) != null)
            {
                out.writeBytes(msg+"\n");
                if(msg.equals("STOP"))
                    break;
                System.out.println("Server Says : "+in.readLine());
                System.out.print("Client Says : ");
            }
            br.close();
            in.close();
            out.close();
            s.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

	}

}
