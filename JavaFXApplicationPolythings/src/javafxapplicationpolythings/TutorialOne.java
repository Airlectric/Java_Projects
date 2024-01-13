/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationpolythings;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Airlectric
 */
public class TutorialOne extends Application {
    public static void main(String[] args){
        launch();
    }
    @Override
    public void start(Stage primaryStage){
        Button bt1 = new Button("Click me");
        
        HBox root = new HBox();
        
        root.getChildren().add(bt1);
        
        Scene sc = new Scene(root);
        
        
        primaryStage.setScene(sc);
        
        primaryStage.show();
        
    }
    
}
