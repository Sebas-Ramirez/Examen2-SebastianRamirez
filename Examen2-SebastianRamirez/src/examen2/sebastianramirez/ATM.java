package examen2.sebastianramirez;

import java.io.Serializable;
import java.util.Date;

public class ATM implements Serializable{
    private String ID;
    private int Año_Fabricacion,tiempo_mantenimiento;
    private static final long SerialVersionUID =777L;

    public ATM(String ID, int tiempo_mantenimiento, int Año_Fabricacion) {
        this.ID = ID;
        this.tiempo_mantenimiento = tiempo_mantenimiento;
        this.Año_Fabricacion = Año_Fabricacion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    
    @Override
    public String toString() {
        return ID;
    }
    
}
