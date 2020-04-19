package Model;

import Interfaces.Beber;
import Interfaces.Orinar;

public class Humano {

    private String nombre;
    private Integer edad;
    private Integer peso;
    private Orinar orinar;
    private Beber beber;
    private Integer cantidad_cerveza = 0;

    public Humano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.orinar = orinar;
        this.beber = beber;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Orinar getOrinar() {
        return orinar;
    }

    public void setOrinar(Orinar orinar) {
        this.orinar = orinar;
    }

    public Beber getBeber() {
        return beber;
    }

    public void setBeber(Beber beber) {
        this.beber = beber;
    }

    public Integer getCantidad_cerveza() {
        return cantidad_cerveza;
    }

    public void setCantidad_cerveza(Integer cantidad_cerveza) {
        this.cantidad_cerveza = cantidad_cerveza;
    }
}
