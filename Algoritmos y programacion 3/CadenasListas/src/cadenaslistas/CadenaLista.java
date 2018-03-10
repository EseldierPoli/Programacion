/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaslistas;

import javax.swing.JOptionPane;

/**
 *
 * @author sala311
 */
public class CadenaLista {
    
    private Nodo cab;

    public CadenaLista(Nodo cab) {
        this.cab = cab;
    }
    
    public void mostrar(){
        Nodo q = this.cab;
        String rest;
        if (this.cab == null) {
            System.out.println("Lista vacia");
        }else{
            while (q != null) {                
                
                //rest = q.getInfo().;
                q = q.getLiga();
            }
            JOptionPane.showMessageDialog(null,"La Opcion es incorrecta");
        }
       
    }

}
