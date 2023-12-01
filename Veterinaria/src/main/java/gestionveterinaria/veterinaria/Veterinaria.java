/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gestionveterinaria.veterinaria;

import DAO.GatoDAO;
import DAO.GatoRepository;
import DAO.PerroDAO;
import DAO.PerroRepository;
import entidades.Gato;
import entidades.Perro;
import java.util.Scanner;


/**
 *
 * @author Fernando
 */
public class Veterinaria {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
        int opcion;
        do{
            System.out.println("1) Registrar Mascota");
            opcion = sc.nextInt();
            if(opcion == 1){
                
                System.out.println("1)Gato\n2)Perro");
                int opcion2 = sc.nextInt();
                                
                if(opcion2 == 1){
                    
                    System.out.println("Nombre de la mascota: ");
                    String nombre = sc.nextLine();
                
                    System.out.println("Legajo de la mascota: ");
                    int legajo = sc.nextInt();
                    
                    Gato gato = new Gato(legajo,nombre);
                    GatoDAO gdao = new GatoRepository();
                    gdao.guardar(gato);
                    
                }else if(opcion2==2){
                    
                    System.out.println("Nombre de la mascota: ");
                    String nombre = sc.nextLine();

                    System.out.println("Legajo de la mascota: ");
                    int legajo = sc.nextInt();
                    
                    Perro perro = new Perro(nombre,legajo);
                    PerroDAO pdao = new PerroRepository();
                    pdao.guardar(perro);
                }                                            
            }
        }while(opcion!=2);  
        */
         Gato gato = new Gato(123,"Gato de Shrek");
                    GatoDAO gdao = new GatoRepository();
                    gdao.guardar(gato);
        
        Perro perro = new Perro("Choco",63);
                    PerroDAO pdao = new PerroRepository();
                    pdao.guardar(perro);
    }
}
