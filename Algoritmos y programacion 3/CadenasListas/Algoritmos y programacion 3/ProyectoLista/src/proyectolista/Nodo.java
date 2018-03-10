/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolista;

/**
 *
 * @author sala311
 */
public class Nodo {
    
    private int info;
    private Nodo liga;

    public Nodo(int info) {
        this.info = info;
        this.liga = null;
    }
    

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
    
}
