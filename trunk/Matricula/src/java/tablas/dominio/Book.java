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


public class Book {
    private String title;
    private String author;
    private String operation;
    int num;

    public Book() {
        
    }

    public Book(String title, String author, String operation, int num) {
        this.title = title;
        this.author = author;
        this.operation = operation;
        this.num = num;
    }

 
    
    public int getNum() {
         //   System.out.print("get numero");
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    public String getTitle() {
   //     System.out.println("get title libro: "+title);
        return title;
        
        
                
    }

    public void setTitle(String title) {
        System.out.println("se ha seteado el titulo: "+title);
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
  
}
