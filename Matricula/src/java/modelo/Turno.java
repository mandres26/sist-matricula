package modelo;
// Generated 15/11/2013 12:12:37 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Turno generated by hbm2java
 */
public class Turno  implements java.io.Serializable {


     private int idTurno;
     private String detalleTurno;
     private Date horaInicio;
     private Date horaTermino;
     private Set<Grupo> grupos = new HashSet<Grupo>(0);

    public Turno() {
    }

	
    public Turno(int idTurno) {
        this.idTurno = idTurno;
    }
    public Turno(int idTurno, String detalleTurno, Date horaInicio, Date horaTermino, Set<Grupo> grupos) {
       this.idTurno = idTurno;
       this.detalleTurno = detalleTurno;
       this.horaInicio = horaInicio;
       this.horaTermino = horaTermino;
       this.grupos = grupos;
    }
   
    public int getIdTurno() {
        return this.idTurno;
    }
    
    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }
    public String getDetalleTurno() {
        return this.detalleTurno;
    }
    
    public void setDetalleTurno(String detalleTurno) {
        this.detalleTurno = detalleTurno;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraTermino() {
        return this.horaTermino;
    }
    
    public void setHoraTermino(Date horaTermino) {
        this.horaTermino = horaTermino;
    }
    public Set<Grupo> getGrupos() {
        return this.grupos;
    }
    
    public void setGrupos(Set<Grupo> grupos) {
        this.grupos = grupos;
    }




}


