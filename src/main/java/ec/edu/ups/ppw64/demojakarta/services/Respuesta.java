package ec.edu.ups.ppw64.demojakarta.services;

public class Respuesta {
   
	private int codigo;
	private String mensaje;
	
	public static int OK = 1;
	public static int ERROR = 99;
	
	public Respuesta (int codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}
	
	public int getCodigo() { 
		return codigo;
	}
	
	public void set(int codigo) { 
		this.codigo = codigo;
		
	}
	
	public String getMensaje() { 
		return mensaje;
	}
	
	public void getMensaje(String mensaje) { 
		this.mensaje = mensaje;
	}
	
}

