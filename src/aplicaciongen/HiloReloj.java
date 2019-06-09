/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import java.awt.Color;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaimem
 */
public class HiloReloj extends Thread {

    ClockLabel dateLable;
    ClockLabel timeLable;
    ClockLabel dayLable;

    public HiloReloj() {
        dateLable = new ClockLabel("date");
        timeLable = new ClockLabel("time");
        dayLable = new ClockLabel("day");
        Main.jPanel6.setSize(600, 100);
        Main.jPanel6.add(dateLable);
        Main.jPanel6.add(timeLable);
        Main.jPanel6.add(dayLable);
        Main.jPanel6.setBackground(Color.black);
       // Main.jPanel6.setOpaque(false);
        Main.jPanel6.setVisible(true);
    }

    public void run() {

        while (true) {
            dateLable.setValue();
            timeLable.setValue();
            dayLable.setValue();
            Main.jPanel6.revalidate();
            Main.jPanel6.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloReloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
