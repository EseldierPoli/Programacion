/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeligadacircular;

/**
 *
 * @author sala311
 */
public class Nodo {
    
    private String cedula;
    private String nombre;
    private int edad;
    private float nota;
    private Nodo ligasig;
    private Nodo ligaAnt;

    public Nodo(String cedula, String nombre, int edad, float nota) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.ligasig = null;
        this.ligaAnt = null;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Nodo getLigasig() {
        return ligasig;
    }

    public void setLigasig(Nodo ligasig) {
        this.ligasig = ligasig;
    }

    public Nodo getLigaAnt() {
        return ligaAnt;
    }

    public void setLigaAnt(Nodo ligaAnt) {
        this.ligaAnt = ligaAnt;
    }
    
    
    
    
    
    
}
