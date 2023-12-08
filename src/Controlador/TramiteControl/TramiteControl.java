/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.TramiteControl;

import Controlador.Dao.DaoImplement;
import Controlador.Listas.DynamicList;

import Modelo.TipoTramite;
import java.util.Random;

/**
 *
 * @author ALEJANDRO
 */
public class TramiteControl extends DaoImplement<TipoTramite> {
     private DynamicList<TipoTramite>listR=new DynamicList<>();
     private TipoTramite tramite;
     
     public TramiteControl(){
         super(TipoTramite.class);
     }
    public DynamicList<TipoTramite> getListR() {
        listR=all();
        return listR;
    }

    public void setListR(DynamicList<TipoTramite> listR) {
        this.listR = listR;
    }

    public TipoTramite getTramite() {
        if(tramite==null)
            tramite=new TipoTramite();
            return tramite;
        
        
    }


    public void setTramite(TipoTramite tramite) {
        this.tramite = tramite;
    }
    public Boolean persit(){
        tramite.setId(all().getLength()+1);
        
        return persist(tramite);
    }
    public static void main(String[]args){
        TramiteControl tr=new TramiteControl();
        System.out.println(tr.all());
        tr.getTramite().setNombre("Cambio clave");
        tr.getTramite().setDuracion(4);
        tr.persit();
        tr.setTramite(null);
        tr.getTramite().setNombre("Actualizacion datos");
        tr.getTramite().setDuracion(7);
        tr.persit();
        tr.setTramite(null);
         tr.getTramite().setNombre("Asignacion Afiliados");
        tr.getTramite().setDuracion(15);
        tr.persit();
        tr.setTramite(null);
         tr.getTramite().setNombre("Recuperacion clave");
        tr.getTramite().setDuracion(3);
        tr.persit();
        tr.setTramite(null);
    }
}
