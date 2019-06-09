/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jaimem
 */
public class JPanelFondo extends JPanel {

    Image background;
    Image icono;
    JFrame j;

    public JPanelFondo(String file, JFrame j) {
        this.j = j;
        try {
            background = ImageIO.read(getClass().getResource(file));
            icono = ImageIO.read(getClass().getResource("/iconos/logoLibertad.png"));
        } catch (Exception ex) {
            Logger.getLogger(JPanelFondo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public JPanelFondo() {
    }

    @Override
    public void paintComponent(Graphics g2) {
        System.out.println("PAINT FONDO");
        int width = j.getWidth();
        int height = j.getHeight();
        super.paintComponent(g2);
        Graphics2D g = (Graphics2D) g2;
        g.drawImage(background, 0, 0, width, height, null);
        Color c = new Color(0, 0, 0, 180);
        g.setColor(c);
        g.fillRect(0, 0, width, height);
        g.setFont(new Font("Times new Roman", Font.BOLD, 45));
        g.setColor(Color.WHITE);
        g.drawString("Jucio del Proces", width / 3, 90);
        g.fillRect(0, 100, width, 1);
        g.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.CENTER_BASELINE, 22));
        g.drawString("El informe de la Fiscalía sobre el 1-O:En Cataluña hubo un golpe de Estado", width / 8, 155);
        g.fillRect(50, 165, j.getWidth() - 100, 1);
        Font f = new Font("Dialog", Font.PLAIN, 16);
        FontMetrics metrics = g.getFontMetrics(f);
        int x = 75 + (width - metrics.stringWidth(Metodos.juicio)) / 2;
        int y = 225;
        g.setFont(f);

        ArrayList<String> arr = Metodos.drawString();

        for (String s : arr) {
            g.drawString(s, 40, y);
            y += 40;
        }

        if (height > 800) {
            g.drawImage(icono, 150, height - 190, 475, 150, null);
            g.drawString("Fuente :", 50, height - 75);
        }

    }

}
