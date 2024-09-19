package pe.edu.cibertec.dwsii.u01.t02.servidor;

public class ServidorMensajeMain {
	public static void main(String[] args){
		try {
			ServidorMensaje miServidor = new ServidorMensaje(2999);
			miServidor.iniciadorServidor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
