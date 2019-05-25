/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_miguelblanco;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Maestros {

    private String nombre;
    private String Apellido;
    private double salario;
    private int edad;
    private ArrayList<Clases> clases = new ArrayList();

    public Maestros() {
    }

    public Maestros(String nombre, String Apellido, double salario, int edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Maestros{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", salario=" + salario + ", edad=" + edad + ", clases=" + clases + '}';
    }

}
