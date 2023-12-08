/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.SimulacionControl;

import Controlador.Dao.DaoImplement;
import Controlador.Listas.DynamicList;
import Modelo.Simulacion;

/**
 *
 * @author ALEJANDRO
 */
public class SimulacionControl extends DaoImplement<Simulacion> {
      private DynamicList<Simulacion> simulacion;
    private Simulacion simulacion1;
     public SimulacionControl() {
        super(Simulacion.class);
    }

    public DynamicList<Simulacion> getSimulacion() {
        simulacion=all();
        return simulacion;
    }

    public void setSimulacion(DynamicList<Simulacion> tipos) {
        this.simulacion = tipos;
    }

    public Simulacion getSimulacion1() {
        if (simulacion1 == null) {
            simulacion1 = new Simulacion();
        }
        return simulacion1;
    }

    public void setSimulacion1(Simulacion insiticuion1) {
        this.simulacion1 = insiticuion1;
    }

    public Boolean persist(){
        simulacion1.setId(all().getLength()+ 1);
        return persist(simulacion1);
    }
}
