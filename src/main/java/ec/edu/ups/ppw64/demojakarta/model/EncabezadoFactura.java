package ec.edu.ups.ppw64.demojakarta.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "FACTURAS")
public class EncabezadoFactura {
 
	 @Id
	    @Column(name = "ID", unique = true, nullable= false, precision = 5, scale = 0)
	    private int id;

	    @Column(name = "FECHA", nullable = false)
	    private String fecha;

	    @ManyToOne
	    @JoinColumn(name = "PERSONA_ID", nullable = false)
	    private Persona persona;

	    @Column(name = "TOTAL", nullable = false)
	    private double total;

	    // Otros atributos y métodos según tus requerimientos

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }

	    public Persona getPersona() {
	        return persona;
	    }

	    public void setPersona(Persona persona) {
	        this.persona = persona;
	    }

	    public double getTotal() {
	        return total;
	    }

	    public void setTotal(double total) {
	        this.total = total;
	    }
	    
	    @Override
	    public String toString() {
	        return "EncabezadoFactura [id=" + id + ", fecha=" + fecha + ", persona=" + persona + ", total=" + total + "]";
	    }
}
