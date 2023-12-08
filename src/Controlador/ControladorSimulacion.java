/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.Listas.DynamicList;
import Modelo.Simulacion;


/**
 *
 * @author ALEJANDRO
 */
public class ControladorSimulacion {
    private Simulacion simulacion;
    private DynamicList< Simulacion> simulaciones;
     public ControladorSimulacion() {
        simulacion= new  Simulacion();
        this.simulaciones = new DynamicList<>();
    }

    public  Simulacion getSimulacion() {
        if(simulacion==null){
            simulacion=new  Simulacion();
        }
        return simulacion;
    }

    public void setSimulacion( Simulacion iess) {
        this.simulacion = iess;
    }

    public DynamicList< Simulacion> getSimulaciones() {
        return simulaciones;
    }

    public void setSimulaciones(DynamicList< Simulacion> institucion) {
        this.simulaciones = institucion;
    }

    //Mwtodo guardar
    public Boolean guardar(){
        simulacion.setId(generarId());
        simulaciones.add(simulacion);
        return true;
    }
    private Integer generarId(){
        return simulaciones.getLength()+1;
  }
    
   
    
     public void imprimir(){
        System.out.println(simulaciones.toString());
    }
    
}
