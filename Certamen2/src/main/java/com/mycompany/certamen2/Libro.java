package com.mycompany.certamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
   
    private int id;
    private String titulo;
    private String autor;
    private int precio;
    private Scanner sn = new Scanner(System.in);
    
    //CONSTRUCTORES

    public Libro(){
        
    }
    
    public Libro(int id,String titulo, String autor, int precio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    //GETS Y SETS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    //METODOS
   
    //CREARLIBRO
    public Libro crearLibro(){
        
        System.out.println("Ingrese id del libro");
        this.id = sn.nextInt();
        
        System.out.println("Ingrese nombre titulo del libro");
        sn.useDelimiter("\n");
        this.titulo = sn.next();
        
        System.out.println("Ingrese nombre autor del libro");
        sn.useDelimiter("\n");
        this.autor = sn.next();
        
        System.out.println("Ingrese precio del libro");
        this.precio = sn.nextInt();

        return new Libro(this.id,this.titulo, this.autor,this.precio);
    }
    

    
    //AÑADIRLO A LA LISTA
    
    public void agregarLibroLista(ArrayList<Libro> lista, Libro libro){
        lista.add(libro);
    }
    
    //MOSTRAR DATOS
    
    
    
    //BUSCAR UN LIBRO
    
    public void buscarLibro(ArrayList<Libro> lista){
        
        int idBuscado;
        
        System.out.println("Ingrese id del libro que esta buscando");
        idBuscado = sn.nextInt();
        
        lista.forEach(libro->{
            if(libro.id == idBuscado){
                System.out.println(libro.titulo);
                System.out.println(libro.autor);
                System.out.println(libro.precio);
            }
            else
                System.out.println("Libro no encontrado");
        });
    }
}
