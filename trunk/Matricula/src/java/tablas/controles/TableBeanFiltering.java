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
import javax.faces.model.SelectItem;
import tablas.dominio.Car;
/**
 *
 * @author luisivan
 */
@ManagedBean
@RequestScoped
public class TableBeanFiltering implements Serializable {  
  
    
    private final static String[] colors;  
  
    private final static String[] manufacturers;  
  
    private SelectItem[] manufacturerOptions;  
  
    private List<Car> carsSmall;  
  
    private List<Car>  filteredCars;
    
    private Car selectedCar;  
    static {  
        colors = new String[10];  
        colors[0] = "Black";  
        colors[1] = "White";  
        colors[2] = "Green";  
        colors[3] = "Red";  
        colors[4] = "Blue";  
        colors[5] = "Orange";  
        colors[6] = "Silver";  
        colors[7] = "Yellow";  
        colors[8] = "Brown";  
        colors[9] = "Maroon";  
  
        manufacturers = new String[10];  
        manufacturers[0] = "Mercedes";  
        manufacturers[1] = "BMW";  
        manufacturers[2] = "Volvo";  
        manufacturers[3] = "Audi";  
        manufacturers[4] = "Renault";  
        manufacturers[5] = "Opel";  
        manufacturers[6] = "Volkswagen";  
        manufacturers[7] = "Chrysler";  
        manufacturers[8] = "Ferrari";  
        manufacturers[9] = "Ford";  
    }  
  
    public TableBeanFiltering() {  
        if(carsSmall==null)
        {
        carsSmall = new ArrayList<Car>();  
  
        populateRandomCars(carsSmall, 9);  
        manufacturerOptions = createFilterOptions(manufacturers);  
        
        }  }
  
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
       
        list.add(new Car("modelo1", 1, "manufactura1", "color1"));  
       list.add(new Car("modelo2", 2, "manufactura2", "color2"));  
       list.add(new Car("modelo3", 3, "manufactura3", "color3"));  
       list.add(new Car("modelo4", 4, "manufactura4", "color4"));  
       list.add(new Car("modelo5", 5, "manufactura5", "color5"));  
       
    }  
  
    public List<Car> getCarsSmall() {  
        return carsSmall;  
    }  
  
    private int getRandomYear() {  
        return (int) (Math.random() * 50 + 1960);  
    }  
  
    private String getRandomColor() {  
        return colors[(int) (Math.random() * 10)];  
    }  
  
    private String getRandomManufacturer() {  
        return manufacturers[(int) (Math.random() * 10)];  
    }  
  
    private String getRandomModel() {  
        return UUID.randomUUID().toString().substring(0, 8);  
    }  
  
    private SelectItem[] createFilterOptions(String[] data)  {  
        SelectItem[] options = new SelectItem[data.length + 1];  
  
        options[0] = new SelectItem("", "Select");  
        for(int i = 0; i < data.length; i++) {  
            options[i + 1] = new SelectItem(data[i], data[i]);  
        }  
  
        return options;  
    } 
  
    public SelectItem[] getManufacturerOptions() {  
        return manufacturerOptions;  
    }  

    public static String[] getColors() {
        return colors;
    }

    public static String[] getManufacturers() {
        return manufacturers;
    }

    public void setManufacturerOptions(SelectItem[] manufacturerOptions) {
        this.manufacturerOptions = manufacturerOptions;
    }

    public void setCarsSmall(List<Car> carsSmall) {
        this.carsSmall = carsSmall;
    }

    public List<Car> getFilteredCars() {
        return filteredCars;
    }

    public void setFilteredCars(List<Car> filteredCars) {
        this.filteredCars = filteredCars;
    }
    
    public void prepararTabla(){
    
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
    
}
