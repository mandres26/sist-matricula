
package control;

import dao.AlumnoDao;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import modelo.Alumno;


@ManagedBean
@SessionScoped
public class AlumnoControl {

    private Alumno alumno;
    private DataModel listaAlumnos;

    
    
    public DataModel getListarAlumnos() {
        List<Alumno> lista = AlumnoDao.listarAlumnos();
        listaAlumnos = new ListDataModel(lista);
        return listaAlumnos;
    }
 

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public DataModel getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(DataModel listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
  
    public void prepararAdicionarAlumno(){
    alumno = new Alumno();
    //año- 1900
    //mes-1
    //dia
    
 
    }

  public String adicionarAlumno(){
     
        
        AlumnoDao.save(alumno);
        return "RegistrarAlumno";
    }
}