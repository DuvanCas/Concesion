import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Duvan
 */
public class Inventario 
{
    Scanner sc = new Scanner(System.in);
    /**
     * @param codigoInventario sera una variablequese utilizara paracodificar el inventario existente
     */
    int codigoInventario; 
    /**
     * Objeto que controla las variables de la clase Estandar
     */
    Estandar carro = new Estandar();
    /**
     * Objeto que controla las variables de la clase Deportivo
     */
    Deportivo car= new Deportivo();
    /**
     * Objeto que controla las variables de la clase Personalizado
     */
    Personalizado carro1 = new Personalizado();
    /**
     * Objeto que controla las variables de la clase Pesado
     */
    Pesado carro2 = new Pesado();
    /**
     * ArrayList contiene las variables de la clase padre Vehiculo
     */
    private ArrayList<Estandar> ListEstandar =new ArrayList();
    /**
     * ArrayList contiene las variables de la clase padre Vehiculo
     */
    private ArrayList<Pesado> ListPesado =new ArrayList();
    /**
     * ArrayList contiene las variables de la clase padre Vehiculo
     */
    private ArrayList<Deportivo> ListDeportivo =new ArrayList();
    /**
     * ArrayList contiene las variables de la clase padre Vehiculo
     */
    private ArrayList<Personalizado> ListPerso =new ArrayList();
    /**
     * ArrayList contiene las variables de la clase padre Vehiculo
     */
    private ArrayList<Vehiculo> inventario = new ArrayList<>();
    /**
     * Constructor con el que se inicializara la clase
     */
    public Inventario() {
    }   
    /**
     * Metodo que mostrara un menu para agregar distintos tipos de carros
     */
    public void agregar()
    {
       int opcion = 0;       
       do
       {
           System.out.println("Bienvenido");
           System.out.println("1. Registrar Estandar");
           System.out.println("2. Registrar Deportivo");
           System.out.println("3. Registrar Pesado");
           System.out.println("4. Agregar Personalizado");
           System.out.println("5. Regresar");
           opcion = sc.nextInt();
           switch(opcion)
           {
               case 1:
                   agregarEstandar();                   
                   break;
               case 2:
                   agregarAutoDeportivo();
                   break;
               case 3:
                   agregarPesados();
                   break;
               case 4:
                   agregarPerso();
                   break;
               case 5:
                   Menu menu = new Menu();
                   break;
           }            
       }
       while(opcion != 5);
    }
    /**
     * Metodo que servira para agregar vehiculos estandar
     */
    public void agregarEstandar()
    {         
        System.out.println("Ingrese la placa del vehiculo: ");
        carro.placa= sc.nextInt();
        System.out.println("Ingrese el modelo del vehiculo: ");
        carro.modelo = sc.next();
        System.out.println("Ingrese la marca del vehiculo: ");
        carro.Marca = sc.next();
        System.out.println("Ingrese el color del vehiculo: ");
        carro.color = sc.next();
        System.out.println("Ingrese el costo del vehiculo: ");
        carro.precio = sc.nextInt();
        System.out.println("Ingrese el numero de pasajeros del vehiculo: ");
        carro.setPasajeros(sc.nextInt()); 
        ListEstandar.add(carro);
        insertarInventario(carro);
    }
    /**
     * Metodo que servira para agregar vehiculos deportivos
     */
    public void agregarAutoDeportivo()
    {
        System.out.println("Ingrese la placa del vehiculo: ");
        car.placa = sc.nextInt();
        System.out.println("Ingrese el modelo del vehiculo: ");
        car.modelo = sc.next();
        System.out.println("Ingrese la marca del vehiculo: ");
        car.Marca = sc.next();
        System.out.println("Ingrese el color del vehiculo: ");
        car.color = sc.next();
        System.out.println("Ingrese el costo del vehiculo: ");
        car.precio = sc.nextInt();
        System.out.println("Ingrese el cilindraje del vehiculo: ");
        car.setCilindraje(sc.nextInt());
        ListDeportivo.add(car);
        insertarInventario(car);
    }
    /**
     * Metodo que servira para agregar vehiculos pesados
     */
    public void agregarPesados()
    {
        System.out.println("Ingrese la placa del vehiculo: ");
        carro2.placa = sc.nextInt();
        System.out.println("Ingrese el modelo del vehiculo: ");
        carro2.modelo = sc.next();
        System.out.println("Ingrese la marca del vehiculo: ");
        carro2.Marca = sc.next();
        System.out.println("Ingrese el color del vehiculo: ");
        carro2.color = sc.next();
        System.out.println("Ingrese el costo del vehiculo: ");
        carro2.precio = sc.nextInt();
        System.out.println("Ingrese los ejes del vehiculo: ");
        carro2.setEjes(sc.nextInt());
        ListPesado.add(carro2);
        insertarInventario(carro2);
    }
    /**
     * Metodo que servira para agregar vehiculos personalizados
     */
    public void agregarPerso()
    {
        System.out.println("Ingrese la placa del vehiculo: ");
        carro1.placa = sc.nextInt();
        System.out.println("Ingrese el modelo del vehiculo: ");
        carro1.modelo = sc.next();
        System.out.println("Ingrese la marca del vehiculo: ");
        carro1.Marca = sc.next();
        System.out.println("Ingrese el color del vehiculo: ");
        carro1.color = sc.next();
        System.out.println("Ingrese el costo del vehiculo: ");
        carro1.precio = sc.nextInt();
        System.out.println("¿El vehiculo tiene palomera?: ");
        carro1.setPalomera(sc.next());
        System.out.println("Ingrese que tipo de vidrios tiene el vehiculo: ");
        carro1.setVidrios(sc.next());
        ListPerso.add(carro1);
        insertarInventario(carro1);
    }
    
    public void imprimirPerso(){
        
        for(Personalizado carro1 : ListPerso){
            System.out.println("Placa: " + carro1.getPlaca() + "Modelo: " + carro1.getModelo() + "Marca: "+carro1.getMarca() +
                    "Color: "+carro1.getColor() + "Costo:"+carro1.getPrecio() + "Palomera: "+carro1.getPalomera() + 
                    "Vidrios: " +carro1.getVidrios());
        }
    }
    /**
     * Metodo que servira para agregar los vehiculos registrados en el inventario
     */
    public void insertarInventario(Vehiculo vehiculo)
    {
        inventario.add(vehiculo);
    }
    /**
     * Metodo que servira para calcular cual es el vehiculo mas costoso
     */
    public void costoso()
    {
        int mayor = 0;
        String marca="";
        for(Vehiculo caro : inventario)
        {
            if(caro.getPrecio()>mayor)
            {
                mayor = caro.getPrecio();
                marca = caro.getMarca();
            }//if
         }//for
        System.out.println("El vehiculo "+marca+" tiene un costo de: "+mayor + "por lo tanto es el mas costoso..");
    }
    /**
     * Metodo que servira para calcular cual es el vehiculo mas economico
     */
    public void barato()
    {
        int menor = 1999999999;
        String marca="";
         for(Vehiculo barato : inventario)
        {
            if(barato.getPrecio()<menor)
             {
                menor = barato.getPrecio();
                marca = barato.getMarca();
            }//if
        }//for
        System.out.println("El vehiculo "+marca+" tiene un costo de: "+menor + "por lo tanto es el mas economico..");
    }
    /**
     * metodo que se utilizara para confirmar una venta
     */
    public void venta()
    {
        int codigo;
        char opcion;
        System.out.println("Ingrese el codigo del vehiculo de venta es: ");
        codigo = sc.nextInt();
        List<Vehiculo> venta = new ArrayList<>();
        for (Vehiculo vehiculo : getInventario())
        {
            if(vehiculo.getPlaca() == codigo)
            {
                System.out.println("El vehiculo que desea vender es: "+vehiculo.getMarca()+" de placa: "+vehiculo.getPlaca()+" con un precio de: "+vehiculo.getPrecio());
                System.out.println("¿Es correcto? S/N");
                opcion = sc.next().charAt(0);
                switch(opcion)
                {
                    case 's':
                    {
                        venta.add(vehiculo);
                        getInventario().remove(vehiculo);
                        comision();
                        break;
                    }case 'n':
                    {
                        venta();
                    }
                }//switch
            }//if
        }//for
    }//venta
    /**
     * metodo que servira para calcular la comision que ganara el vendedor tras reaizar una venta
     */
    public void comision()
    {
      float comision;   
    }//comision

    /**
     * @return the codigoInventario
     */
    public int getCodigoInventario() {
        return codigoInventario;
    }

    /**
     * @param codigoInventario the codigoInventario to set
     */
    public void setCodigoInventario(int codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public ArrayList<Estandar> getListEstandar() {
        return ListEstandar;
    }

    public void setListEstandar(ArrayList<Estandar> ListEstandar) {
        this.ListEstandar = ListEstandar;
    }

    public ArrayList<Pesado> getListPesado() {
        return ListPesado;
    }

    public void setListPesado(ArrayList<Pesado> ListPesado) {
        this.ListPesado = ListPesado;
    }

    public ArrayList<Deportivo> getListDeportivo() {
        return ListDeportivo;
    }

    public void setListDeportivo(ArrayList<Deportivo> ListDeportivo) {
        this.ListDeportivo = ListDeportivo;
    }

    public ArrayList<Personalizado> getListPerso() {
        return ListPerso;
    }

    public void setListPerso(ArrayList<Personalizado> ListPerso) {
        this.ListPerso = ListPerso;
    }

    public ArrayList<Vehiculo> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Vehiculo> inventario) {
        this.inventario = inventario;
    }
    
}
