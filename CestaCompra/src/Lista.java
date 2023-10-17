
public class Lista <T> {
	private Nodo<T> nodoActual;
	
	public Lista() {
		this.nodoActual=null;
	}

	public Lista(Nodo<T> pNodo) {
		this.nodoActual=pNodo;
	}
}
