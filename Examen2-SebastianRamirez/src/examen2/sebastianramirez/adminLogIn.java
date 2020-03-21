package examen2.sebastianramirez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminLogIn {
    ArrayList log = new ArrayList();
    File archivo = new File("./Logs.sr");

    public ArrayList getLog() {
        return log;
    }

    public void setLog(ArrayList log) {
        this.log = log;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setLog(Object o){
        this.log.add(o);
    }
    
    public void cargarArchivo(){
        try{
            log = new ArrayList();
            Object temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = objeto.readObject())!=null) {
                        log.add(temp);
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
    public void escribirArchivoClientes(){
       FileOutputStream fw = null;
       ObjectOutputStream bw = null;
       try{
           fw = new FileOutputStream(archivo);
           bw = new ObjectOutputStream(fw);
           for (Object t : log) {
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
