package ec.edu.ups.ppw64.demojakarta.business;

import java.util.List;

import ec.edu.ups.ppw64.demojakarta.dao.PersonaDAO;
import ec.edu.ups.ppw64.demojakarta.model.Persona;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionPersonas {

	@Inject
	private PersonaDAO daoPersona;

	public void createPersona(Persona persona) throws Exception { 
	if (persona.getCedula().length() !=10) { 
		throw new Exception("Cedula incorrecta");
	}
	daoPersona.insert(persona);
}
	
	public void guardarPersona(Persona persona) {
		Persona cli = daoPersona.read(persona.getCodigo());
		if (cli != null){
			daoPersona.update(persona);
		}else {
			daoPersona.insert(persona);
		}
	}
	
	public void actualizarPersona(Persona persona) throws Exception {
		Persona cli = daoPersona.read(persona.getCodigo());
		if (cli != null){
			daoPersona.update(persona);
		}else {
			throw new Exception("Persona no existe");
		}
	}
	
	public void borrarPersona(int codigo){
		daoPersona.delete(codigo);
	}
	
	
	public Persona getPersona (int id) throws Exception { 
		if (String.valueOf(id).length() !=10) {
			throw new Exception ("Cedula incorrecta");
		} else {
			Persona persona = daoPersona.read(id);
			return persona;
		}
	}
	
	public List<Persona> getPersona(){
		return daoPersona.getAll();
	}
}
