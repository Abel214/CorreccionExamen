/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author ALEJANDRO
 */
public class TipoTramite {
    private Integer duracion;
    private Integer id;
    private String nombre;

    

    public TipoTramite( String nombre,Integer duracion,Integer id) {
        this.duracion = duracion;
        this.nombre = nombre;
        this.id=id;
    }
    public TipoTramite(){
        
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return   nombre;
    }
    
    
}
