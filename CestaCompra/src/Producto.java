
public class Producto {
	private int id;
	private String nombre;
	private String descripcion;
	private double precio;
	
	public Producto() {
		this.id=0;
		this.nombre="";
		this.descripcion="";
		this.precio=0;
	}
	public Producto(int pID, String pNombre, double pPrecio) {
		this.id=pID;
		this.nombre=pNombre;
		this.descripcion="";
		this.precio=pPrecio;
	}
	public Producto(int pID, String pNombre, String pDescipcion, double pPrecio) {
		this.id=pID;
		this.nombre=pNombre;
		this.descripcion="";
		this.precio=pPrecio;
	}
}
