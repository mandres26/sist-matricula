/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas.controles;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;


import tablas.dominio.Car;
/**
 *
 * @author luisivan
 */
@ManagedBean
@SessionScoped
public class rowEditBean implements Serializable {

    private List<Car> carsSmall= new ArrayList<Car>();;


	public rowEditBean() {
		

		populateRandomCars(carsSmall, 9);
	}

	private void populateRandomCars(List<Car> list, int size) {
       list.add(new Car("modelo1", 1, "manufactura1", "color1"));  
       list.add(new Car("modelo2", 2, "manufactura2", "color2"));  
       list.add(new Car("modelo3", 3, "manufactura3", "color3"));  
       list.add(new Car("modelo4", 4, "manufactura4", "color4"));  
       list.add(new Car("modelo5", 5, "manufactura5", "color5"));  
       list.add(new Car("modelo1", 1, "manufactura1", "color1"));  
       list.add(new Car("modelo2", 2, "manufactura2", "color2"));  
       list.add(new Car("modelo3", 3, "manufactura3", "color3"));  
       list.add(new Car("modelo4", 4, "manufactura4", "color4"));  
       list.add(new Car("modelo5", 5, "manufactura5", "color5"));  
       list.add(new Car("modelo1", 1, "manufactura1", "color1"));  
       list.add(new Car("modelo2", 2, "manufactura2", "color2"));  
       list.add(new Car("modelo3", 3, "manufactura3", "color3"));  
       list.add(new Car("modelo4", 4, "manufactura4", "color4"));  
       list.add(new Car("modelo5", 5, "manufactura5", "color5"));  
      
	}

	public List<Car> getCarsSmall() {
		return carsSmall;
	}

  

  
    public void onEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Car Edited", ((Car) event.getObject()).getModel());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Car Cancelled", ((Car) event.getObject()).getModel());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
				

