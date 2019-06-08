import java.net.*;
import java.util.Scanner;
public class DNS {

	public void getIPfromURL(String str)
	{
		try
		{
			InetAddress address = InetAddress.getByName(str);
			System.out.println("IP  address: " + address.getHostAddress());
			System.out.println("Host name : " + address.getHostName());  
			System.out.println("Host name and IP address:" + address.toString()); 
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void getHostnamefromIP(String str)
	{
		try
		{
			InetAddress host = InetAddress.getByName(str);
            System.out.println(host.getHostName());
		}
		catch(Exception e){System.out.println(e.getMessage());}	}
	public static void main(String[] args)
	{
		int ch;
		String str;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		DNS obj=new DNS();
		do
		{
			System.out.println("Welcome");
			System.out.println("1. IP Address from URL\n2. Hostname from IP Address\n3. Exit\nEnter Your Choice : ");
			ch=Integer.parseInt(s.nextLine());
			switch(ch)
			{
				case 1:
					System.out.println("Enter URL : ");
					str=s.nextLine();
					obj.getIPfromURL(str);
					break;
				case 2:
					System.out.println("Enter IP Address : ");
					str=s.nextLine();
					obj.getHostnamefromIP(str);
					break;
			}
		}
		while(ch!=3);
	}
}


