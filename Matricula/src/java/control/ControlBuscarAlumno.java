/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AlumnoDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.UUID;  
import modelo.Alumno;
/**
 *
 * @author luisivan
 */
@ManagedBean
@RequestScoped
public class ControlBuscarAlumno {
    private List<Alumno> alumnos;    
    private List<Alumno>  alumnosFiltrados;
    private Alumno alumnoSeleccionado;
    
    public ControlBuscarAlumno(){
    alumnos=AlumnoDao.listarAlumnos();
    
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnosFiltrados() {
        return alumnosFiltrados;
    }

    public void setAlumnosFiltrados(List<Alumno> alumnosFiltrados) {
        this.alumnosFiltrados = alumnosFiltrados;
    }

    public Alumno getAlumnoSeleccionado() {
        return alumnoSeleccionado;
    }

    public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
        this.alumnoSeleccionado = alumnoSeleccionado;
    }
    
    
   
}
