import java.io.IOException;
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
public class Menu { 
    
    Scanner sc = new Scanner(System.in);

    /**
     * Constructor con el cual hago llamado del metodo del menu que se ostrara inicialmemte
     */
    public Menu() 
    {
        menuPrincipal();
    }
    /**
     * este metodo sera el menu que se mostrara al iniciar el programa
     */
    public void menuPrincipal() 
    {
        int opcion = 0;     
        do
        {
            System.out.println("\t\tBienvenido");
            System.out.println("\nIngrese una opcion de las siguientes por favor: ");
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Realizar venta de un vehiculo");
            System.out.println("3.Ver vehiculos mas costosos.");
            System.out.println("4.Ver vehiculos mas Economico.");
            opcion = sc.nextInt();
           switch(opcion)
           {
               case 1:
                    Inventario inventario = new Inventario();
                    inventario.agregar();
                   break;
               case 2:
                    Inventario inventari = new Inventario();
                    inventari.venta();
                   break;
               case 3:
                    Inventario invent = new Inventario();
                    invent.imprimirPerso();
                    invent.costoso();
                   break;
               case 4:                   
                    Inventario inventa = new Inventario();
                    inventa.barato();
                   break;
               default:
                   System.out.println("Opcion no valida...");
                   break;
           }            
       }
       while(opcion != 3);
    }    
}

