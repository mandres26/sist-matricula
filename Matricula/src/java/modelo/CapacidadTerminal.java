package modelo;
// Generated 15/11/2013 12:12:37 AM by Hibernate Tools 3.2.1.GA



/**
 * CapacidadTerminal generated by hbm2java
 */
public class CapacidadTerminal  implements java.io.Serializable {


     private int idCodigo;
     private Modulo modulo;
     private String nombreCt;
     private String notaCt;

    public CapacidadTerminal() {
    }

	
    public CapacidadTerminal(int idCodigo, Modulo modulo) {
        this.idCodigo = idCodigo;
        this.modulo = modulo;
    }
    public CapacidadTerminal(int idCodigo, Modulo modulo, String nombreCt, String notaCt) {
       this.idCodigo = idCodigo;
       this.modulo = modulo;
       this.nombreCt = nombreCt;
       this.notaCt = notaCt;
    }
   
    public int getIdCodigo() {
        return this.idCodigo;
    }
    
    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public String getNombreCt() {
        return this.nombreCt;
    }
    
    public void setNombreCt(String nombreCt) {
        this.nombreCt = nombreCt;
    }
    public String getNotaCt() {
        return this.notaCt;
    }
    
    public void setNotaCt(String notaCt) {
        this.notaCt = notaCt;
    }




}


