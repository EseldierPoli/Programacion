/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeligadacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author sala311
 */
public class ListaCircular {
    private Nodo cab;
    private Nodo ult;
    
    public ListaCircular() {
        this.cab = null;
        this.ult = null;
    }
    
    public void MostrarLista (){
        Nodo q = this.cab;
        if(q != null){
            String mostrar="";
            do{
                mostrar +=  "Cedula: " + q.getCedula() + "\nNombre: " + q.getNombre() +
                        "\nEdad: " + q.getEdad() + "\nNota: " + q.getNota() + 
                        "\n**********************\n";
                q = q.getLigasig();
            }while(q != this.cab);
            JOptionPane.showMessageDialog(null,mostrar);
        }else{
            JOptionPane.showMessageDialog(null,"Lista Vacia"," ",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void Insertar(String cedula,String nombre,int edad,float nota){
        
        Nodo x = new Nodo (cedula,nombre,edad,nota);
        if (this.cab == null) {
            x.setLigasig(x);
            x.setLigaAnt(x);
            this.cab = x;
            this.ult = x;
        }else{
            ult.setLigasig(x);
            x.setLigaAnt(ult);
            ult = x;
            cab.setLigaAnt(ult);
            ult.setLigasig(cab);                                  
        }
    }
    
    public void Eliminar(String cedula){
        Nodo q = this.cab;
        boolean sw = false;
        do{
            if(cedula == q.getCedula()){
                sw = true;
            }
            q = q.getLigasig();
        }while((q != this.cab) && (sw == false));
        
        if(sw == true){
            if (q == this.cab){
                if(q == this.ult){
                    this.cab=null;
                    this.ult=null;
                }else{
                    this.ult.setLigasig(this.cab.getLigasig());
                    this.cab = ult.getLigasig();
                    this.cab.setLigaAnt(this.ult);
                }                
            }else if(q == this.ult){
                this.cab.setLigaAnt(this.ult.getLigaAnt());
                this.ult = this.cab.getLigaAnt();
                this.ult.setLigasig(this.cab);
            }else{
                
            }
        }else{
            JOptionPane.showMessageDialog(null,"La cedula no existe"," ",JOptionPane.WARNING_MESSAGE);
        }
    }
   
    
   
    
    // 1 mostrat dato +
    // 2 insertar +
    // 3 eliminar cedula +
    // 4 buscar pot cedula
    // 5 salir
}
