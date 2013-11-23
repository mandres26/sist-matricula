/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Alumno;
import modelo.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luisivan
 */
public class AlumnoDao {

   public  static void save(Alumno alumnoForm) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(alumnoForm);
        t.commit();       
    }
    
 public static List<Alumno> listarAlumnos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Alumno").list();
        t.commit();
        return lista;
    }    
    
}
