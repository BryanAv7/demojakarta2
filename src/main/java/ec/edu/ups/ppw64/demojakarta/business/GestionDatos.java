package ec.edu.ups.ppw64.demojakarta.business;

import java.util.List;

import ec.edu.ups.ppw64.demojakarta.dao.DetalleFacturaDAO;
import ec.edu.ups.ppw64.demojakarta.dao.EncabezadoFacturaDAO;
import ec.edu.ups.ppw64.demojakarta.dao.PersonaDAO;
import ec.edu.ups.ppw64.demojakarta.dao.ProductoDAO;
import ec.edu.ups.ppw64.demojakarta.model.DetalleFactura;
import ec.edu.ups.ppw64.demojakarta.model.EncabezadoFactura;
import ec.edu.ups.ppw64.demojakarta.model.Persona;
import ec.edu.ups.ppw64.demojakarta.model.Producto;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private PersonaDAO daoPersona;
	
	@Inject
	private ProductoDAO daoProducto;
	
	@Inject
	private EncabezadoFacturaDAO daoEncabezadoFactura;
	
	@Inject
	private DetalleFacturaDAO daoDetalleFactura;
	
	@PostConstruct
	public void init() {
System.out.println("-----------Iniciando Carga De Datos--------------");

// Tabla: Productos
//       Producto producto1 = new Producto();
//       producto1.setId(1);
//	   producto1.setNombre("Computadora");
//	   producto1.setDescripcion("Lapton");
//	   producto1.setPrecio(850);
//	   producto1.setStock(10);
//		
//	   daoProducto.insert(producto1);
//		
//		
//		Producto producto2= new Producto();
//	    producto2.setId(2);
//		producto2.setNombre("Teclado");
//		producto2.setDescripcion("Teclado de Escritorio");
//		producto2.setPrecio(150);
//		producto2.setStock(20);
//			
//		daoProducto.insert(producto2);
//		
//		Producto producto3 = new Producto();
//	    producto3.setId(3);
//		producto3.setNombre("Mouse");
//		producto3.setDescripcion("Mouse inalambrico");
//		producto3.setPrecio(80);
//		producto3.setStock(15);
//			
//		daoProducto.insert(producto3);
			
		

// Tabla: Personas
//	Persona persona1 = new Persona();
//	persona1.setCodigo(70);
//	persona1.setCedula("1123122211");
//	persona1.setNombre("Andres Leon");
//	persona1.setDireccion("Av. De las Americas");
//	
//	daoPersona.insert(persona1);
//	
//	Persona persona2 = new Persona();
//	persona2.setCodigo(80);
//	persona2.setCedula("1000000001");
//	persona2.setNombre("Pablo Perez");
//	persona2.setDireccion("Calle Larga");
//	
//	daoPersona.insert(persona2);
//	
//	Persona persona3 = new Persona();
//	persona3.setCodigo(90);
//	persona3.setCedula("1000002222");
//	persona3.setNombre("Bryan Avila");
//	persona3.setDireccion("Coronel Harris");
//	
//	daoPersona.insert(persona3);
//	
		
// Tabla: Factura
		
//		EncabezadoFactura encabezadoFactura = new EncabezadoFactura();
//		encabezadoFactura.setId(11);
//		encabezadoFactura.setFecha("2024-06-08");
//		encabezadoFactura.setPersona(persona1);
//		encabezadoFactura.setTotal(1000.50);
//		
//		daoEncabezadoFactura.insert(encabezadoFactura);
//		
//		DetalleFactura detalle1 = new DetalleFactura();
//        detalle1.setProducto(producto1);
//        detalle1.setCantidad(2);
//        detalle1.setPrecioUnitario(10.50);
//        detalle1.setEncabezadoFactura(encabezadoFactura);
        
 // Tabla: Detalle Facturas
        
//        daoDetalleFactura.insert(detalle1);
//
//        DetalleFactura detalle2 = new DetalleFactura();
//        detalle2.setProducto(producto2);
//        detalle2.setCantidad(1);
//        detalle2.setPrecioUnitario(150.50);
//        detalle2.setEncabezadoFactura(encabezadoFactura);
//        
//        daoDetalleFactura.insert(detalle2);
		
		
		
		
//	System.out.println("\n------------- Personas----------");
	//	List<Persona> list = daoPersona.getAll();
		//for (Persona cli: list) {
			//System.out.println(cli);
		//}
		
//		System.out.println("\n------------- Productos ----------");
//        List<Producto> listProductos = daoProducto.getAll();
//        for (Producto prod : listProductos) {
//            System.out.println(prod);
//        }
//        System.out.println("\n------------- Detalles de Factura ----------");
//        List<DetalleFactura> detallesFactura = daoDetalleFactura.getAll();
//        for (DetalleFactura detalle : detallesFactura) {
//            System.out.println(detalle);
//        }
        
		}
}
	
