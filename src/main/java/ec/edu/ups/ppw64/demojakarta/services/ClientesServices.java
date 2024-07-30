package ec.edu.ups.ppw64.demojakarta.services;

import java.util.List;

import ec.edu.ups.ppw64.demojakarta.business.GestionPersonas;
import ec.edu.ups.ppw64.demojakarta.model.Persona;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/clientes")
/***
 * Solicitudes Ejemplo: PUT demojakarta/rs/clientes/ POST
 * demojakarta/rs/clientes/ DELETE demojakarta/rs/clientes/ GET
 * demojakarta/rs/clientes/ GET demojakarta/rs/clientes/01370
 */
public class ClientesServices {

	@Inject
	private GestionPersonas gPersonas;

	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Persona cliente) {
		try {
			gPersonas.createPersona(cliente);
			return Response.ok(cliente).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(503).entity(new Respuesta(Respuesta.ERROR, "Error en BD")).build();
		}

	}

	@PUT
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizarPersona(Persona cliente) {
		try {
			gPersonas.actualizarPersona(cliente);
			return Response.ok(cliente).entity(new Respuesta(Respuesta.OK, "Actualizado Correctamente")).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(503).entity(new Respuesta(Respuesta.ERROR, "Error en BD")).build();
		}
	}

	@DELETE
	@Path("/eliminar")
	public Response delete(@QueryParam("id") int id) {
		try {
			gPersonas.borrarPersona(id);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(503).entity(new Respuesta(Respuesta.ERROR, "Error al Eliminar")).build();
		}

	}

	@GET
	@Path("/{cedula}")
	public Persona get(int id) throws Exception {
		Persona persona;
		persona = (Persona) gPersonas.getPersona(id);
		return persona;
	}

	@GET
	@Produces("application/json")
	public List<Persona> list() {
		List<Persona> personas = gPersonas.getPersona();
		return personas;
	}

}
