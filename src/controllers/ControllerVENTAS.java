/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.modelVENTAS;
import views.ViewVENTAS;
/**
 *
 * @author Octaviano
 */
public class ControllerVENTAS {
    modelVENTAS modelVENTAS;
    ViewVENTAS viewVENTAS;

    ActionListener list = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    };
    
    public ControllerVENTAS(modelVENTAS modelVENTAS, ViewVENTAS viewVENTAS) {
        this.modelVENTAS = modelVENTAS;
        this.viewVENTAS = viewVENTAS;
        
        modelVENTAS.Conectar();//Llamar a la conexion a la Base de datos 
        LimpiarCombox();
        LlenarCombox();
    }
    /**
     * agregar el evento de ActionListener a los ComboBox y a los botones de la vista Ventas
     */
    public void setActionListener(){
        
    }
    /**
     * Metodo que limpiara los ComboBox de la vista VENTAS
     */
    public void LimpiarCombox(){
       viewVENTAS.jcb_codigo_producto.removeAllItems();
       viewVENTAS.jcb_numero_sucursal.removeAllItems();
       viewVENTAS.jcb_rfc.removeAllItems();
       viewVENTAS.jcb_rfc_cliente.removeAllItems();
       viewVENTAS.jcb_codigo_descuento.removeAllItems();
    }
    /**
     * Metodo que realizara el llenado de los ComboBox con los datos corespondientes 
     * obtenidos de la base de datos 
     */
    public void LlenarCombox(){
        modelVENTAS.llenarCombo();//metodo en el modelo para llenar los comboBox
        for (int p = 0; p < modelVENTAS.getNumero_empleado().size(); p++) {
            viewVENTAS.jcb_rfc.addItem((String) modelVENTAS.getNumero_empleado().get(p));
        }
        for (int p = 0; p < modelVENTAS.getNumero_sucursal().size(); p++) {
            viewVENTAS.jcb_numero_sucursal.addItem((String) modelVENTAS.getNumero_sucursal().get(p));
        }
        for (int p = 0; p < modelVENTAS.getProducto().size(); p++) {
            viewVENTAS.jcb_codigo_producto.addItem((String) modelVENTAS.getProducto().get(p));
        }
        for (int p = 0; p < modelVENTAS.getNumero_cliente().size(); p++) {
            viewVENTAS.jcb_rfc_cliente.addItem((String) modelVENTAS.getNumero_cliente().get(p));
        }
        for (int p = 0; p < modelVENTAS.getDescuento_combo().size(); p++) {
            viewVENTAS.jcb_codigo_descuento.addItem((String) modelVENTAS.getDescuento_combo().get(p));
        }
    }
}
