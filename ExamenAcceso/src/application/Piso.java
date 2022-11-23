package application;

public class Piso {
	
	private int Id_piso;
	
	private int Id_Zona;
	
	private String Tipo_Operacion;
	
	private int Metros;
	
	private String Nombre_Propietario;
	
	private int Telefono_contacto;
	
	private int Precio;
	
	private boolean Reservado;

	public int getId_piso() {
		return Id_piso;
	}

	public void setId_piso(int id_piso) {
		Id_piso = id_piso;
	}

	public int getId_Zona() {
		return Id_Zona;
	}

	public void setId_Zona(int id_Zona) {
		Id_Zona = id_Zona;
	}

	public String getTipo_Operacion() {
		return Tipo_Operacion;
	}

	public void setTipo_Operacion(String tipo_Operacion) {
		Tipo_Operacion = tipo_Operacion;
	}

	public int getMetros() {
		return Metros;
	}

	public void setMetros(int metros) {
		Metros = metros;
	}

	public String getNombre_Propietario() {
		return Nombre_Propietario;
	}

	public void setNombre_Propietario(String nombre_Propietario) {
		Nombre_Propietario = nombre_Propietario;
	}

	public int getTelefono_contacto() {
		return Telefono_contacto;
	}

	public void setTelefono_contacto(int telefono_contacto) {
		Telefono_contacto = telefono_contacto;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public boolean isReservado() {
		return Reservado;
	}

	public void setReservado(boolean reservado) {
		Reservado = reservado;
	}

	public Piso(int id_piso, int id_Zona, String tipo_Operacion, int metros, String nombre_Propietario,
			int telefono_contacto, int precio, boolean reservado) {
		super();
		Id_piso = id_piso;
		Id_Zona = id_Zona;
		Tipo_Operacion = tipo_Operacion;
		Metros = metros;
		Nombre_Propietario = nombre_Propietario;
		Telefono_contacto = telefono_contacto;
		Precio = precio;
		Reservado = reservado;
	}
	
	
	
	
}


