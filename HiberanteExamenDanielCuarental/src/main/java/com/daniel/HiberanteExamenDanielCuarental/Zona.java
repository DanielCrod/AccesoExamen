package com.daniel.HiberanteExamenDanielCuarental;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="Zonas")
public class Zona {
	
	@Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id_zona")
    private int id_zona;

    @Column(name = "nombre_Zona")
    private String nombre_zona;
    
    @OneToMany(mappedBy= "zona", cascade = CascadeType.ALL)
    private List<Piso> pisos;

public int getId_zona() {
    return id_zona;
}

public void setId_zona(int id_zona) {
    this.id_zona = id_zona;
}

public String getNombre_zona() {
    return nombre_zona;
}

public void setNombre_zona(String nombre_zona) {
    this.nombre_zona = nombre_zona;
}

public List<Piso> getPisos() {
    return pisos;
}

public void setPisos(List<Piso> pisos) {
    this.pisos = pisos;
}

public Zona(int id_zona, String nombre_zona, List<Piso> pisos) {
    this.id_zona = id_zona;
    this.nombre_zona = nombre_zona;
    this.pisos = pisos;
}

public Zona() {
    
}

}
