import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client 
{
 public static void main(String[] args) 
  { 
	 try(ServerSocket serverSocket=new ServerSocket(5001))
	 {
		 Socket socket=serverSocket.accept();
		 System.out.println("Server Connected");
		 BufferedReader input= new BufferedReader(
		 new InputStreamReader(socket.getInputStream()));
		 PrintWriter output= new PrintWriter(socket.getOutputStream(),true);
		 while (true) 
		 {
			 String echoString=input.readLine();
			 if( echoString.equals("exit"))
			 {
				 break;
			 }
			 output.println("server says"+echoString);
		 }
		 
	 }
	 catch(IOException e) {
		 System.out.println(e.getMessage());
	 }
  }
}
