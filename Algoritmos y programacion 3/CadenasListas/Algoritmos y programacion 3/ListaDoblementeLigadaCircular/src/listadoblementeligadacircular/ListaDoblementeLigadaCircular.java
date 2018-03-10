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
public class ListaDoblementeLigadaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCircular lst = new ListaCircular();
        
        String cedula;
        String nombre;
        int edad;
        float nota;
        int opcion = 0;
        String menu = "*****Menu*****\n1. Mostrar\n2. Insertar\n3. Eliminar\n4. Salir\nDigite la Opcion";
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                case 1: 
                    lst.MostrarLista();
                break;
                case 2: 
                    cedula = JOptionPane.showInputDialog("Ingrese la cedula");
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
                    nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
                    lst.Insertar(cedula, nombre, edad, nota);
                break;
                default:JOptionPane.showMessageDialog(null,"La Opcion es incorrecta");
            }
        }while(opcion != 4);
        
    }
    
}
