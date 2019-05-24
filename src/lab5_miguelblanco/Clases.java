/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_miguelblanco;

/**
 *
 * @author migue
 */
public class Clases {

    private String nombre;
    private int seccion;
    private int edificio;
    private int salon;
    private boolean ac;

    public Clases() {
    }

    public Clases(String nombre, int seccion, int edificio, int salon, boolean ac) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.ac = ac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "Clases{" + "nombre=" + nombre + ", seccion=" + seccion + ", edificio=" + edificio + ", salon=" + salon + ", ac=" + ac + '}';
    }

}
