package Vista.Tabla;

import Controlador.Listas.DynamicList;
import Modelo.TipoTramite;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaTramite extends AbstractTableModel {
    
    private DynamicList<TipoTramite> tramites;

    public DynamicList<TipoTramite> getTramites() {
        return tramites;
    }

    public void setTramites(DynamicList<TipoTramite> tramites) {
        this.tramites = tramites;
    }
    
    
    
    public ModeloTablaTramite() {
        this.tramites = new DynamicList<>();
    }

    @Override
    public int getRowCount() {
        return tramites.getLength();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getValueAt(int i, int i1) {
        try {
            TipoTramite p = tramites.getInfo(i);

            switch (i1) {
                case 0:
                    return (p != null) ? p.getNombre() : " ";
                case 1:
                    return (p != null) ? String.valueOf(p.getDuracion()): " ";
                default:
                    return null;
            }
        } catch (Exception e) {
            e.toString();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Proceso";
            case 1:
                return "Duracion";
            default:
                return null;
        }
    }
  
}
