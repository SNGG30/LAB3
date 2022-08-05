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
        ArrayList<Personas>P = new ArrayList();
        
        Cohetes DefaultCohetes1;
        Cohetes DefaultCohetes2;
        Cohetes DefaultCohetes3;
        
        Planetas DefaultPlanetas1;
        Planetas DefaultPlanetas2;
        Planetas DefaultPlanetas3;
        while(centinela == true){
            lea = new Scanner(System.in);
            System.out.print("--MENU-- \n"
                    + "1). Crear Cohete \n"
                    + "2). Crear Planeta \n"
                    + "3). Editar Personas \n"
                    + "4). Editar Lunas \n"
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
                            
                            c = new Cliquido(pesosoport, nombre, serie, potencia, gasolina, P);
                            
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
                            
                            c = new Dfases(pesosoport, nombre, serie, potencia, fases, motores, altura , P);
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
                            
                            c = new Csolido(pesosoport, nombre, serie, potencia, kg, material, P);
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
                    lea = new Scanner(System.in);
                    System.out.print("--MENU DE PERSONAS-- \n"
                            + "1). Agregar personas \n"
                            + "2). Borrar personas \n"
                            + "Otro Numero). Salir \n"
                            + "Ingrese la opcion que desea: ");
                    int menuP = lea.nextInt();
                    
                    switch(menuP){
                        
                        case 1:{
                            Personas E = new Personas();
                            System.out.println();
                            
                            System.out.println("-----COHETES-----");
                            for (int i = 0; i < Cohetes.size(); i++) {
                               System.out.print(i + "). " + Cohetes.get(i).toString());
                               System.out.println();
                            }
                            System.out.println("---------------");
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el indice del cohete que le va a agregar una persona: ");
                            int idx = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el nombre de la persona: ");
                            String N = lea.nextLine();
                            
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese la edad de la persona: ");
                            int A = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el peso de la persona: ");
                            double W = lea.nextInt();
                            
                            E = new Personas(N, A, W);
                            
                            ((Cohetes)Cohetes.get(idx)).getP().add(E);
                        }
                        break;
                        
                        case 2:{
                            System.out.println();
                            
                            System.out.println("-----COHETES-----");
                            for (int i = 0; i < Cohetes.size(); i++) {
                               System.out.print(i + "). " + Cohetes.get(i).toString());
                               System.out.println();
                            }
                            System.out.println("---------------");
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el indice del cohete que le va a eliminar una persona: ");
                            int idx = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el indice de la persona que va a eliminar (Cuente las personas en el listado de arriba): ");
                            int idx2 = lea.nextInt();
                            ((Cohetes)Cohetes.get(idx)).getP().remove(idx2);
                        }
                        break;
                        
                        default:
                            
                    }
                }
                break;
                
                case 4:{
                          
                    lea = new Scanner(System.in);
                    System.out.print("--MENU DE LUNAS-- \n"
                            + "1). Agregar Lunas \n"
                            + "2). Borrar Lunas \n"
                            + "Otro Numero). Salir \n"
                            + "Ingrese la opcion que desea: ");
                    int menuL = lea.nextInt();
                    
                    switch(menuL){
                        
                        case 1:{
                            
                            Lunas E = new Lunas();
                            
                            System.out.println();
                            
                            System.out.println("-----PLANETAS-----");
                            for (int i = 0; i < Planetas.size(); i++) {
                               System.out.print(i + "). " + Planetas.get(i).toString());
                               System.out.println();
                            }
                            System.out.println("---------------");
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el indice del planeta que le va a agregar una luna: ");
                            int idx = lea.nextInt();
                            
                            System.out.print("Ingrese el nombre de la luna: ");
                            String N = lea.nextLine();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese la cantidad de crateres de la luna: ");
                            int C = lea.nextInt();
                            
                            E = new Lunas(N, C);
                            
                            ((Planetas)Planetas.get(idx)).getL().add(E);
                        }
                        break;
                        
                        case 2:{
                            System.out.println();
                            
                            System.out.println("-----PLANETAS-----");
                            for (int i = 0; i < Planetas.size(); i++) {
                               System.out.print(i + "). " + Planetas.get(i).toString());
                               System.out.println();
                            }
                            System.out.println("---------------");
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el indice del planeta que le va a eliminar una luna: ");
                            int idx = lea.nextInt();
                            
                            lea = new Scanner(System.in);
                            System.out.print("Ingrese el indice de la Luna que va a eliminar (Cuente las lunas en el listado de arriba): ");
                            int idx2 = lea.nextInt();
                            ((Planetas)Planetas.get(idx)).getL().remove(idx2);
                        }
                        break;
                        
                        default:
                            
                    }
                }
                break;
                
                case 5:{
                    System.out.println();
                            
                    System.out.println("-----COHETES-----");
                    for (int i = 0; i < Cohetes.size(); i++) {
                       System.out.print(i + "). " + Cohetes.get(i).toString());
                       System.out.println();
                    }
                    System.out.println("---------------");
                }
                break;
                
                case 6:{
                    System.out.println();
                            
                    System.out.println("-----PLANETAS-----");
                    for (int i = 0; i < Planetas.size(); i++) {
                       System.out.print(i + "). " + Planetas.get(i).toString());
                       System.out.println();
                    }
                    System.out.println("---------------");
                }
                break;
                
                case 7:{
                    System.out.println();
                    System.out.println("-----PLANETAS-----");
                    for (int i = 0; i < Planetas.size(); i++) {
                       System.out.print(i + "). " + Planetas.get(i).toString());
                       System.out.println();
                    }
                    System.out.println("---------------");
                    
                    lea = new Scanner(System.in);
                    System.out.print("Ingrese el planeta que quiere probar: ");
                    int idx = lea.nextInt();
                    
                    Double mass;
                    int radius;
                    
                    mass = ((Planetas)Planetas.get(idx)).getMasa();
                    radius = ((Planetas)Planetas.get(idx)).getRadio();
                    lea = new Scanner(System.in);
                    System.out.print("Cuantos cohetes lanzara? \n"
                            + "1). Todos \n"
                            + "2). Uno solo \n"
                            + "Ingrese opcion: ");
                    int idx2 = lea.nextInt();
                    
                    while(idx2 != 1 && idx2 != 2){
                        lea = new Scanner(System.in);
                        System.out.print("Ingreso un numero incorrecto, 1). Todos los cohetes, 2). Uno solo");
                        idx2 = lea.nextInt();
                    }
                    
                    switch(idx2){
                        
                        case 1:{
                            for (int i = 0; i < Cohetes.size(); i++) {
                                
                            }
                        }
                        break;
                        
                        case 2:{
                                                
                        System.out.println("-----COHETES-----");
                            for (int i = 0; i < Cohetes.size(); i++) {
                               System.out.print(i + "). " + Cohetes.get(i).toString());
                               System.out.println();
                            }
                        System.out.println("---------------");
                        
                            System.out.println("Ingrese el indice del cohete que desea lanzar: ");
                            int idx3 = lea.nextInt();
                        }
                    }
                        
                   
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
