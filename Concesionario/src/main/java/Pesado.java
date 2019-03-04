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
public class Pesado extends Vehiculo
{
    /**
     * @param Vehiculo Vehi variable que sirve para enlazar con la clase padre
     */
    private Vehiculo vehi;
    /**
     * @param List<Vehiculo> sirve para listar en un arreglo los parametros recibidos de la clase padre
     */
    private List<Vehiculo> ListPesado =new ArrayList();
    /**
     * @param ejes variable local de la lista Estandar, es una variable unica que no contiene las otras clases de vehiculos
     */
    private int ejes;

    /**
     * Clase contructor, sirve para recibir los parametros heredados de la clase padre y los parametros locales
     * @param vehi
     * @param ejes
     * @param placa
     * @param modelo
     * @param Marca
     * @param color 
     */
    public Pesado(Vehiculo vehi, int ejes, int placa, String modelo, String Marca, String color) {
        super(placa, modelo, Marca, color);
        this.vehi = vehi;
        this.ejes = ejes;
    }

    /**
     * Clase contructos vacia
     */
    public Pesado() {
    }
    /**
     * @return the vehi
     */
    public Vehiculo getVehi() {
        return vehi;
    }

    /**
     * @param vehi the vehi to set
     */
    public void setVehi(Vehiculo vehi) {
        this.vehi = vehi;
    }

    /**
     * @return the ListPesado
     */
    public List<Vehiculo> getListPesado() {
        return ListPesado;
    }

    /**
     * @return the ejes
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * @param ejes the ejes to set
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}
    
    

