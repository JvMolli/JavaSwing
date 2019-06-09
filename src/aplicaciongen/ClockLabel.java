/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author jaimem
 */
class ClockLabel extends JLabel {

    String type;
    public SimpleDateFormat sdf ;
    Timer t=null;
    public ClockLabel(String type) {
        this.type = type;
        setForeground(Color.green);
        System.err.println("Pepetter");
        switch (type) {
            case "date":
                sdf = new SimpleDateFormat("  MMMM dd yyyy");
                setFont(new Font("sans-serif", Font.PLAIN, 10));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "time":
                sdf = new SimpleDateFormat("hh:mm:ss a");
                setFont(new Font("sans-serif", Font.PLAIN, 30));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "day":
                sdf = new SimpleDateFormat("EEEE  ");
                setFont(new Font("sans-serif", Font.PLAIN, 14));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                sdf = new SimpleDateFormat();
                break;
        }
        Date d = new Date();
        setText(sdf.format(d));
        revalidate();
        repaint();
//        if(t==null){
//          t = new Timer(100, this);
//        }
//        
//        t.start();
    }

    public void setValue() {
        Date d = new Date();
        setText(sdf.format(d));
        revalidate();
        repaint();
    }
    


}
