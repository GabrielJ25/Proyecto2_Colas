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
public class Cola {
  private Nodo inicioCola, finalCola;
String Cola = "";
 
public Cola(){
inicioCola = null;
finalCola = null;
       
}
//SABEr SI COLA ESTA VACIA
public boolean ColaVacia(){
    if (inicioCola == null) {
        return true;
    } else {
        return false;
        
    }
}
//METODO INSERTAR COLA
public void Insertar(int informacion){
Nodo nuevo_nodo = new Nodo();
nuevo_nodo.informacion = informacion;
nuevo_nodo.siguiente = null;

    if (ColaVacia()) {
        inicioCola = nuevo_nodo;
        finalCola = nuevo_nodo;
    } else {
    finalCola.siguiente = nuevo_nodo;
    finalCola = nuevo_nodo;
    }
}
//EXTRAER DE LA COLA
public int Extraer(){
    
    if (!ColaVacia()) {
        int informacion = inicioCola.informacion;
        
        if (inicioCola == finalCola) {
            inicioCola = null;
            finalCola = null;
            
        } else {
        inicioCola = inicioCola.siguiente;
        }
    return informacion;
    } else {
    return Integer.MAX_VALUE;
    }

}
//MOSTRAR CONTENIDO COLA
public void MostrarContenido(){
Nodo recorrido = inicioCola;
String ColaInvertida = "";


while(recorrido  != null){
Cola += recorrido.informacion + " ";
recorrido = recorrido.siguiente;

}
String cadena[] = Cola.split(" ");

    for (int i = cadena.length - 1; i >= 0; i--) {
       ColaInvertida += " " +cadena[i];
       
    }
JOptionPane.showMessageDialog(null, ColaInvertida);
Cola = "";
}


}







