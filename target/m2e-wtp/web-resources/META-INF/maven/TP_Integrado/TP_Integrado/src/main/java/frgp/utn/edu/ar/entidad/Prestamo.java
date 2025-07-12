package frgp.utn.edu.ar.entidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
	
	private int nroPrestamo;
	private LocalDate fechaPrestamo;
	private Cliente cliente;
	private float monto;
	private int totalCuotas;
	private boolean activo;
	
	private static List<Prestamo> listaPrestamos = new ArrayList<Prestamo>();
	
	// Constructor vacío:
	public Prestamo() {
		
	}

	// Constructor con todos los campos:
	public Prestamo(int nroPrestamo, LocalDate fechaPrestamo, Cliente cliente, float monto, int totalCuotas, boolean activo) {
		super();
		this.nroPrestamo = nroPrestamo;
		this.fechaPrestamo = fechaPrestamo;
		this.cliente = cliente;
		this.monto = monto;
		this.totalCuotas = totalCuotas;
		this.activo = activo;
	}

	// Getters y setters:
	public int getNroPrestamo() {
		return nroPrestamo;
	}

	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public int getTotalCuotas() {
		return totalCuotas;
	}

	public void setTotalCuotas(int totalCuotas) {
		this.totalCuotas = totalCuotas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	// Para obtener lista de objetos de Prestamo:
	public static List<Prestamo> getListaPrestamos(){
		return listaPrestamos;
	}
	
	// Para obtener un objeto de Prestamo segun su DNI:
	public static Prestamo getPrestamo(int nroPrestamo) {
		for(Prestamo prestamo : listaPrestamos) {
			if(nroPrestamo == prestamo.getNroPrestamo())
				return prestamo;
		}
		return null;
	}

	// Metodo toString:
	@Override
	public String toString() {
		return "Prestamo [" +
			"nroPrestamo='" + nroPrestamo + '\'' +
			", fechaPrestamo='" + fechaPrestamo + '\'' +
			", cliente='" + cliente + '\'' +
			", monto='" + monto + '\'' +
			", totalCuotas='" + totalCuotas + '\'' +
			", activo='" + activo + '\'' +
			"]";
	}
}
