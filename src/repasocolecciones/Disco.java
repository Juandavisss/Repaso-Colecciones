/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasocolecciones;

/**
 *
 * @author Juan
 */
public class Disco {
    private Autor autor;
    private String nombreD;
    private int anioLan;
    private int duracion;

    public Disco(Autor autor, String nombreD, int anioLan, int duracion) {
        this.autor = autor;
        this.nombreD = nombreD;
        this.anioLan = anioLan;
        this.duracion = duracion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public int getAnioLan() {
        return anioLan;
    }

    public void setAnioLan(int anioLan) {
        this.anioLan = anioLan;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco{" + "autor=" + autor + ", nombreD=" + nombreD + ", anioLan=" + anioLan + ", duracion=" + duracion + '}';
    }
    
    
}
