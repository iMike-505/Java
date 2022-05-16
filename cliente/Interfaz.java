import java.rmi.*;
public interface Interfaz extends Remote{
	public String IpUsuario()throws java.rmi.RemoteException;
	//public String IdUsuario()throws java.rmi.RemoteException;
}