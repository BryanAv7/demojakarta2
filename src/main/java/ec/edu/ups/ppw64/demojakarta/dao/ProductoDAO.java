package ec.edu.ups.ppw64.demojakarta.dao;

import java.util.List;

import ec.edu.ups.ppw64.demojakarta.model.Persona;
import ec.edu.ups.ppw64.demojakarta.model.Producto;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


@Stateless
public class ProductoDAO {

	@PersistenceContext
    private EntityManager em;

    public void insert(Producto producto) {
        em.persist(producto);
    }

    public void update(Producto producto) {
        em.merge(producto);
    }

    public void remove(int id) {
        Producto producto = em.find(Producto.class, id);
        if (producto != null) {
            em.remove(producto);
        }
    }

    public Producto read(int id) {
        return em.find(Producto.class, id);
    }

    public List<Producto> getAll() {
        String jpql = "SELECT p FROM Producto p";
        Query q = em.createQuery(jpql, Producto.class);
        return q.getResultList();
    }
    
    public Producto getProductoPorNombre(String nombre) {
		String jpql = "SELECT p FROM Producto p WHERE p.nombre= :nombre";
		Query q = em.createQuery(jpql, Persona.class);
		q.setParameter("nombre", nombre);
		List<Producto> producto= q.getResultList();
		if(producto.size()>0)
			return producto.get(0);
		return null;
	}
}
