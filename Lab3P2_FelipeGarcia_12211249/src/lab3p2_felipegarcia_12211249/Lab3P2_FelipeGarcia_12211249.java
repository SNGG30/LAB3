/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_felipegarcia_12211249;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Lab3P2_FelipeGarcia_12211249 {

    static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean centinela = true;
        
        while(centinela == true){
            lea = new Scanner(System.in);
            System.out.print("--MENU-- \n"
                    + "1). Crear Cohete \n"
                    + "2). Crear Planeta \n"
                    + "3). Editar Cohete \n"
                    + "4). Editar Planeta \n"
                    + "5). Listar Cohetes \n"
                    + "6). Listar Planetas \n"
                    + "7). Probar Cohete \n"
                    + "8). Salir"
                    + "Ingrese la opcion que desea: ");
            int opcionmenu = lea.nextInt();
            
            switch(opcionmenu){
                
                case 1:{
                    
                }
                break;
                
                case 2:{
                    
                }
                break;
                
                case 3:{
                    
                }
                break;
                
                case 4:{
                    
                }
                break;
                
                case 5:{
                    
                }
                break;
                
                case 6:{
                    
                }
                break;
                
                case 7:{
                    
                }
                break;
                
                case 8:{
                    centinela = false;
                }
                break;
                
                default:
                    System.out.println("Ingreso una opcion incorrecta");
            }
            System.out.println();
        }
    }
    
}
