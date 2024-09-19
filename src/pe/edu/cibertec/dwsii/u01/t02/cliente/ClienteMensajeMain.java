package pe.edu.cibertec.dwsii.u01.t02.cliente;

public class ClienteMensajeMain {
	
	public static void main (String[] args){
		try {
			ClienteMensaje cliente = new ClienteMensaje("localhost", 2999);
			cliente.enviarMensaje("Hola Lionel!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
