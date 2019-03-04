/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duvan
 */
public class Vendedor extends Vehiculo
{
    /**
     * @param codigoVendedor variable que sirve para recibir el codigo de cada vendedor
     */
    private int codigoVendedor;
    /**
     * @param nombre variable que sirve para capturar el nombre del vendedor
     */
    private String nombre;
    /**
     * @param apellido variable que sirve para capturar el apellido del vendedor
     */
    private String apellido;
    /**
     * @param telefono variable que sirve para capturar el numero de contacto del vendedor
     */
    private String telefono;
    /**
     * @param comision variable que sirve para calcular la comision que tendra cada vendedor tras realizar una venta
     */
    private int comision;

    /**
     * Metodo constructor que recibe los parametros locales de la clase
     * @param codigoVendedor
     * @param nombre
     * @param apellido
     * @param telefono
     * @param comision 
     */
    public Vendedor(int codigoVendedor, String nombre, String apellido, String telefono, int comision) {
        this.codigoVendedor = codigoVendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.comision = comision;
    }

    /**
     * @return the codigoVendedor
     */
    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    /**
     * @param codigoVendedor the codigoVendedor to set
     */
    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the comision
     */
    public int getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(int comision) {
        this.comision = comision;
    }
    
    
}
