/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenisclasico;

import javax.swing.JFrame;

/**
 *
 * @author jaimem
 */
public class Ventana extends JFrame {

    Tablero canvas;
    Pelota p = new Pelota();

    public Ventana() {
        setTitle("Pong DEMO");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero();
        add(canvas);

        addKeyListener(new EventoTeclado());
        new Graphics(canvas).start();
    }

}

