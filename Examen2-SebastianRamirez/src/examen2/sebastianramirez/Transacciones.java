package examen2.sebastianramirez;

import java.util.Date;

public class Transacciones {
    private String numero_de_cuenta, descripción,ID;
    private Date fecha,hora;

    public Transacciones(String numero_de_cuenta, String descripción, String ID, Date fecha, Date hora) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.descripción = descripción;
        this.ID = ID;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(String numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Transacciones{" + "numero_de_cuenta=" + numero_de_cuenta + ", descripci\u00f3n=" + descripción + ", ID=" + ID + ", hora=" + hora + '}';
    }
    
}
