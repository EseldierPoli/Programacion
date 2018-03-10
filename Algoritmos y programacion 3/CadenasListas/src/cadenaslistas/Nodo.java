/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaslistas;

/**
 *
 * @author sala311
 */
public class Nodo {
    
    private char info;
    private Nodo liga;

    public Nodo(char info) {
        this.info = info;
        this.liga = null;
    }

    public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
    
}
