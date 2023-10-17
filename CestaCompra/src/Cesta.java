
public class Cesta {
	private Usuario user;
	private Lista<Producto> cestaCompra;
	
	public Cesta() {
		this.user=null;
		this.cestaCompra=null;
	}
	
	public Cesta(Usuario pUser, Lista pCestaCompra) {
		this.user=pUser;
		this.cestaCompra=pCestaCompra;
	}
}
