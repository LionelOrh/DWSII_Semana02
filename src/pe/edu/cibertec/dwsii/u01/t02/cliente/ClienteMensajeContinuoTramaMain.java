package pe.edu.cibertec.dwsii.u01.t02.cliente;

public class ClienteMensajeContinuoTramaMain {
	public static void main (String[] args){
		try {
			
				ClienteMensaje cliente = new ClienteMensaje("localhost", 2999);
				cliente.enviarMensaje("Hola LionelJAJAJA");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
