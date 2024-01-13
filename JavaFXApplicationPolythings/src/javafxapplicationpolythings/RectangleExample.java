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
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;


public class RectangleExample extends Application{
    @Override
    public void start (Stage primaryStage){
       Rectangle rectangle = new Rectangle(200,100,200,100);
       rectangle.setStroke(Color.BLACK);
       rectangle.setFill(Color.CORAL);
       
       Pane pane = new Pane(rectangle);
       
       Scene sc = new Scene(pane,500,500);
       
       primaryStage.setScene(sc);
       primaryStage.setTitle("Rectangle");
       primaryStage.show();
        
    }
    
    public static void main(String[] args){
        launch();
    }
}