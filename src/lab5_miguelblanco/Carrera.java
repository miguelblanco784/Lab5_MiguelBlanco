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
public class Carrera {

    public String nombre;
    public String facultad;
    public double costomensual;
    public String jefedecarrera;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, double costomensual, String jefedecarrera) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costomensual = costomensual;
        this.jefedecarrera = jefedecarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getCostomensual() {
        return costomensual;
    }

    public void setCostomensual(double costomensual) {
        this.costomensual = costomensual;
    }

    public String getJefedecarrera() {
        return jefedecarrera;
    }

    public void setJefedecarrera(String jefedecarrera) {
        this.jefedecarrera = jefedecarrera;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", costomensual=" + costomensual + ", jefedecarrera=" + jefedecarrera + '}';
    }

    
}
