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
        ArrayList<Lunas> L = new ArrayList();
        
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
                    double pesosoport = lea.nextDouble();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el nombre de la nave: ");
                    String nombre = lea.nextLine();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el numero de serie de la nave: ");
                    long serie = lea.nextLong();
                    
                    for (int i = 0; i < SerieNaves.size(); i++) {
                        while(SerieNaves.get(i).equals(serie)){
                            lea = new Scanner(System.in);
                            System.out.print("No puede ingresar numeros de serie repetidos, ingreselo denuevo: ");
                            serie = lea.nextLong();
                            i = 0;
                        }
                    }
                    SerieNaves.add(serie);
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese potencia(Valor de 1 a 9): ");
                    int potencia = lea.nextInt();
                    
                    while(potencia < 1 || potencia > 9){
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
                    
                    switch(opcionC){
                        
                        case 1:{
                            c = new Cliquido();
                           
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese litros de gasolina: ");
                            double gasolina = lea.nextDouble();
                            
                            c = new Cliquido(pesosoport, nombre, serie, potencia, gasolina);
                            
                            Cohetes.add(c);
                        }
                        break;
                        
                        case 2:{
                            c = new Dfases();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese las fases del cohete: ");
                            int fases = lea.nextInt();
                            
                            lea= new Scanner(System.in);
                            System.out.print("Ingrese la cantidad de motores del cohete: ");
                            int motores = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese altura de la nave: ");
                            double altura = lea.nextDouble();
                            
                            c = new Dfases(pesosoport, nombre, serie, potencia, fases, motores, altura);
                            Cohetes.add(c);
                        }
                        break;
                        
                        case 3:{
                            c = new Csolido();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese los kilos de combustible: ");
                            double kg = lea.nextDouble();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el material del cohete: ");
                            String material = lea.nextLine();
                            
                            c = new Csolido(pesosoport, nombre, serie, potencia, kg, material);
                            Cohetes.add(c);
                        }
                        break;
                    }
                }
                break;
                
                case 2:{
                    Planetas p;
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el nombre del planeta: ");
                    String Nombre = lea.nextLine();
                    
                    for (int i = 0; i < NombrePlaneta.size(); i++) {
                        while(NombrePlaneta.get(i).equals(Nombre)){
                            System.out.print("Ingreso un nombre de planeta repetido: Ingrese otro");
                            Nombre = lea.nextLine();
                            
                            i = 0;
                        }
                    }
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese la masa del planeta: ");
                    double Masa = lea.nextDouble();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el radio del planeta: ");
                    int radio = lea.nextInt();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese la temperatura del planeta: ");
                    double temperatura = lea.nextDouble();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese la velocidad de escape del planeta: ");
                    double escape = lea.nextDouble();
                    
                    lea = new Scanner(System.in);
                    System.out.print("Que tipo de planeta es? \n"
                            + "1). Rocoso \n"
                            + "2). Gaseoso \n"
                            + "Ingrese opcion: ");
                    int opcionP = lea.nextInt();
                    
                    while(opcionP != 1 && opcionP != 2){
                        lea = new Scanner(System.in);
                        System.out.print("Ingreso un valor de nave invalido, ingreselo denuevo \n"
                                + "1). Rocoso \n"
                                + "2). Gaseoso \n"
                                + "Ingrese opcion: ");
                        opcionP = lea.nextInt();
                    }
                    
                    switch(opcionP){
                        
                        case 1:{
                            p = new Procosos();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese la densidad del planeta: ");
                            double densidad = lea.nextDouble();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Hay vida en este planeta? (1 = Si): ");
                            int opcionv = lea.nextInt();
                            
                            boolean vida = false;
                            if(opcionv == 1){
                                vida = true;
                            }
                            
                            p = new Procosos(Nombre, Masa, radio, temperatura, escape, L, densidad, vida);
                            Planetas.add(p);
                        }
                        break;
                        
                        case 2:{
                            p = new Pgaseosos();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese la presion del planeta: ");
                            double presion = lea.nextDouble();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese los anillos del planeta: ");
                            int anillos = lea.nextInt();
                            
                            p = new Pgaseosos(presion, anillos, Nombre, Masa, radio, temperatura, escape, L);
                            
                            Planetas.add(p);
                        }
                        break;
                    }
                    
                }
                break;
                
                case 3:{
                    
                }
                break;
                
                case 4:{
                    
                }
                break;
                
                case 5:{
                    System.out.println();
                            
                    System.out.println("-----NAVES-----");
                    for (int i = 0; i < Cohetes.size(); i++) {
                       System.out.print(i + "). " + Cohetes.get(i).toString());
                       System.out.println();
                    }
                    System.out.println("---------------");
                }
                break;
                
                case 6:{
                    System.out.println();
                            
                    System.out.println("-----Planetas-----");
                    for (int i = 0; i < Planetas.size(); i++) {
                       System.out.print(i + "). " + Planetas.get(i).toString());
                       System.out.println();
                    }
                    System.out.println("---------------");
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
