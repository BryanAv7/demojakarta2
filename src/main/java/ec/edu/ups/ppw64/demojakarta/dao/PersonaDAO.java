package ec.edu.ups.ppw64.demojakarta.dao;

import java.util.List;

import ec.edu.ups.ppw64.demojakarta.model.Persona;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class PersonaDAO {
	@PersistenceContext
	private EntityManager es;
	
	public void insert(Persona persona) {
		es.persist(persona);
	}

	public void update(Persona persona) {
		es.merge(persona);
	}

	public void delete(int codigo) {
		Persona persona = es.find(Persona.class, codigo);
		es.remove(persona);
	}
	
	public Persona read(int codigo) {
		Persona persona = es.find(Persona.class, codigo);
		return persona;
	}

	public List<Persona> getAll(){
		String jpql = "SELECT c FROM Persona c";
		Query q = es.createQuery(jpql, Persona.class);
		return q.getResultList();
	}
}
