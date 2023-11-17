package com.mycompany.certamen2;

import java.util.Scanner;

public class LibroNovela extends Libro{
     
    private String tipo;
    private String resumen;
    private Scanner sn = new Scanner(System.in);
    
    //CONSTRUCTORES

    public LibroNovela(){

    }

    public LibroNovela(int id, String titulo, String autor, int precio, String tipo, String Resumen) {
        super(id,titulo, autor, precio);
        this.tipo = tipo;
        this.resumen = Resumen;
    }
    
    //GETS Y SETS

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String Resumen) {
        this.resumen = Resumen;
    }
    
    //METODOS
    
    @Override
    public LibroNovela crearLibro(){
        
        Libro libro = new Libro();
        libro.crearLibro();

        System.out.println("Ingrese tipo de novela");
        sn.useDelimiter("\n");
        this.tipo = sn.next();
        
        System.out.println("Ingrese resumen de la novela");
        sn.useDelimiter("\n");
        this.resumen = sn.next();
        
        return new LibroNovela(libro.getId(),libro.getTitulo(),libro.getAutor(),libro.getPrecio(),this.tipo,this.resumen);
    } 
    
    
}
