package modelo;
// Generated 15/11/2013 12:12:37 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Profesor generated by hbm2java
 */
public class Profesor  implements java.io.Serializable {


     private int idProfesor;
     private String nombres;
     private String apePaterno;
     private String apeMaterno;
     private Date fecNacimiento;
     private Character sexo;
     private Integer dni;
     private String email;
     private String edad;
     private String numFijo;
     private String numMovil;
     private String domicilio;
     private String gradEstudios;
     private Set<Grupo> grupos = new HashSet<Grupo>(0);

    public Profesor() {
    }

	
    public Profesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    public Profesor(int idProfesor, String nombres, String apePaterno, String apeMaterno, Date fecNacimiento, Character sexo, Integer dni, String email, String edad, String numFijo, String numMovil, String domicilio, String gradEstudios, Set<Grupo> grupos) {
       this.idProfesor = idProfesor;
       this.nombres = nombres;
       this.apePaterno = apePaterno;
       this.apeMaterno = apeMaterno;
       this.fecNacimiento = fecNacimiento;
       this.sexo = sexo;
       this.dni = dni;
       this.email = email;
       this.edad = edad;
       this.numFijo = numFijo;
       this.numMovil = numMovil;
       this.domicilio = domicilio;
       this.gradEstudios = gradEstudios;
       this.grupos = grupos;
    }
   
    public int getIdProfesor() {
        return this.idProfesor;
    }
    
    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApePaterno() {
        return this.apePaterno;
    }
    
    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }
    public String getApeMaterno() {
        return this.apeMaterno;
    }
    
    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }
    public Date getFecNacimiento() {
        return this.fecNacimiento;
    }
    
    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }
    public Character getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public Integer getDni() {
        return this.dni;
    }
    
    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEdad() {
        return this.edad;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getNumFijo() {
        return this.numFijo;
    }
    
    public void setNumFijo(String numFijo) {
        this.numFijo = numFijo;
    }
    public String getNumMovil() {
        return this.numMovil;
    }
    
    public void setNumMovil(String numMovil) {
        this.numMovil = numMovil;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getGradEstudios() {
        return this.gradEstudios;
    }
    
    public void setGradEstudios(String gradEstudios) {
        this.gradEstudios = gradEstudios;
    }
    public Set<Grupo> getGrupos() {
        return this.grupos;
    }
    
    public void setGrupos(Set<Grupo> grupos) {
        this.grupos = grupos;
    }




}


