/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenisclasico;

/**
 *
 * @author jaimem
 */
public class Graphics  extends Thread{
       public static int sleep = 12;
    private final Tablero canvas;

    public Graphics(Tablero canvas) {
        this.canvas = canvas;
    }

    @Override
    public void run() {
        while (!Pelota.finJuego) {
            canvas.repaint();
            try {
                //Paint Velocity 
                Thread.sleep(sleep);
            } catch (Exception ex) {
                System.out.println("error in graphics engine: " + ex.getMessage());
            }
        }
    }
}
