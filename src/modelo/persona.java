/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sebastian.carmona
 */
public class persona {
    
    private String Nombre;
    
    private int Edad;
    
    private String Direccion;

    /**
     * Get the value of Direccion
     *
     * @return the value of Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Set the value of Direccion
     *
     * @param Direccion new value of Direccion
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }


    /**
     * Get the value of Edad
     *
     * @return the value of Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * Set the value of Edad
     *
     * @param Edad new value of Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }


    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public persona(String Nombre, int Edad, String Direccion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Direccion = Direccion;
    }

    public persona() {
    }
    

    @Override
    public String toString() {
        return "persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Direccion=" + Direccion + '}';
    }

    
    }
   
