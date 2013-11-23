/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


import tablas.dominio.HolaMundo;

/**
 *
 * @author luisivan
 */
@ManagedBean
@SessionScoped
public class holaMundoBean implements Serializable{
String titulo;
HolaMundo holaMundo=new HolaMundo();
int entero;


    public String getTitulo() {
        System.out.print("get titulo:"+ titulo);
        return titulo;
    }

    public void setTitulo(String titulo) {
      
        this.titulo = titulo;
        System.out.println("Hola mundo: se a seteado el titulo: "+titulo);
    }
    public void cambiarCadena(){
    titulo="hola";
     System.out.println("Se ha cambiado el titulo: "+titulo);
    }
    
    public void cambiarEntero(){
    
     entero++;
     System.out.println("Entero incrementado es en : "+entero);
    }
    
    
    
//public void noHacerNada(){}
    public HolaMundo getHolaMundo() {
        System.out.print("get hola mundo");
        return holaMundo;
    }

    public void setHolaMundo(HolaMundo holaMundo) {
        
        this.holaMundo = holaMundo;
    }

   public int getEntero() {
        System.out.println("el número devuelto por el get es:"+ entero);
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
        System.out.println("despues del set:"+ this.entero);
    }
    
}
