/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticetut;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;

/**
 *
 * @author Airlectric
 */
public class Trying_tc extends Application {
    @Override
    public void start(Stage primaryStage){
        Label mainLabel = new Label("Fahenrient to Celcuis Calculator");
        
        Label fLabel = new Label("Fahenrient");
        TextField fahenrient = new TextField();
        
        Label cLabel = new Label("Celcius");
        TextField celcius = new TextField();
        celcius.setEditable(false);
        
        Button bt1 = new Button("Convert");
        
        VBox fGroup = new VBox();
        VBox cGroup = new VBox();
        
        fGroup.setAlignment(Pos.CENTER_LEFT);
        cGroup.setAlignment(Pos.CENTER);
        
        fGroup.getChildren().addAll(fLabel,fahenrient);
        cGroup.getChildren().addAll(cLabel,celcius);
        
        
        GridPane tempPane = new GridPane();
        tempPane.setAlignment(Pos.CENTER);
        tempPane.setPadding(new Insets(5,5,5,5));
        tempPane.setVgap(5);
        tempPane.setHgap(5);
        tempPane.add(fGroup,0,0);
        tempPane.add(cGroup,1,0);
        
        VBox mainPane = new VBox();
        mainPane.setAlignment(Pos.TOP_CENTER);
        mainPane.getChildren().addAll(mainLabel,tempPane,bt1);
        
        bt1.setOnAction(e->{
            String Fahen = fahenrient.getText();
            Double fValue = Double.parseDouble(Fahen);
            System.out.println();
            
            Double cValue = ((fValue -32)* 5/9D);
            String Cel = Double.toString(cValue);
            System.out.println(Cel);
            celcius.setText(Cel);
        });
        
        Scene sc = new Scene(mainPane);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Temperature Converter");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
        
        
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
