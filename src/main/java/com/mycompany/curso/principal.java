/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.curso;

import com.mycompany.curso.negocio.AlumnosNegocio;
import com.mycompany.curso.to.AlumnosTO;
import java.util.Scanner;


/**
 *
 * @author AndyIsael
 */
public class principal {
    public static void main(String[] args) {
        AlumnosTO alumnosto = new AlumnosTO();
        AlumnosNegocio metodos = new AlumnosNegocio();
        Scanner entrada = new Scanner(System.in);
        
        //======MUESTRA LISTA======
        metodos.obtenerAlumnoNegocio();
        //======GUARDA======
        //Tambien funciona de esta manera.
        
        /*alumnosto.setNombre("Maria");
        alumnosto.setPrimerApellido("Perez");
        alumnosto.setSegundoApellido("Sanes");
        alumnosto.setCurp("MAPA");
        alumnosto.setProgramaEducativo("Medicina");
        //metodos.guardarAlumnoNegocio(alumnosto);*/
        
        AlumnosTO alum1 = new AlumnosTO("Andy Isael", "Bravo", "Garcia", "baga010604htlrrna8", "sistemas");
        metodos.guardarAlumnoNegocio(alum1);
        
        //===================
        metodos.obtenerAlumnoNegocio();
        //======ELIMINA======
        alumnosto.setCurp("baga010604htlrrna8");
        
        metodos.eliminarAlumnoNegocio(alumnosto);
        //===================
        metodos.obtenerAlumnoNegocio();
        //======FILTRA======
        System.out.println("Programa educativo a filtrar. (Escribe)");
        metodos.filtroAlumnos(entrada.nextLine());
        
        
    }
}