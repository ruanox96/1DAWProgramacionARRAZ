package capitulo8;

import java.util.Date;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String localidad;
	private String dniNie;
	private Date fechaNac;
	private boolean activo;

	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(int id, String nombre, String apellidos, String localidad, String dniNie, Date fechaNac,
			boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dniNie = dniNie;
		this.fechaNac = fechaNac;
		this.activo = activo;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad
				+ ", dniNie=" + dniNie + ", fechaNac=" + fechaNac + ", activo=" + activo + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getDniNie() {
		return dniNie;
	}


	public void setDniNie(String dniNie) {
		this.dniNie = dniNie;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
}
