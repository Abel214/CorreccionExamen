/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Util;

import Modelo.Simulacion;
import Modelo.TipoTramite;
import javax.swing.JComboBox;

/**
 *
 * @author ALEJANDRO
 */
public class UtilVista {
    public static void CargarVentanillaL(JComboBox cbx)throws Exception{
        Controlador.TramiteControl.TramiteControl rc= new  Controlador.TramiteControl.TramiteControl();
        cbx.removeAllItems();
         for (int i = 0; i < rc.getListR().getLength(); i++) {
            cbx.addItem(rc.getListR().getInfo(i));
        }
    }
    
    public static String ObtenerVentanilla(JComboBox cbx){
        return (String)cbx.getSelectedItem();
    }
}
