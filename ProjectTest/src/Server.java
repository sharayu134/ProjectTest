import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
public class Server
{
	public static void main(String[] args)
	{
		try(Socket socket = new Socket("localhost",5001) )
		{
			BufferedReader inbuf= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter opp= new PrintWriter(socket.getOutputStream(),true);
			Scanner scanner= new Scanner(System.in);
			String echoMsg;
			String response;
			scanner.close();
			do 
			{
				System.out.println("Enter msg for server");
				echoMsg=scanner.nextLine();
				opp.println(echoMsg);
				
				if(!echoMsg.equals("exit"))
				{
					response=inbuf.readLine();
					System.out.println("Server Response :"+response);  //adding some comments here
				}
				
				
			}while(!echoMsg.equals("exit"));
			
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
