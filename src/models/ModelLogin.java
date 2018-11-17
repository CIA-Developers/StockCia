/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.*;
import views.*;
/**
 *
 * @author Octaviano
 */
public class ModelLogin {
    public void muenuAdmin(){
        ModelClientes modelClientes = new ModelClientes();
        ViewClientes viewClientes = new ViewClientes();
        ControllerClientes controllerClientes = new ControllerClientes(modelClientes, viewClientes);

        ModelEmpleadosCompras modelEmpleadosCompras = new ModelEmpleadosCompras();
        ViewEmpleadosCompras viewEmpleadosCompras = new ViewEmpleadosCompras();
        ControllerEmpleadosCompras controllerEmpleadosCompras = new ControllerEmpleadosCompras(modelEmpleadosCompras, viewEmpleadosCompras);

        ModelEmpleadosVentas modelEmpleadosVentas = new ModelEmpleadosVentas();
        ViewEmpleadosVentas viewEmpleadosVentas = new ViewEmpleadosVentas();
        ControllerEmpleadosVentas controllerEmpleadosVentas = new ControllerEmpleadosVentas(modelEmpleadosVentas, viewEmpleadosVentas);

        ModelProductos modelProductos = new ModelProductos();
        ViewProductos viewProductos = new ViewProductos();
        ControllerProductos controllerProductos = new ControllerProductos(modelProductos, viewProductos);

        ModelProveedores modelProveedores = new ModelProveedores();
        ViewProveedores viewProveedores = new ViewProveedores();
        ControllerProveedores controllerProveedores = new ControllerProveedores(modelProveedores, viewProveedores);

        ModelSucursales modelSucursales = new ModelSucursales();
        ViewSucursales viewSucursales = new ViewSucursales();
        ControllerSucursales controllerSucursales = new ControllerSucursales(modelSucursales, viewSucursales);

        ModelAgregarSucursal modelAgregarSucursal = new ModelAgregarSucursal();
        ViewAgregarSucursal viewAgregarSucursal = new ViewAgregarSucursal();
        ControllerAgregarSucursal controllerAgregarSucursal = new ControllerAgregarSucursal(modelAgregarSucursal, viewAgregarSucursal);

        ModelDetalleCompras modelDetalleCompras = new ModelDetalleCompras();
        ViewDetalleCompra viewDetalleCompra = new ViewDetalleCompra();
        ControllerDetalleCompra controllerDetalleCompra = new ControllerDetalleCompra(modelDetalleCompras, viewDetalleCompra);

        ModelDetalleVentas modelDetalleVentas = new ModelDetalleVentas();
        ViewDetalleVentas viewDetalleVentas = new ViewDetalleVentas();
        ControllerDetalleVentas controllerDetalleVenta = new ControllerDetalleVentas(modelDetalleVentas, viewDetalleVentas);

        Object[] controllers = new Object[9];
        controllers[0] = controllerClientes;
        controllers[1] = controllerEmpleadosCompras;
        controllers[2] = controllerEmpleadosVentas;
        controllers[3] = controllerProductos;
        controllers[4] = controllerProveedores;
        controllers[5] = controllerSucursales;
        controllers[6] = controllerAgregarSucursal;
        controllers[7] = controllerDetalleCompra;
        controllers[8] = controllerDetalleVenta;

        ModelMenuAdmin modelMenuAdmin = new ModelMenuAdmin();
        ViewMenuAdmin viewMenuAdmin = new ViewMenuAdmin();
        ControllerMenuAdmin controllerMenuAdmin = new ControllerMenuAdmin(modelMenuAdmin, viewMenuAdmin, controllers);
    }
    public void EmpleadosCompras(){
        ModelClientesEmpleados modelClientesEmpleados = new ModelClientesEmpleados();
        ViewClientesEmpleados viewClientesEmpleados = new ViewClientesEmpleados();
        ControllerClientesEmpleados controllerClientesEmpleados = new ControllerClientesEmpleados(modelClientesEmpleados, viewClientesEmpleados);
        
        ModelProductosEmpleados modelProductosEmpleados = new ModelProductosEmpleados();
        ViewProductosEmpleados viewProductosEmpleados = new ViewProductosEmpleados();
        ControllerProductosEmpleados controllerProductosEmpleados = new ControllerProductosEmpleados(modelProductosEmpleados, viewProductosEmpleados);
        
        ModelProveedoresEmpleados modelProveedoresEmpleados = new ModelProveedoresEmpleados();
        ViewProveedoresEmpleados viewProveedoresEmpleados = new ViewProveedoresEmpleados();
        ControllerProveedoresEmpleados controllerProveedoresEmpleados = new ControllerProveedoresEmpleados(modelProveedoresEmpleados, viewProveedoresEmpleados);
        
        ModelSucursalesEmpleados modelSucursalesEmpleados  = new ModelSucursalesEmpleados ();
        ViewSucursalesEmpleados  viewSucursalesEmpleados = new ViewSucursalesEmpleados ();
        ControllerSucursalesEmpleados controllerSucursalesEmpleados  = new ControllerSucursalesEmpleados (modelSucursalesEmpleados , viewSucursalesEmpleados );
        
        ModelCOMPRAS modelCOMPRAS = new ModelCOMPRAS();
        ViewCOMPRAS viewCOMPRAS = new ViewCOMPRAS();
        ControllerCOMPRAS controllerCOMPRAS = new ControllerCOMPRAS(modelCOMPRAS,viewCOMPRAS);
        
        Object[] controllers = new Object[6];
        controllers[0] = controllerClientesEmpleados;
        controllers[1] = controllerProductosEmpleados;
        controllers[2] = controllerProveedoresEmpleados;
        controllers[3] = controllerSucursalesEmpleados;
        controllers[4] = controllerCOMPRAS;
        
        ModelMenuEmpleadoCompras modelMenuEmpleadoCompras = new ModelMenuEmpleadoCompras ();
        viewMenuEmpleadoCompras ViewMenuEmpleadoCompras = new viewMenuEmpleadoCompras();
        ControllerMenuEmpleadoCompras controllerMenuEmpleadoCompras = new ControllerMenuEmpleadoCompras(modelMenuEmpleadoCompras,ViewMenuEmpleadoCompras,controllers);
        
    }
}
