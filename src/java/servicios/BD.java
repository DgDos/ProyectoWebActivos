/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dato.Activo;
import dato.Prestamo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Isabel-Fabian
 */
public class BD implements Serializable{
    private ArrayList<Activo> activos;
    private ArrayList<Prestamo> prestamos;

    public BD() {
        this.activos = new ArrayList<Activo>();
        this.prestamos = new ArrayList<Prestamo>();
    }
    
    public boolean updatePrestamo(int id, int cantidad){
        boolean resultado = false;
        int posicion =0;
        for (Prestamo prestamo : this.prestamos) {
            if(prestamo.getId() == id){
               this.prestamos.get(posicion).setCantidad(cantidad);
               return true;
            }
            posicion++;
        }
        return resultado;
    }
    
    public boolean deletePrestamo(int id){
        boolean resultado = false;
        for (int i = 0; i < this.prestamos.size(); i++) {
           if (this.prestamos.get(i).getId() == id){
             this.prestamos.remove(i);
             resultado = true;
           }
        }
        return resultado;
    }
    public Prestamo readPrestamo(int id ){
        Prestamo resultado = null;
        for (Prestamo prestamo : this.prestamos) {
            if(prestamo.getId() == id)
                resultado = prestamo;
        }
        return resultado;
    }
    
    public void addActivo(Activo activo){
       this.activos.add(activo);
    }
    
    public void addPrestamo(Prestamo prestamo){
      this.prestamos.add(prestamo);
    }

    public ArrayList<Activo> getActivos() {
        return activos;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
    
    
}
