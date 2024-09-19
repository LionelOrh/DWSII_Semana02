package pe.edu.cibertec.dwsii.u01.t02.cliente;

import java.time.LocalDateTime;

public class ClienteMensajeContinuoMain {
	public static void main (String[] args){
		ClienteMensaje cliente = new ClienteMensaje("10.40.30.132", 2999);
		try {
			
				cliente.enviarMensaje("Hola Hrmno Soy Lio😂" + LocalDateTime.now());
				Thread.sleep(1000);
				
		}catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
