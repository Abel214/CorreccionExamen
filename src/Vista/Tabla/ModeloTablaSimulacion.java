/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Tabla;

import Controlador.Listas.DynamicList;
import Modelo.Simulacion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alejandro
 */
public class ModeloTablaSimulacion extends AbstractTableModel {

    private DynamicList<Simulacion> simulaciones;

    public DynamicList<Simulacion> getSimulaciones() {
        return simulaciones;
    }

    public void setSimulaciones(DynamicList<Simulacion> simulacion) {
        this.simulaciones = simulacion;
    }

    public ModeloTablaSimulacion() {
        this.simulaciones = new DynamicList<>();
    }

    @Override
    public int getRowCount() {
        return simulaciones.getLength();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getValueAt(int i, int i1) {
        try {
            Simulacion p = simulaciones.getInfo(i);

            switch (i1) {
                case 0:
                    return (p != null) ? p.getNombre() : " ";
                case 1:
                    return (p != null) ? String.valueOf(p.getDuracionTiempo()) : " ";
                case 2:
                    return (p != null) ? String.valueOf(p.getNro_personas()) : " ";
                default:
                    return null;
            }
        } catch (Exception e) {
            
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Tiempo";
            case 2:
                return "Personas";
            default:
                return null;
        }
    }
}
