package examen2.sebastianramirez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Administrador implements Serializable {
    ArrayList<ATM>atm = new ArrayList();
    private File archivo = new File("./ATM");

    public void setAtm(ATM atm) {
        this.atm.add(atm);
    }

    public ArrayList<ATM> getAtm() {
        return atm;
    }
    
    public void cargarArchivo(){
        try{
            atm = new ArrayList();
            ATM temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (ATM)objeto.readObject())!=null) {
                        atm.add(temp);
                    }
                }catch (EOFException ex) {
                    
                }
                objeto.close();
                entrada.close();
            }
        }catch (Exception ex) {
             ex.printStackTrace();
        }
    }
    public void escribirArchivo(){
       FileOutputStream fw = null;
       ObjectOutputStream bw = null;
       try{
           fw = new FileOutputStream(archivo);
           bw = new ObjectOutputStream(fw);
           for (ATM t : atm) {
               bw.writeObject(t);
            }
           bw.flush();
       }catch (Exception ex) {
           
       }finally{
           try {
               bw.close();
               fw.close();
           }catch (Exception ex) {
               
           }
       }
   }
}
