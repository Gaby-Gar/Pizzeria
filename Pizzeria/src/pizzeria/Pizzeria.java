/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Pizzeria {
    Scanner entrada = new Scanner(System.in);
    int opcion;
    char sino = 's';
    
    public void Menu(){
        System.out.println ("Bienvenido a Freddy Fazbear's Pizza");
        
        do {
            System.out.println ("Elige una opcion del siguiente Menu:"
            + "\n" + "1. Pizzas"
            + "\n" + "2. Complementos" 
            + "\n" + "3. Paquetes" 
            + "\n" + "4. Crea tu pizza" 
            + "\n" + "5. Promociones");
            opcion = entrada.nextInt();
            
            Opciones Opc = new Opciones();
            
            switch (opcion) {
                case 1:
                    Opc.Pizzas();
                break;
                case 2:
                    
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                case 5:
                    
                break;

                default:
                    System.out.println("La opcion no esta disponible");
                break;
            }
            System.out.println ( "¿Desea volver al menu? (s/n)");
            sino = entrada.next().charAt(0);
        }while (sino=='s');
        
        
        

        
    }    
}
