/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import com.sun.javafx.charts.Legend;
import com.sun.javafx.charts.Legend.LegendItem;

import java.util.TreeMap;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jaimem
 */
public class BartChart extends ChartParent {

    //ArrayList<Llamada> llamadas = (ArrayList) Llamadas.LlamadasBBDDporGrupo();
    TreeMap<Integer, String[]> extTlf = new TreeMap<>();

    public BartChart(JPanel jp) {
        super(jp);
    }

    public void BarchartCasosTotales() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                final String title = "Sintesis";
                final CategoryAxis xAxis = new CategoryAxis();
                final NumberAxis yAxis = new NumberAxis();
                xAxis.setLabel("Casos");
                yAxis.setLabel("Numero");
                BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
                barChart.setTitle(title);
                Scene scene = new Scene(barChart, jp.getWidth(), jp.getHeight());
                XYChart.Series data = new XYChart.Series();
                data.getData().add(new XYChart.Data("totales", 385));
                data.getData().add(new XYChart.Data("Ganados", 305));
                data.getData().add(new XYChart.Data("Perdidos", 80));

                //XYChart.Series data3 = llamadasTotales();
                data.setName("Lista");

                barChart.getData().add(data);

                for (XYChart.Series<String, Number> series : barChart.getData()) {
                    if (series.getName().contains("Lista")) {
                        for (Data data2 : series.getData()) {
                            if (data2.toString().contains("totales")) {
                                data2.getNode().setStyle("-fx-bar-fill: navy;");
                            }
                            if (data2.toString().contains("Ganados")) {
                                data2.getNode().setStyle("-fx-bar-fill: green;");
                            }
                            if (data2.toString().contains("Perdidos")) {
                                data2.getNode().setStyle("-fx-bar-fill: red;");
                            }

                        }
                    }
                }

                //Used to change legend color
//                scene.getStylesheets().add(getClass().getResource("/styles/stylesLlamadasTotalesGrupos.css").toExternalFo‌​rm());

                initFX(fxPanel, scene);
            }
        });
    }

    public void PieChartLlamadas() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Stage stage = new Stage();
                Scene scene = new Scene(new Group());
                stage.setTitle("Tipos de casos");

                ObservableList<PieChart.Data> pieChartData
                        = FXCollections.observableArrayList(
                                new PieChart.Data("Penales", 13),
                                new PieChart.Data("Otros", 25),
                                new PieChart.Data("Extrangeria", 22),
                                new PieChart.Data("Trafico", 30));
                final PieChart chart = new PieChart(pieChartData);
                chart.setTitle("Casos");

                ((Group) scene.getRoot()).getChildren().add(chart);
                initFX(fxPanel, scene);

            }
        });

    }

    public void LineChart() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                CategoryAxis xAxis = new CategoryAxis();
                final NumberAxis yAxis = new NumberAxis();
                xAxis.setLabel("Number of Month");
                //creating the chart
                final LineChart<String, Number> lineChart
                        = new LineChart<String, Number>(xAxis, yAxis);

                lineChart.setTitle("Monitor de Ganancias");
                //defining a series
                XYChart.Series series = new XYChart.Series();
                series.setName("2018");
                series.getData().add(new XYChart.Data("Enero", 2300));
                series.getData().add(new XYChart.Data("Febrero", 1514));
                series.getData().add(new XYChart.Data("Marzo", 1500));
                series.getData().add(new XYChart.Data("Abril", 1324));
                series.getData().add(new XYChart.Data("Mayo", 2234));
                series.getData().add(new XYChart.Data("Junio", 3336));
                series.getData().add(new XYChart.Data("Julio", 1122));
                series.getData().add(new XYChart.Data("Agosto", 2345));
                series.getData().add(new XYChart.Data("Septiembre", 3243));
                series.getData().add(new XYChart.Data("Octubre", 917));
                series.getData().add(new XYChart.Data("Noviembre", 1129));
                series.getData().add(new XYChart.Data("Diciembre", 2225));

                XYChart.Series series1 = new XYChart.Series();
                series1.setName("2019");
                series1.getData().add(new XYChart.Data("Enero", 2223));
                series1.getData().add(new XYChart.Data("Febrero", 3514));
                series1.getData().add(new XYChart.Data("Marzo", 2215));
                series1.getData().add(new XYChart.Data("Abril", 3224));
                series1.getData().add(new XYChart.Data("Mayo", 1134));
                series1.getData().add(new XYChart.Data("Junio", 2336));
                series1.getData().add(new XYChart.Data("Julio", 3222));
                series1.getData().add(new XYChart.Data("Agosto", 2245));
                series1.getData().add(new XYChart.Data("Septiembre", 5043));
                series1.getData().add(new XYChart.Data("Octubre", 2217));
                series1.getData().add(new XYChart.Data("Noviembre", 3229));
                series1.getData().add(new XYChart.Data("Diciembre", 2325));

                Scene scene = new Scene(lineChart, jp.getWidth(), jp.getHeight());
                lineChart.getData().addAll(series, series1);
                scene.getStylesheets().add(getClass().getResource("/styles/stylesLlamadasTotalesGrupos.css").toExternalFo‌​rm());
                series.getNode().setStyle("-fx-stroke: yellow;");
                series1.getNode().setStyle("-fx-stroke: black;");

                initFX(fxPanel, scene);

            }
        });

    }

    public void CasosUltimoMes(int mes) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String complementTitle;
                final String title = "Casos del ultimo Mes";
                final CategoryAxis xAxis = new CategoryAxis();
                final NumberAxis yAxis = new NumberAxis();
                xAxis.setLabel("Abogados");
                yAxis.setLabel("Numero de casos");
                BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
                barChart.setTitle(title);
                Scene scene = new Scene(barChart, jp.getWidth(), jp.getHeight());
                XYChart.Series series1 = (XYChart.Series) casosUltimoMes();
                series1.setName("Casos");

                barChart.getData().add(series1);
                for (XYChart.Series<String, Number> series : barChart.getData()) {
                    for (XYChart.Data data2 : series.getData()) {
                        int r = (int) Math.floor(Math.random() * 255 + 1);
                        int g = (int) Math.floor(Math.random() * 255 + 1);
                        int b = (int) Math.floor(Math.random() * 255 + 1);
                        String rgb = r + "," + g + "," + b;
                        data2.getNode().setStyle("-fx-bar-fill: rgba(" + rgb + ",0.85" + ");");
                    }

                }
                initFX(fxPanel, scene);
            }
        });

    }
}
