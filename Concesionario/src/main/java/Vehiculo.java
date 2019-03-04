/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Vehiculo 
{
    /**
     * placa variable que sirve para capturar la placa del carro
     */
    protected int placa;
    /**
     * modelo que sirve para capturar el modelo del carro
     */
    protected String modelo;
    /**
     * marca variable que sirve para capturar laa marca del carro
     */
    protected String Marca;
    /**
     * color varibale que sirve para capturar el color del carro
     */
    protected String color;
    /**
    * precio varibale que sirve para capturar el precio del carro
    */
    protected int precio;
        
    /**
    * Clase constructor que recibe los parametros solicidados por la clase
    */
    
    public Vehiculo(int placa, String modelo, String Marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.Marca = Marca;
        this.color = color;    
    }

    /**
     * clase constructor vacia
     */
    public Vehiculo() {
    }

    /**
     * @return the placa
     */
    public int getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(int placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }    
}
