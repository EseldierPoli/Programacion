/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import javax.swing.JOptionPane;

/**
 *
 * @author sala311
 */
public class CadenaVector {
    int n;
    char vec [];

    public CadenaVector(int n) {
        this.n = n;
        this.vec = new char [n];
        this.vec [0] = '\0';
    }

    CadenaVector() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insertar (){
        
        int k=0,n=0,c=0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la cadena deseado.")); 
        
        do{
           this.vec[k] = JOptionPane.showInputDialog(null,"Ingrese el dato "+k+1).charAt(0);
           c = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea continuar?", "Alerta", JOptionPane.YES_NO_OPTION));
           k++;
        }while((k<n) && (c == 0));
        this.vec[k]='\0';        
    }
    
    public void mostrar(){
        int k=0;
        String cad="";
        while(this.vec[k]!= '\0'){
            cad+= vec[k]+'-';
            k++;
        }
        if (cad != "\0") {
            JOptionPane.showMessageDialog(null, "La cadena es:\n", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "La cadena esta vacia", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void longitud(){
        int k=0;
        while(this.vec[k]!= '\0'){
            k++;
        }
        JOptionPane.showMessageDialog(null, "La longitud de la cadena es: "+(k-1), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int longitud(char cad []){
        int k=0;
        while(cad[k]!= '\0'){
            k++;
        }
        return k-1;
    }
    
    public boolean comparar(char cad []){
        boolean res= false;
        int k=0;
        if(longitud(cad) == longitud(this.vec)){
            do{
                if(this.vec[k] == cad[k]){
                    res = true;
                }else{
                    res = false;
                }
            }while((this.vec[k] != '\0') && (res == true));
        }
        
        
        return res;
    }

    
}
