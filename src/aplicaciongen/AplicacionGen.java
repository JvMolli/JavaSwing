/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jaimem
 */
public class AplicacionGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
//        try {
//  UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//        } catch (InstantiationException ex) {
//            Logger.getLogger(AplicacionGen.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(AplicacionGen.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(AplicacionGen.class.getName()).log(Level.SEVERE, null, ex);
//        }

        Log l = new Log();

        l.setVisible(true);
        l.setLocation(400, 200);
        l.setSize(400, 300);

    }

}
