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
public class CienciasdelaSalud extends Carrera {

    public CienciasdelaSalud(String nombre, String facultad, double costomensual, String jefedecarrera) {
        super(nombre, facultad, costomensual, jefedecarrera);
    }

    @Override
    public String toString() {
        return "Ciencias de la Salud[" + "Nombre= " + nombre + ", Facultad= " + facultad + ", Costomensual= " + costomensual + ", Jefe de Carrera= " + jefedecarrera + ']';
    }

}
