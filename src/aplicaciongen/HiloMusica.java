/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import recursos.Audio;

/**
 *
 * @author jaimem
 */
public class HiloMusica extends Thread {

    AudioInputStream audioInputStream;

    public HiloMusica() {

    }

    public void run() {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(HiloMusica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HiloMusica.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Canciones");
    }

}
