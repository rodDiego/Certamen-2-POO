/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class LibroAcademico extends Libro {
    
    private Date fechaPublicacion;
    private String tipo;
    private Scanner sn = new Scanner(System.in);
    
    //CONSTRUCTORES

    public LibroAcademico() {
    }

    public LibroAcademico(int id,String titulo, String autor, int precio,Date fechaPublicacion, String tipo) {
        super(id,titulo, autor, precio);
        this.fechaPublicacion = fechaPublicacion;
        this.tipo = tipo;
    }
    
    //GETS Y SETS

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //METODOS
    
    @Override
    public LibroAcademico crearLibro(){
        
        Libro libro = new Libro();
        libro.crearLibro();
        
        System.out.println("Ingrese fecha de publicación del libro (dd/mm/YYYY)");
        try {
            this.fechaPublicacion = new SimpleDateFormat("dd/mm/YYY").parse(sn.next());
        } catch (ParseException ex) {
            Logger.getLogger(LibroAcademico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Ingrese tipo de libro academico");
        this.tipo = sn.next();
        
        
        return new LibroAcademico(libro.getId(),libro.getTitulo(),libro.getAutor(),libro.getPrecio(),this.fechaPublicacion,this.tipo);
    }
    
    
    
}
