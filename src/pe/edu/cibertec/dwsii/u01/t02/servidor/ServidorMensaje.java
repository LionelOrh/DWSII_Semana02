package pe.edu.cibertec.dwsii.u01.t02.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ServidorMensaje {

	private int puerto;
	private boolean prendido;
	private ServerSocket socketServidor;
	
	public ServidorMensaje(int puerto) throws IOException{
		this.puerto = puerto;
		this.socketServidor = new  ServerSocket(this.puerto);
		System.out.println(String.format("Servidor ha sido iniciado en el puerto %d", this.puerto));
	}
	
	public void iniciadorServidor(){
		this.prendido =  true;
		System.out.println("El servidor ha sido iniciado ...");
		
		while(this.prendido){
			try {
				Socket conexionEntrante = this.socketServidor.accept();
				String hostClient = conexionEntrante.getInetAddress().getHostName();
				System.out.println((String.format("Conexion desde: %s", hostClient)));
				
				InputStream flujoEntrada = conexionEntrante.getInputStream();
				InputStreamReader isr = new InputStreamReader(flujoEntrada);
				
				BufferedReader br = new BufferedReader(isr);
				
				String mensaje = br.readLine();
				
				System.out.println(String.format("Mensaje recibido: %s", mensaje));
				
				//Cerramos los flujos para esta conexion
				br.close();
				isr.close();
				flujoEntrada.close();
				conexionEntrante.close();
			} catch (Exception e) {
				e.printStackTrace();
				this.prendido = false;
			}
		}
	}
}
