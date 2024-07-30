package ec.edu.ups.ppw64.demojakarta.views;

import java.util.List;

import ec.edu.ups.ppw64.demojakarta.business.GestionPersonas;
import ec.edu.ups.ppw64.demojakarta.model.Persona;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("clientes")
@RequestScoped
public class VistaClientes {

	@Inject
	private GestionPersonas gPersonas;

	private Persona persona = new Persona();

	private List<Persona> listado;

	@PostConstruct
	public void init() {
		listado = gPersonas.getPersona();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Persona> getListado() {
		return listado;
	}

	public void setListado(List<Persona> listado) {
		this.listado = listado;
	}

	public String regresar() {
		return "contactos?faces-redirect=true";
	}

	public String guardar() {
		System.out.println(this.persona);
		try {
			gPersonas.guardarPersona(persona);
			return "listadoclientes?faces-redirect=true";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}
}