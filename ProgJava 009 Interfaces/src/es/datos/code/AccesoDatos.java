package es.datos.code;

public interface AccesoDatos {

	public static int MAX_REGISTROS = 10;
	public abstract void insertar();
	public abstract void listar();
}
