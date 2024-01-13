/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationpolythings;

/**
 *
 * @author Airlectric
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(
                100.0, 100.0,
                200.0, 200.0,
                300.0, 100.0
        );
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.LIGHTBLUE);

        Pane pane = new Pane(polygon);
        Scene scene = new Scene(pane, 400, 300);

        primaryStage.setTitle("Polygon Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

