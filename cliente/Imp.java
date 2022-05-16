import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
public class Imp extends UnicastRemoteObject implements Interfaz{
	public Imp()throws RemoteException{
		super();
	}
	public String IpUsuario()throws java.rmi.RemoteException{
		try{
			System.out.println("Cliente");
		String ip = InetAddress.getLocalHost().getHostAddress();
		String id = InetAddress.getLocalHost().getHostName();
		System.out.println("ip: " + ip);
		System.out.println("id: " + id);	
		}
		catch(Exception ex){
		ex.printStackTrace();}
	return "Ip e Id Enviadas al servidor";
	}
}