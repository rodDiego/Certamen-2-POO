package com.mycompany.certamen2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class textosPUCV extends Libro{
    
    private String escuela;
    private Date fechaPublicacion;
    private Scanner sn = new Scanner(System.in);
    
    //CONSTRUCTOR

    public textosPUCV(){

    }

    public textosPUCV(int id, String titulo, String autor, int precio, String escuela, Date fechaPublicacion) {
        super(id,titulo, autor, precio);
        this.escuela = escuela;
        this.fechaPublicacion = fechaPublicacion;
    }
    
    //GETS Y SETS

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    // METODOS
    
    @Override
    public textosPUCV crearLibro(){
        
        Libro libro = new Libro();
        libro.crearLibro();

        System.out.println("Ingrese escuela del libro de texto PUCV");
        sn.useDelimiter("\n");
        this.escuela = sn.next();
        
        System.out.println("Ingrese fecha de publicación del libro (dd/mm/YYYY)");
        try {
            this.fechaPublicacion = new SimpleDateFormat("dd/mm/YYY").parse(sn.next());
        } catch (ParseException ex) {
            Logger.getLogger(LibroAcademico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new textosPUCV(libro.getId(),libro.getTitulo(),libro.getAutor(),libro.getPrecio(),this.escuela,this.fechaPublicacion);
    } 
    
}
