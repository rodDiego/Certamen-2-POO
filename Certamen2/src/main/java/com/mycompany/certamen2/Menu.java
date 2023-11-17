/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Menu {
    
    private Scanner sn = new Scanner(System.in);
    private Libro libro = new Libro(); 
    
    public Menu(){
        
    }
    
    public void menu(ArrayList<Libro> lista){
        
        int opcion;
        
        System.out.println("Que desea hacer");
        System.out.println("1. Agregar");
        System.out.println("2. Buscar");
        System.out.println("0. Salir");
                
        do{
            opcion = sn.nextInt();
        
            switch(opcion){
                case 1 -> {
                    int opcion1;
                    System.out.println("""
                                                           Que tipo de libro desea agregar
                                                           1. Academico
                                                           2. Novela
                                                           3. Libro de texto PUCV""");
                    opcion1 = sn.nextInt();
                    switch(opcion1){
                        case 1 -> {
                            LibroAcademico ac = new LibroAcademico();
                            libro.agregarLibroLista(lista, ac.crearLibro());
                    }
                        case 2 -> {
                            LibroNovela nv = new LibroNovela();
                            libro.agregarLibroLista(lista, nv.crearLibro());
                    }
                        case 3 -> {
                            textosPUCV pucv = new textosPUCV();
                            libro.agregarLibroLista(lista, pucv.crearLibro());
                    }
                        default -> {
                    }

                    }
                }
                case 2 -> libro.buscarLibro(lista);
                default -> {
                }
            }  
            
        }while(opcion != 0);
    }
}
