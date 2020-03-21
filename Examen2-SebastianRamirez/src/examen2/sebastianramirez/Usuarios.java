package examen2.sebastianramirez;

import java.io.Serializable;
import java.util.Date;

public class Usuarios implements Serializable{
    private String primer_nombre , segundo_nombre , primer_apellido ,contraseña ,segundo_apellido; 
    private Date año_de_nacimiento , año_de_afiliación;
    private int ID;
    private Transacciones t;
    private static final long SerialVersionUID =777L;
    public Usuarios(int ID, String primer_nombre, String segundo_nombre, String primer_apellido, String contraseña, String segundo_apellido, Date año_de_nacimiento, Date año_de_afiliación) {
        this.ID = ID;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.contraseña = contraseña;
        this.segundo_apellido = segundo_apellido;
        this.año_de_nacimiento = año_de_nacimiento;
        this.año_de_afiliación = año_de_afiliación;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public Date getAño_de_nacimiento() {
        return año_de_nacimiento;
    }

    public void setAño_de_nacimiento(Date año_de_nacimiento) {
        this.año_de_nacimiento = año_de_nacimiento;
    }

    public Date getAño_de_afiliación() {
        return año_de_afiliación;
    }

    public void setAño_de_afiliación(Date año_de_afiliación) {
        this.año_de_afiliación = año_de_afiliación;
    }

    public Transacciones getT() {
        return t;
    }

    public void setT(Transacciones t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return ID + " " + primer_nombre + " " + primer_apellido;
    }
    
}
