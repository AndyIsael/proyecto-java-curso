/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.curso.to;

/**
 *
 * @author AndyIsael
 */
public class AlumnosTO {
    private Integer id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String curp;
    private String programaEducativo;

    public AlumnosTO() {
        
    }

    public AlumnosTO(String nombre, String primerApellido, String segundoApellido, String curp, String programaEducativo) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.curp = curp;
        this.programaEducativo = programaEducativo;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCurp() {
        return curp.toUpperCase();
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    

    @Override
    public String toString() {
        return "AlumnosTO{" + "id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", curp=" + curp + ", programaEducativo=" + programaEducativo + '}';
    }
    
    
    
}
