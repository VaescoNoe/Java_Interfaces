package mx.com.twg;

import mx.com.twg.datos.AccesoDatos;
import mx.com.twg.datos.ImplementacionMysql;
import mx.com.twg.datos.ImplementacionOracle;

public class Main {

	public static void main(String[] args) {
		
		AccesoDatos datos = null;
		
		datos = new ImplementacionMysql();
		ejecutar(datos,"listar");
		
		datos = new ImplementacionOracle();
		ejecutar(datos,"insertar");

	}
	
	private static void ejecutar(AccesoDatos datos,String accion){
		if("listar".equals(accion)){
			datos.listar();
		}else if("insertar".equals(accion)){
			datos.insertar();
		}
	}

}
