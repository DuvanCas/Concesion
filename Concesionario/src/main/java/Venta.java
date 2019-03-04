/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Venta 
{
    private int codigoVenta;
    private Vehiculo vehi;

    public Venta() {
    }

    public Venta(int codigoVenta, Vehiculo vehi) {
        this.codigoVenta = codigoVenta;
        this.vehi = vehi;
    }

    /**
     * @return the codigoVenta
     */
    public int getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * @param codigoVenta the codigoVenta to set
     */
    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
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
}
