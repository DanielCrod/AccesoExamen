package com.daniel.HiberanteExamenDanielCuarental;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Pisos")
public class Piso {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id_piso")
    private int Id_piso;
    
    
    @ManyToOne
    @JoinColumn(name = "Id_zona")
    private Zona zona;
    
    @Column(name ="Tipo_Operacion")
    private String Tipo_Operacion;
    
    @Column(name = "Metros")
    private int Metros;
    
    @Column(name = "Nombre_propietario")
    private String Nombre_propietario;
    
    @Column(name = "Telefono_contacto")
    private int Telefono_contacto;
    
    @Column(name = "Precio")
    private int Precio;
    
    @Column(name="Reservado")
    private boolean Reservado;

public int getId_piso() {
    return Id_piso;
}

public void setId_piso(int Id_piso) {
    this.Id_piso = Id_piso;
}

public Zona getZona() {
    return zona;
}

public void setZona(Zona zona) {
    this.zona = zona;
}

public String getTipo_Operacion() {
    return Tipo_Operacion;
}

public void setTipo_Operacion(String Tipo_Operacion) {
    this.Tipo_Operacion = Tipo_Operacion;
}

public int getMetros() {
    return Metros;
}

public void setMetros(int Metros) {
    this.Metros = Metros;
}

public String getNombre_propietario() {
    return Nombre_propietario;
}

public void setNombre_propietario(String Nombre_propietario) {
    this.Nombre_propietario = Nombre_propietario;
}

public int getTelefono_contacto() {
    return Telefono_contacto;
}

public void setTelefono_contacto(int Telefono_contacto) {
    this.Telefono_contacto = Telefono_contacto;
}

public int getPrecio() {
    return Precio;
}

public void setPrecio(int Precio) {
    this.Precio = Precio;
}

public boolean isReservado() {
    return Reservado;
}

public void setReservado(boolean Reservado) {
    this.Reservado = Reservado;
}

public Piso(int Id_piso, Zona zona, String Tipo_Operacion, int Metros, String Nombre_propietario, int Telefono_contacto, int Precio, boolean Reservado) {
    this.Id_piso = Id_piso;
    this.zona = zona;
    this.Tipo_Operacion = Tipo_Operacion;
    this.Metros = Metros;
    this.Nombre_propietario = Nombre_propietario;
    this.Telefono_contacto = Telefono_contacto;
    this.Precio = Precio;
    this.Reservado = Reservado;
}

public Piso () {
    
}
}
