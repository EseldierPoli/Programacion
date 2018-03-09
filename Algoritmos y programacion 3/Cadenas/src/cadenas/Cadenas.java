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
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaVector Cad = new CadenaVector();
        
        int opcion = 0;
        String menu = "*****Menu*****\n1. Mostrar\n2. Insertar\n3. Eliminar\n4. Salir\nDigite la Opcion";
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                case 1: 
                    Cad.mostrar();
                break;
                case 2: 
                    Cad.insertar();
                break;        
                case 3: 
                    /*dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
                    Cad.comparar();*/
                break; 
                case 4: 
                    System.exit(0);
                break;
                default:JOptionPane.showMessageDialog(null,"La Opcion es incorrecta");
            }
        }while(opcion != 4);
       
    }
    
}
