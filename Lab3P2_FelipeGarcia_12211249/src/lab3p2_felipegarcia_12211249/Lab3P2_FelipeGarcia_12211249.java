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
        ArrayList Cohetes = new ArrayList();
        ArrayList Planetas = new ArrayList();
        ArrayList<Long> SerieNaves = new ArrayList();
        ArrayList<String> NombrePlaneta = new ArrayList();
        
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
                    + "8). Salir \n"
                    + "Ingrese la opcion que desea: ");
            int opcionmenu = lea.nextInt();
            
            switch(opcionmenu){
                
                case 1:{
                    Cohetes c;
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el peso soportado del cohete: ");
                    long pesosoport = lea.nextLong();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el nombre de la nave: ");
                    String nombre = lea.nextLine();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el numero de serie de la nave: ");
                    Long serie = lea.nextLong();
                    
                    for (int i = 0; i < SerieNaves.size(); i++) {
                        while(SerieNaves.get(i).equals(serie)){
                            lea = new Scanner(System.in);
                            System.out.print("No puede ingresar numeros de serie repetidos, ingreselo denuevo: ");
                            serie = lea.nextLong();
                        }
                    }
                    SerieNaves.add(serie);
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese potencia(Valor de 1 a 9): ");
                    int potencia = lea.nextInt();
                    
                    if(potencia < 1 || potencia > 9){
                        lea = new Scanner(System.in);
                        System.out.print("Ingreso un valor de potencia invalido, ingreselo denuevo (1-9): ");
                        potencia = lea.nextInt();
                    }
                    
                    lea = new Scanner(System.in);
                    System.out.print("Que tipo de cohete es? \n"
                            + "1). Combustible líquido \n" 
                            + "2). De fases \n"
                            + "3). Combustible solido \n"
                            + "Ingrese opcion: ");
                    int opcionC = lea.nextInt();
                    
                    while(opcionC != 1 && opcionC != 2 && opcionC != 3){
                        lea = new Scanner(System.in);
                        System.out.print("Ingreso un valor de nave invalido, ingreselo denuevo \n"
                                + "1). Combustible liquido \n"
                                + "2). De fases \n"
                                + "3). Combustible solido \n"
                                + "Ingrese opcion: ");
                        opcionC = lea.nextInt();
                    }
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
