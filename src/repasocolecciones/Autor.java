/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasocolecciones;

import java.time.LocalDate;

/**
 *
 * @author Juan
 */
public class Autor {
    private String nombre;
    private String apellidos;
    private LocalDate fnacimiento;

    public Autor(String nombre, String apellidos, LocalDate fnacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fnacimiento = fnacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fnacimiento=" + fnacimiento + '}';
    }
    
    
}
