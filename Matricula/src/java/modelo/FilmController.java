/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author PEDRO
 */
@ManagedBean
@SessionScoped
public class FilmController {

    int startId;
    int endId;
    
    DataModel filmTitles;
    FilmHelper helper;
    /**
     * Creates a new instance of FilmController
     */
  public FilmController() {
        helper = new FilmHelper();
        startId = 1;
        endId = 2;
    }

   public FilmController(int startId, int endId) {
        helper = new FilmHelper();
        this.startId = startId;
        this.endId = endId;
    }
  
  public DataModel getFilmTitles() {
        if (filmTitles == null) {
            filmTitles = new ListDataModel(helper.getFilmTitles(startId, endId));
        }
        return filmTitles;
    }
  
}
