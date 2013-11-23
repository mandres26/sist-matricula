/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas.dominio;

import java.io.Serializable;

/**
 *
 * @author luisivan
 */
public class HolaMundo implements Serializable{
    int num;

    public HolaMundo(int num) {
        System.out.print("construir  hola mundo");
        this.num = num;
    }

    public HolaMundo(){
    System.out.print("Se ha creado hola");
    
    }
    public int getNum() {
        System.out.print("get numero");
        return num;
    }

    public void setNum(int num) {
        
        this.num = num;
        
    }
        
        public void incrementar(){
            
            
         num++; 
         System.out.println("Luego de Incrementar"+num);
        }
    
    
}
