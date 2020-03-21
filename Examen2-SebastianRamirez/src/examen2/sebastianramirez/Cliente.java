package examen2.sebastianramirez;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Usuarios implements Serializable{
    private int NumCuenta,saldo,id_propia;
    String contraseña;

    public Cliente(int NumCuenta, int saldo, int ID, String primer_nombre, String segundo_nombre, String primer_apellido, String contraseña, String segundo_apellido, Date año_de_nacimiento, Date año_de_afiliación) {
        super(ID, primer_nombre, segundo_nombre, primer_apellido, contraseña, segundo_apellido, año_de_nacimiento, año_de_afiliación);
        this.contraseña = contraseña;
        id_propia = ID;
        this.NumCuenta = NumCuenta;
        this.saldo = saldo;
    }

    public int getID() {
        return id_propia;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
