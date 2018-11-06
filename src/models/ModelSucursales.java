/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import conectar_tablas.Database; //llamamos la conexion a la BD para almacen
import static conectar_tablas.Database.getConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Octaviano
 */
public class ModelSucursales {
    DefaultTableModel model;
    private Connection conexion;     
    private Statement st;     
    private ResultSet rs;
    PreparedStatement ps;
    
    /**
     * se hace la conexion a la Base de datos y se hace la consulta hacia la tabla de sucursales 
     * que tiene una union con la tabla de sucursales_productos 
     * y finalmente con la tabla de produtos para obtener el nombre del producto
     * que se tiene en cada sucursal 
     */
    public void Conectar(){
             try{ 
                conexion=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/stockcia","root","");                     
                st=conexion.createStatement(); 
                rs=st.executeQuery("SELECT sucursal.no_sucursal,productos.nom_producto, calle, colonia, numero, telefono,sucursal_productos.codigo_producto, existencias, limite_maximo, limite_minimo from sucursal inner join sucursal_productos on sucursal.no_sucursal = sucursal_productos.no_sucursal inner join productos on productos.codigo_producto = sucursal_productos.codigo_producto;");
                        
                rs.first();
                
            }catch(SQLException err){ 
                JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
            } 

    } 
       
}
