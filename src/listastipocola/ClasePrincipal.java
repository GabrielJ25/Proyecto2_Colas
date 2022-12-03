/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listastipocola;

import javax.swing.JOptionPane;

/**
 *
 * @author marcossanchez
 */
public class ClasePrincipal {
    public static void main(String[] args){
    
int opcion = 0, nodo_informacion =0;
Cola Cola = new Cola();
    
        do {            
            try {
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                       "Menu de Opciones\n\n"
                       +"1. Insertar un nodo\n"
                       +"2. Extraer un nodo\n"
                       +"3. Mostrar contenido de la cola\n"
                       +"4. Salir.\n\n"));
                 
          switch(opcion){
              case 1:
                  nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor a guardar en el nodo"));
                  Cola.Insertar(nodo_informacion);
                  break;
             
              case 2:
                  if (!Cola.ColaVacia()) {
                     JOptionPane.showMessageDialog(null,"Se extrajo un nodo con el valor:" 
                             + Cola.Extraer());
                  } else {
                  JOptionPane.showMessageDialog(null, "La cola esta vacia");
                  }
                  
                  break;
              
              case 3:
                  Cola.MostrarContenido();
                  
                  break;

              case 4:
                opcion = 4;
                  break;

              default:
                  JOptionPane.showMessageDialog(null,"Opcion no disponible");
                  break;
          
          }  
          
            } catch (NumberFormatException e) {
            }
       
        } while (opcion != 4);
    }
    
}
