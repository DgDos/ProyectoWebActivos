/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato;

import java.io.Serializable;

/**
 *
 * @author Isabel-Fabian
 */
public class Prestamo implements Serializable{
    private int id;
    private Activo activo;
    private int cantidad;

    public Prestamo(Activo activo, int cantidad, int id) {
        this.activo = activo;
        this.cantidad = cantidad;
        this.id = id;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
