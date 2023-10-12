/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Opciones {
    Scanner entrada = new Scanner(System.in);
    int opcion;
    char sino='s';
    int chica = 0;
    int mediana = 0;
    int grande = 0;
    int total;
    
    public void Pizzas(){
        do{
            System.out.println("¿Que pizza desea ordenar?"
            + "\n" + "1.Peperoni (Chica:50 $ Mediana:75 $ Grande:90)"
            + "\n" + "2.Queso (Chica:30 $ Mediana:55 $ Grande:70)"
            + "\n" + "3.Hawaiana (Chica:65 $ Mediana:90 $ Grande:105)"
            + "\n" + "4.Mexicana (Chica:75 $ Mediana:100 $ Grande:115)"
            + "\n" + "5.Champiñones (Chica:45 $ Mediana:70 $ Grande:85)");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                Orden();
                chica = chica * 50;
                mediana = mediana * 75;
                grande = grande * 90;
                break;
                
                case 2:
                Orden();
                chica = chica * 30;
                mediana = mediana * 55;
                grande = grande * 70;
                break;
                
                case 3:
                Orden();
                chica = chica * 65;
                mediana = mediana * 90;
                grande = grande * 105;
                break;
                
                case 4:
                Orden();
                chica = chica * 75;
                mediana = mediana * 100;
                grande = grande * 115;
                break;
                
                case 5:
                Orden();
                chica = chica * 45;
                mediana = mediana * 70;
                grande = grande * 85;
                break;
                
                default:
                    System.out.println("La opcion no esta disponible");
                break;
            }
            System.out.println("¿Desea ordenar otro tipo de pizza? (s/n)");
            sino = entrada.next().charAt(0);
        }while(sino=='s');
    }
    
    public void Orden(){
        
        System.out.println("¿cuantas pizzas desea?");
        int cantidad = entrada.nextInt();
        
        for(int i = 0; i < cantidad; i++) {
            System.out.println("De que tamaño desea la " + (i+1) + "° pizza"
            + "\n" + "1.Chica"
            + "\n" + "2.Mediana"
            + "\n" + "3.Grande");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    chica++;
                break;
                case 2:
                    mediana++;
                break;
                case 3:
                    grande++;
                break;
                default:
                    System.out.println("La opcion no esta disponible");
                break;
            }
        }
        
    }
    
    
}
