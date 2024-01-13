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
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class PolylineExample extends Application {

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

        Pane pane = new Pane(polyline);
        Scene scene = new Scene(pane, 400, 300);

        primaryStage.setTitle("Polyline Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

