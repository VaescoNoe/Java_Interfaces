package mx.com.twg.datos;

public class ImplementacionMysql implements AccesoDatos{

	@Override
	public void insertar() {
		System.out.println("Inssertar desde MySql");
		
	}

	@Override
	public void listar() {
		System.out.println("Listar desde MySql");
		
	}

}
