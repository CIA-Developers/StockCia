/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.*;
import views.*;
import controllers.*;
/**
 *
 * @author Octaviano
 */
public class LOGIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ModelLogin modelLogin = new ModelLogin();
        ViewLogin viewLogin = new ViewLogin();
        ControllerLogin controllerLogin = new ControllerLogin(modelLogin,viewLogin/*,viewMenuAdmin*/ /*,controllersLogin*/);
        
      
        
    }
    
}
