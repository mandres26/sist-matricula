/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author PEDRO
 */
public class FilmHelper {
     Session session = null;

    public FilmHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
        
    public List getFilmTitles(int startID, int endID) {
    List<ResolucionDirectoral> filmList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from ResolucionDirectoral as ResolucionDirectoral where ResolucionDirectoral.id between '"+startID+"' and '"+endID+"'");
        filmList = (List<ResolucionDirectoral>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return filmList;
}
}
