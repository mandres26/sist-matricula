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
import tablas.dominio.Car;

/**
 *
 * @author luisivan
 */
@ManagedBean
@SessionScoped
public class colledBean implements Serializable {
private Book book=new Book();
private Book booke=new Book();
    
   private static List<Book> books=new ArrayList<Book>();   

    public Book getBooke() {
        return booke;
    }

    public void setBooke(Book booke) {
        this.booke = booke;
    }


    
   public void createNew(){
   book=new Book();
   }

    public Book getBook() {
       // System.out.print("get book colledBean: "+book);
        return book;  
    }  
  
    public void setBook(Book book) {  
        this.book = book;  
    }  
  
    public List<Book> getBooks() {  
        return books;  
    }  
  
    public void prepararBook(){
    book=new Book();
    }
    
  
    public void onEdit(RowEditEvent event) {  
     
        FacesMessage msg = new FacesMessage("Car Edited", ((Book) event.getObject()).getTitle());

        FacesContext.getCurrentInstance().addMessage(null, msg);
       

    }  
      
    public void onCancel(RowEditEvent event) {  
       FacesMessage msg = new FacesMessage("Car Cancelled", ((Book) event.getObject()).getTitle());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }  
}
