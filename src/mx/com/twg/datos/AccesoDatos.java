package mx.com.twg.datos;

public interface AccesoDatos {
	
	
	//public static = son valores por defecto, es recomendable escribirlas aun as�
	public static int MAX_REGISTROS=10;

	//public abstract = son valores por defecto, es recomendable escribirlas aun as�
	public abstract void insertar();
	
	void listar();
}
