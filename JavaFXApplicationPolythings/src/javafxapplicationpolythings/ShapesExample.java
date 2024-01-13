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
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapesExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(
                100.0, 100.0,
                150.0, 200.0,
                200.0, 100.0,
                250.0, 200.0,
                300.0, 100.0
        );
        polyline.setStroke(Color.BLACK);

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(
                100.0, 300.0,
                200.0, 400.0,
                300.0, 300.0
        );
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.LIGHTBLUE);

        Rectangle rectangle = new Rectangle(100, 500, 200, 100);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.LIGHTGREEN);

        Pane pane = new Pane(polyline, polygon, rectangle);
        Scene scene = new Scene(pane, 400, 600);

        primaryStage.setTitle("Shapes Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

