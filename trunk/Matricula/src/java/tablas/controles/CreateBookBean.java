/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas.controles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import tablas.dominio.Book;

/**
 *
 * @author luisivan
 */
@ManagedBean
@RequestScoped

  public class CreateBookBean implements Serializable{  
  
    private Book book=new Book();
    private int cont=5;
    
    private static List<Book> books= new ArrayList<Book>();   
    
    public CreateBookBean(){
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
   public void createNew(){
   book=new Book();
   }

    public Book getBook() {  
        return book;  
    }  
  
    public void setBook(Book book) {  
        this.book = book;  
    }  
  
    public List<Book> getBooks() {  
        return books;  
    }  
  

    /*
    public String prepararAlumno(){
    book=new Book();
    return "Alumno preparado"+cont;
    }*/
    
    public void añadirAlumno(){
        
        /*capturar datos*/
        
        /*agregar al array*/
        books.add(this.book);
        
        /*
        cont++;
        books.add(new Book("fgs", "sdfas", "sdf",cont));
        cont++;
        books.add(new Book("wer", "sdfas", "sdf",cont));
        cont++;
        books.add(new Book("frgs", "sdfas", "sdf",cont));
        cont++;
        books.add(new Book("wre", "sdfas", "sdf",cont));*/
        
        /*
   cont++;
   book.setNum(cont);
        books.add(book);*/
    }
    public void agregarotro(){
    
    
    /*public void onEdit(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Car Edited", ((Book) event.getObject()).getTitle());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
      
    public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Car Cancelled", ((Book) event.getObject()).getTitle());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  */
}     }
     

