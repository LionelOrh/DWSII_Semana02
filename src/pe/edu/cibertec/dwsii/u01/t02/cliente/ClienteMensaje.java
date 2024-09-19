package pe.edu.cibertec.dwsii.u01.t02.cliente;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import pe.edu.cibertec.dwsii.u01.t02.servidor.ServidorMensaje;

public class ClienteMensaje {
	private String host;
	private int puerto;
	
	public ClienteMensaje(String host, int puerto){
		this.puerto = puerto;
		this.host = host;
	}
	
	public void enviarMensaje(String mensaje) throws UnknownHostException,IOException{
		Socket socketCliente = new Socket(this.host,this.puerto);
		OutputStream flujoSalida = socketCliente.getOutputStream();
		PrintWriter escritorMensaje = new PrintWriter(flujoSalida,true);
		escritorMensaje.println(mensaje);
		System.out.println("Mensaje enviado!");
		escritorMensaje.close();
		flujoSalida.close();
		socketCliente.close();
		
	}
	public static void main(String[] args){
		try {
			ServidorMensaje miServidor  =new ServidorMensaje(2999);
			miServidor.iniciadorServidor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
