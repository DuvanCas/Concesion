import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Estandar extends Vehiculo
{
    /**
     * @param pasajeros variable local de la lista Estandar, es una variable unica que no contiene las otras clases de vehiculos
     */
    private int pasajeros;

    /**
     * Clase contructor, sirve para recibir los parametros heredados de la clase padre y los parametros locales
     * @param vehi
     * @param pasajeros
     * @param placa
     * @param modelo
     * @param Marca
     * @param color 
     */
    public Estandar(Vehiculo vehi, int pasajeros, int placa, String modelo, String Marca, String color) {
        super(placa, modelo, Marca, color);
        this.pasajeros = pasajeros;
    }
    /**
     * Clase contructor vacia
     */
    public Estandar() {
    }
    /**
    * @return the pasajeros
    */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
