package ec.edu.ups.ppw64.demojakarta.business;

import java.util.List;

import ec.edu.ups.ppw64.demojakarta.dao.ProductoDAO;
import ec.edu.ups.ppw64.demojakarta.model.Producto;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionProducto {

	@Inject
	private ProductoDAO daoProducto;
	
	public void guardarProducto(Producto producto) {
		Producto prod = daoProducto.read(producto.getId());
		if(prod != null) {
			daoProducto.update(producto);
		} else {
			daoProducto.insert(producto); 
		}
	}
	
	public void actualizarProducto(Producto producto) throws Exception {
		Producto prod = daoProducto.read(producto.getId());
		if (prod != null){
			daoProducto.update(producto);
		}else {
			throw new Exception("Producto no existe");
		}
	}
	
	public Producto buscarProducto(int id) throws Exception {
		if(id <= 0) 
			throw new Exception("ID inválido");
		return daoProducto.read(id);
	}
	public Producto getProductoPorNombre(String nombre) throws Exception {
		if(nombre.length() < 0) 
			throw new Exception("Campo Vacio");
		return daoProducto.getProductoPorNombre(nombre);
	}
	
	public void borrarProducto(int id) {
		daoProducto.remove(id); 
	}
	
	public List<Producto> listarProductos() {
		return daoProducto.getAll();
	}

}
