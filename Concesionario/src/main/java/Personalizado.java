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
public class Personalizado extends Vehiculo{
    /**
     * @param Vehiculo vehi variable que sirve para enlazar con la clase padre
     */
    private Vehiculo vehi;
    /**
     *  @param List<Vehiculo> sirve para listar en un arreglo los parametros recibidos de la clase padre
     */
    private List<Vehiculo> ListPerso =new ArrayList();
    /**
     * @param palomera variable unica de la clase Personalizado
     */
    private String palomera;
    /**
     * @param vidrios variable unica de la clase Personalizado
     */
    private String vidrios;

    /**
     * Metodo constructor vacio
     */
    public Personalizado() {
    }
    /**
    * Meotodo constructos que recibe los parametros locales de la clase Personalizado
    * @param vehi
    * @param palomera
    * @param vidrios 
    */
    public Personalizado(Vehiculo vehi, String palomera, String vidrios) {
        this.vehi = vehi;
        this.palomera = palomera;
        this.vidrios = vidrios;
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
     * @return the ListPerso
     */
    public List<Vehiculo> getListPerso() {
        return ListPerso;
    }

    /**
     * @param ListPerso the ListPerso to set
     */
    public void setListPerso(List<Vehiculo> ListPerso) {
        this.ListPerso = ListPerso;
    }

    /**
     * @return the palomera
     */
    public String getPalomera() {
        return palomera;
    }

    /**
     * @param palomera the palomera to set
     */
    public void setPalomera(String palomera) {
        this.palomera = palomera;
    }

    /**
     * @return the vidrios
     */
    public String getVidrios() {
        return vidrios;
    }

    /**
     * @param vidrios the vidrios to set
     */
    public void setVidrios(String vidrios) {
        this.vidrios = vidrios;
    }
    
}
