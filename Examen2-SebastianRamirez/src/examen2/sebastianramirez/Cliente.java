package examen2.sebastianramirez;

import java.util.Date;

public class Cliente extends Usuarios {
    private int NumCuenta,saldo;

    public Cliente(int NumCuenta, int saldo, int ID, String primer_nombre, String segundo_nombre, String primer_apellido, String contraseña, String segundo_apellido, Date año_de_nacimiento, Date año_de_afiliación) {
        super(ID, primer_nombre, segundo_nombre, primer_apellido, contraseña, segundo_apellido, año_de_nacimiento, año_de_afiliación);
        this.NumCuenta = NumCuenta;
        this.saldo = saldo;
    }

}
