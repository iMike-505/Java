import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;
import java.io.*;
public class Cliente{
	public static void main(String args[]){
		try{
			try{
				int PuertoRMI=5001;
				String nombreNodo;
				String numPuerto;
				String ip = InetAddress.getLocalHost().getHostAddress();
				String URLRegistro = "rmi://192.168.0.10:" + PuertoRMI +"/ejemplo";
				Interfaz h = (Interfaz) Naming.lookup(URLRegistro);
				String mensaje = h.IpUsuario();
				System.out.println(mensaje);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}catch(Exception e){
			System.out.println("Excepcion en el Servidor"+e);
		}
	}
}
