
public class Usuario {
	private String dni;
	private String nombreApellidos;
	private String password;
	
	public Usuario() {
		this.dni="";
		this.nombreApellidos="";
		this.password="";
	}
	
	public Usuario(String pDNI, String pNombre, String pPass) {
		this.dni=pDNI;
		this.nombreApellidos=pNombre;
		this.password=pPass;
	}
}
