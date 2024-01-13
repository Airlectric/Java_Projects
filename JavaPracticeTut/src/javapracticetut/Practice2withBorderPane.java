/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticetut;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;


/**
 *
 * @author Airlectric
 */
public class Practice2withBorderPane extends Application {
    @Override
    public void start(Stage primaryStage){
        Button bt1 = new Button("Click it");
        Button bt2 = new Button("Click it");
        Button bt3 = new Button("Click it");
        Button bt4 = new Button("Click it");
//        Button bt5 = new Button("Click it");
//        Button bt6 = new Button("Click it");
        
        BorderPane pane = new BorderPane();
        
        pane.setLeft(bt1);
        pane.setCenter(bt2);
        pane.setRight(bt3);
        pane.setBottom(bt4);
        
        Scene sc = new Scene(pane);
        
        primaryStage.setScene(sc);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.setTitle("Powwwww");
        primaryStage.show();
          
        
    }
    
    public static void main(String[] args){
            launch(args);
        }
    
}
