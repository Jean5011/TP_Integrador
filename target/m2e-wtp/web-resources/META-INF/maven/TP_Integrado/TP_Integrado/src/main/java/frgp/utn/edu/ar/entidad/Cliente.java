package frgp.utn.edu.ar.entidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String DNI;
	private String nombre;
	private String apellido;
	private String direccion;
	private String codigoPostal;
	private String provincia;
	private String nacionalidad;
	private LocalDate fechaNacimiento;
	private String email;
	private String telefono;
	private boolean activo;
	
	private static final String REGEXP_EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
	private static List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	// Constructor vacío
	public Cliente() {
		
	}
	
	// Constructor con todos los campos:
	public Cliente(String DNI, String nombre, String apellido, String direccion, String codigoPostal, String provincia,
			String nacionalidad, LocalDate fechaNacimiento, String email, String telefono, boolean activo) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.telefono = telefono;
		this.activo = activo;
	}

	// Getters y setters:
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && email.matches(REGEXP_EMAIL)) {
			this.email = email;
		} else {
			throw new IllegalArgumentException("Formato invalido de email");
		}
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	// Para obtener lista de objetos de Cliente:
	public static List<Cliente> getListaClientes(){
		return listaClientes;
	}
	
	// Para obtener un objeto de Cliente segun su DNI:
	public static Cliente getCliente(String DNI) {
		for(Cliente cliente : listaClientes) {
			if(DNI.equals(cliente.getDNI()))
				return cliente;
		}
		return null;
	}

	// Metodo toString:
	@Override
	public String toString() {
		return "Cliente [" +
			"DNI='" + DNI + '\'' +
			", nombre='" + nombre + '\'' +
			", apellido='" + apellido + '\'' +
			", direccion='" + direccion + '\'' +
			", codigoPostal='" + codigoPostal + '\'' +
			", provincia='" + provincia + '\'' +
			", nacionalidad='" + nacionalidad + '\'' +
			", fechaNacimiento='" + fechaNacimiento + '\'' +
			", email='" + email + '\'' +
			", telefono='" + telefono + '\'' +
			", activo='" + activo + '\'' +
			"]";
	}	
}
