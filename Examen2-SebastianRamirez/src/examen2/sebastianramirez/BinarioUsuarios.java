package examen2.sebastianramirez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class BinarioUsuarios implements Serializable{
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Mantenimiento> mantenimiento = new ArrayList();
    File archivoClientes = new File("./Clientes.sr");
    File archivoMantenimiento = new File("./Mantenimiento.sr");

    public BinarioUsuarios() {
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cliente c) {
        this.clientes.add(c);
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Mantenimiento> getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento e) {
        this.mantenimiento.add(e);
    }

    
    public void cargarArchivoClientes(){
        try{
            clientes = new ArrayList();
            Cliente temp;
            if(archivoClientes.exists()){
                FileInputStream entrada = new FileInputStream(archivoClientes);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (Cliente)objeto.readObject())!=null) {
                        clientes.add(temp);
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
    public void cargarArchivoMantenimiento(){
        try{
            mantenimiento = new ArrayList();
            Mantenimiento temp;
            if(archivoMantenimiento.exists()){
                FileInputStream entrada = new FileInputStream(archivoMantenimiento);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (Mantenimiento)objeto.readObject())!=null) {
                        mantenimiento.add(temp);
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
           fw = new FileOutputStream(archivoClientes);
           bw = new ObjectOutputStream(fw);
           for (Cliente t : clientes) {
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
    public void escribirArchivoMantenimiento(){
       FileOutputStream fw = null;
       ObjectOutputStream bw = null;
       try{
           fw = new FileOutputStream(archivoMantenimiento);
           bw = new ObjectOutputStream(fw);
           for (Mantenimiento t : mantenimiento) {
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
