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
public class Lista {
    
    private Nodo cab;

    public Lista(){
        this.cab = null;
    }
    
    public void mostrar(){
        Nodo q = this.cab;
        if (this.cab == null) {
            System.out.println("Lista vacia");
        }else{
            while (q != null) {                
                System.out.println(q.getInfo());
                q = q.getLiga();
            }
            
        }
       
    }
    
    public void insertarFinal(int dato){
        Nodo q,x;
        x = new Nodo(dato);
        
        if (this.cab == null) {
            this.cab = x;
        }else{
            q = this.cab;
            while (q.getLiga() != null) {                
                q = q.getLiga();
            }
            q.setLiga(x);
        }
        
    }
    
    public void eliminar(int dato){
        Nodo q = this.cab, ant = null;
        boolean sw = false;
        
        if (this.cab == null) {
            System.out.println("Lista vacia");
        }else{
            while ((q != null) && (sw == false)) {                
                if (dato == q.getInfo()) {
                    sw = true;
                }else{
                    ant = q;
                    q = q.getLiga();
                }
            }
            if (sw == false) {
              System.out.println("El dato no existe");  
            }else{
                if (q == this.cab) {
                    this.cab = this.cab.getLiga();
                }else{
                    ant.setLiga(q.getLiga());
                }
                //Delete Q
            }
            
        }
    }
    
    
}
