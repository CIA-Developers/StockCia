/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import models.ModelSucursales;
import views.ViewSucursales;

/**
 *
 * @author Octaviano
 */
public class ControllerSucursales {
    public ModelSucursales modelSucursales;
    public ViewSucursales viewSucursales;
    
    MouseListener ml = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
          if (e.getSource() == viewSucursales.jt_vista) {
                jt_vista_MouseClicked();
            }  
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }       
    };
   
    KeyListener key = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getSource() == viewSucursales.jtf_buscar) {
                modelSucursales.setTrsFiltro(new TableRowSorter(viewSucursales.jt_vista.getModel()));
                viewSucursales.jt_vista.setRowSorter(modelSucursales.getTrsFiltro());
            } 
        }

        @Override
        public void keyPressed(KeyEvent e) {
 
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getSource() == viewSucursales.jtf_buscar) {
                modelSucursales.setCadena(viewSucursales.jtf_buscar.getText());
                viewSucursales.jtf_buscar.setText(modelSucursales.getCadena());
                filtro();
            }    
        }    
    };
    
    public ControllerSucursales(ModelSucursales modelSucursales, ViewSucursales viewSucursales) {
        this.modelSucursales = modelSucursales;
        this.viewSucursales = viewSucursales;
        this.viewSucursales.jt_vista.addMouseListener(ml);//agregar a la table el evento de MouseListener
        this.viewSucursales.jtf_buscar.addKeyListener(key); //agregar elevento de keylistener en la tabla
        
       
        ConexionBD();
        cajas_deshabilitadas();
    }
    /**
     * este metodo hace la conexion a la base de datos 
     * llama a los metodos conectar, mostrar  dentro del modelo 
     * muestra en la tabla los datos que contiene la variable de modelo_sucursal
     */
    public void ConexionBD(){
        modelSucursales.Conectar();
        modelSucursales.mostrar();
        viewSucursales.jt_vista.setModel(modelSucursales.getModelo_sucursal()); //asignar a la tabla los valores correspondientes
    }
    public void jt_vista_MouseClicked(){
        cajas_deshabilitadas(); // cuando se haga clic en la tabla, las cajas se volveran a deshabilitar 
        modelSucursales.setRec(viewSucursales.jt_vista.getSelectedRow());//a la variable se le asigna el elemento seleccionado en la tabla
        viewSucursales.jtf_no_sucursal.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 0).toString());
        viewSucursales.jtf_calle.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 1).toString());
        viewSucursales.jtf_colonia.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 2).toString());
        viewSucursales.jtf_numero.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 3).toString());
        viewSucursales.jtf_telefono.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 4).toString());
        viewSucursales.jtf_codigo_prod.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 5).toString());
        viewSucursales.jtf_nom_prod.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 6).toString());
        viewSucursales.jtf_stock.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 7).toString());
        viewSucursales.jtf_stock_max.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 8).toString());
        viewSucursales.jtf_stock_min.setText(viewSucursales.jt_vista.getValueAt(modelSucursales.getRec(), 9).toString());  
    }
 // ********************************* M E T O D O   D E   B U S Q U E D A    *******************************************
    /***
     * Metodo para filtar los datos de la busqueda
     */
    public void filtro() {
        //depende del numero de items en el jcb
                
        if (viewSucursales.jcb_buscar.getSelectedItem() == "codigo producto") {
            modelSucursales.setColumnaABuscar(5); //numero de columna en la tabla donde se encuentra el registro
        }
        else if (viewSucursales.jcb_buscar.getSelectedItem() == "numero sucursal") {
            modelSucursales.setColumnaABuscar(0); //numero de columna en la tabla donde se encuentra el registro
        }
        modelSucursales.getTrsFiltro().setRowFilter(RowFilter.regexFilter(viewSucursales.jtf_buscar.getText(), modelSucursales.getColumnaABuscar()));
    }
  
    public void cajas_deshabilitadas(){
        viewSucursales.jtf_calle.setEditable(false);
        viewSucursales.jtf_colonia.setEditable(false);
        viewSucursales.jtf_numero.setEditable(false);
        viewSucursales.jtf_telefono.setEditable(false);
        viewSucursales.jtf_codigo_prod.setEditable(false);
        viewSucursales.jtf_nom_prod.setEditable(false);
        viewSucursales.jtf_stock.setEditable(false);
        viewSucursales.jtf_stock_max.setEditable(false);
        viewSucursales.jtf_stock_min.setEditable(false);
    }
    public void cajas_habilitadas(){
        viewSucursales.jtf_calle.setEditable(true);
        viewSucursales.jtf_colonia.setEditable(true);
        viewSucursales.jtf_numero.setEditable(true);
        viewSucursales.jtf_telefono.setEditable(true);
        viewSucursales.jtf_codigo_prod.setEditable(true);
        viewSucursales.jtf_nom_prod.setEditable(true);
        viewSucursales.jtf_stock.setEditable(true);
        viewSucursales.jtf_stock_max.setEditable(true);
        viewSucursales.jtf_stock_min.setEditable(true);
    }
    //***************** BOTONES Nuevo, Borrar, Guardar y Modificar**************************
    /**
     * Metodo que limpiara las cajas de texto para ingresar nuevo datos. 
     */
    public void nuevo_sucursales(){
       
        //limpiar cada caja de la Interfaz 
        viewSucursales.jtf_no_sucursal.setText(Integer.toString(modelSucursales.getCodigo()));// la caja de texto CODIGO_PRODUCTO recibe el valor de cero
        viewSucursales.jtf_calle.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_colonia.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_numero.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_telefono.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_codigo_prod.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_nom_prod.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_stock.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_stock_max.setText(modelSucursales.getLimpiar());
        viewSucursales.jtf_stock_min.setText(modelSucursales.getLimpiar());    
        cajas_habilitadas();//llamar al metodo de cajas habilitadas para proceder a escribir un nuevo registro 
    }
    
  
    
    public void modificar_sucursales(){
     
        viewSucursales.jtf_colonia.setEditable(true);
        viewSucursales.jtf_numero.setEditable(true);
        viewSucursales.jtf_telefono.setEditable(true);
        viewSucursales.jtf_codigo_prod.setEditable(true);
        viewSucursales.jtf_nom_prod.setEditable(true);
        viewSucursales.jtf_stock.setEditable(true);
        viewSucursales.jtf_stock_max.setEditable(true);
        viewSucursales.jtf_stock_min.setEditable(true);  
    }
    public void Guardar() {
        // si la variable verificar es igual a 0 se llama al metodo de guardar Nuevo
        if (modelSucursales.getVerificar() == 1) {
            // darle el valor a las variables
            modelSucursales.setSucursal(viewSucursales.jtf_no_sucursal.getText());
            modelSucursales.setCalle(viewSucursales.jtf_calle.getText());
            modelSucursales.setColonia(viewSucursales.jtf_colonia.getText());
            modelSucursales.setNumero(viewSucursales.jtf_numero.getText());
            modelSucursales.setTelefono(viewSucursales.jtf_telefono.getText());
            modelSucursales.setCodigo_producto(viewSucursales.jtf_codigo_prod.getText());
            modelSucursales.setNombre_producto(viewSucursales.jtf_nom_prod.getText());
            modelSucursales.setStock(viewSucursales.jtf_stock.getText());
            modelSucursales.setStock_maximo(viewSucursales.jtf_stock_max.getText());
            modelSucursales.setStrock_minimo(viewSucursales.jtf_stock_min.getText());
            modelSucursales.Guardar_Nuevo(); // metodo de  insertar nuevo registro           
        } else {
            // darle el valor a las variables
           modelSucursales.setSucursal(viewSucursales.jtf_no_sucursal.getText());
            modelSucursales.setCalle(viewSucursales.jtf_calle.getText());
            modelSucursales.setColonia(viewSucursales.jtf_colonia.getText());
            modelSucursales.setNumero(viewSucursales.jtf_numero.getText());
            modelSucursales.setTelefono(viewSucursales.jtf_telefono.getText());
            modelSucursales.setCodigo_producto(viewSucursales.jtf_codigo_prod.getText());
            modelSucursales.setNombre_producto(viewSucursales.jtf_nom_prod.getText());
            modelSucursales.setStock(viewSucursales.jtf_stock.getText());
            modelSucursales.setStock_maximo(viewSucursales.jtf_stock_max.getText());
            modelSucursales.setStrock_minimo(viewSucursales.jtf_stock_min.getText());
            modelSucursales.Guardar_Modificado();// metodo de  Modificar el registro
        }
        //LIMPIAR TABLA 
        for (int i = 0; i < viewSucursales.jt_vista.getRowCount(); i++) {
            modelSucursales.getModelo_sucursal().removeRow(i);
            i -= 1;
        }
        //mostrar los nuevos datos 
        modelSucursales.mostrar();
    }
}

