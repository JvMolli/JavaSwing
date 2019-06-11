/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author jaimem
 */
abstract class ChartParent {

    final JFXPanel fxPanel = new JFXPanel();
    public JPanel jp;

    public ChartParent(JPanel jp) {
        this.jp = jp;
    }

    protected void initFX(JFXPanel fxPanel, Scene scene) {
        // This method is invoked on JavaFX thread
        jp.removeAll();
        fxPanel.setScene(scene);
        int width = (int) (jp.getWidth());
        fxPanel.setBounds(20, 50, width - 30, jp.getHeight() - 50);
        jp.add(fxPanel);
        jp.revalidate();
        jp.repaint();
    }

    protected XYChart.Series casosUltimoMes() {
        XYChart.Series contratos = new XYChart.Series();
        LinkedHashMap<String, Integer> crt = new LinkedHashMap<>();
        crt.put("Pepe Gonzalez", 8);
        crt.put("Sonia Aranda", 12);
        crt.put("Javier Perez", 3);
        int i = 0;
        for (Map.Entry<String, Integer> entry : crt.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            XYChart.Data data2 = new XYChart.Data(key, value);
            contratos.getData().add(data2);

        }

        return contratos;
    }
}
