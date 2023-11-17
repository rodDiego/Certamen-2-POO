package com.mycompany.certamen2;

import java.util.ArrayList;

public class Certamen2 {

    public static ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu(listaLibros);
    }
}
