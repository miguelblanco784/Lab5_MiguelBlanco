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
public class Estudiantes {

    private String nombre;
    private String apellido;
    private int numcuenta;
    private int edad;
    private String genero;
    private Carrera carrera;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, int numcuenta, int edad, String genero, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numcuenta = numcuenta;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
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

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiantes[" + "Nombre= " + nombre + ", Apellido= " + apellido + ", Numero de Cuenta= " + numcuenta + ", Edad= " + edad + ", Genero= " + genero + ", Carrera= " + carrera + ']';
    }

}
