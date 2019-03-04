/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Deportivo extends Vehiculo
{
    /**
     * @param cilindraje variable local de la lista Estandar, es una variable unica que no contiene las otras clases de vehiculos
     */
    private int cilindraje;

    /**
     * Clase contructor, sirve para recibir los parametros heredados de la clase padre y los parametros locales
     * @param placa
     * @param modelo
     * @param Marca
     * @param color 
     */    
    public Deportivo(int placa, String modelo, String Marca, String color) {
        super(placa, modelo, Marca, color);
    }

    /**
     * Clase constructor vacia
     */
    public Deportivo() {
    }


    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


    
}
