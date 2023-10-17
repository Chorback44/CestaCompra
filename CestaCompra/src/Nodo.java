
public class Nodo <T> {
	private T info; //en producto va a ser int id y en usuario va a ser string dni
	private Nodo<T> siguiente;
	
	public Nodo() {
		this.info=null;
		this.siguiente=null;
	}
	
	public Nodo(T pInfo) { //tienes un dni asociado a una lista vacia
		this.info=pInfo;
		this.siguiente=null;
	}
	
	public Nodo(T pInfo, Nodo<T> pSiguiente) { //tienes un dni asociado a una lista vacia
		this.info=pInfo;
		this.siguiente=pSiguiente;
	}
}
