/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticetut;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Airlectric
 */
public class PracticeOne extends Application {
    @Override
    public void start(Stage primaryStage){
            Button bt1 = new Button("Click me");
            Button bt2 = new Button("Click me");
            Button bt3 = new Button("Click me");
            Button bt4 = new Button("Click me");
            Button bt5 = new Button("Click me");
            Button bt6 = new Button("Click me");
            Button bt7 = new Button("Click me");
            Button bt8 = new Button("Click me");
    
           GridPane hor = new GridPane();
    
           hor.add(bt1,0,0);
           hor.add(bt2,1,1);
           hor.add(bt3,2,2);
           hor.add(bt4,3,3);
           hor.add(bt5,4,4);
           hor.add(bt6,5,5);
           hor.add(bt7,7,7);
           hor.add(bt8,8,8);
           hor.setGridLinesVisible(true);
           hor.setHgap(20);
           hor.setVgap(20);
    
           Scene sc = new Scene(hor);
           
           primaryStage.setScene(sc);
           primaryStage.setTitle("Practice One");
           primaryStage.setHeight(500);
           primaryStage.setWidth(500);
           primaryStage.show();
    
    }

    public static void main(String[] args){
        launch(args);
    
    }
    
}
