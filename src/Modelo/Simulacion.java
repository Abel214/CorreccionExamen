/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Listas.Colas.QueueUltimate;
import Controlador.Listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class Simulacion extends TipoTramite {
    private Integer id;
    private Integer nro_personas;
    private Integer duracionTiempo;
    private TipoTramite tramite_id;
//    private DynamicList<QueueUltimate<TipoTramite>> ventanilla=new DynamicList<>();
 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoTramite getTramite_id() {
        return tramite_id;
    }

    public void setTramite_id(TipoTramite tramite_id) {
        this.tramite_id = tramite_id;
    }

    public Integer getNro_personas() {
        return nro_personas;
    }

    public void setNro_personas(Integer nro_personas) {
        this.nro_personas = nro_personas;
    }

    public Integer getDuracionTiempo() {
        return duracionTiempo;
    }

    public void setDuracionTiempo(Integer duracionTiempo) {
        this.duracionTiempo = duracionTiempo;
    }
    
   

//    public DynamicList<QueueUltimate<TipoTramite>> getVentanilla() {
//        return ventanilla;
//    }
//
//    public void setVentanilla(DynamicList<QueueUltimate<TipoTramite>> ventanilla) {
//        this.ventanilla = ventanilla;
//    }

    
    public Simulacion(Integer id, Integer nro_personas, Integer duracionTiempo, TipoTramite tramite_id){
        this.id = id;
        this.nro_personas = nro_personas;
        this.duracionTiempo = duracionTiempo;
        this.tramite_id = tramite_id;
        
    }

    public Simulacion() {
    }

    @Override
    public String toString() {
        return "Simulacion{" + "id=" + id + ", nro_personas=" + nro_personas + ", totalTiempo=" + duracionTiempo + '}';
    }
    
    
}
