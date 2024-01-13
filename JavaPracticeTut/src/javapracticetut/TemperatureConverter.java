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
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Airlectric
 */
public class TemperatureConverter extends Application {
    @Override
    public void start(Stage primaryStage){
        Label mainTitle = new Label("Fahenrient to Celcuis converter");
        
        Label fahenrientLabel = new Label("Fahenrient");
        TextField fahenrientTextF = new TextField();
        
        Label celcuisLabel = new Label("Celcius");
        TextField celciusTextF = new TextField();
        celciusTextF.setEditable(false);
        
        VBox fGroup = new VBox();
        VBox cGroup = new VBox();
        
        fGroup.setAlignment(Pos.CENTER_LEFT);
        cGroup.setAlignment(Pos.CENTER);
        fGroup.getChildren().addAll(fahenrientLabel,fahenrientTextF);
        cGroup.getChildren().addAll(celcuisLabel, celciusTextF);
        
        GridPane Tpane = new GridPane();
        Tpane.setAlignment(Pos.CENTER);
        Tpane.setPadding(new Insets(5,5,5,5));
        Tpane.setVgap(5);
        Tpane.setHgap(5);
        Tpane.add(fGroup, 0, 0);
        Tpane.add(cGroup, 1, 0);
        
        
        
        Button convertor = new Button("Convert");
        convertor.setOnAction(e-> {
            String fahenrientValue = fahenrientTextF.getText();
            System.out.println(fahenrientValue);
            Double fValue = Double.parseDouble(fahenrientValue);
            System.out.println(fValue);
            
            Double cValue = ((fValue - 32)* (5/9D));
            System.out.println(cValue);
            String celciusValue = Double.toString(cValue);
            System.out.println(celciusValue);
            celciusTextF.setText(celciusValue);
            
        });
                
        VBox mainPane = new VBox();
        mainPane.setAlignment(Pos.TOP_CENTER);
        mainPane.getChildren().addAll(mainTitle, Tpane, convertor);
        
        Scene sc = new Scene(mainPane,400,300);
        
        primaryStage.setTitle("Temperature Convertor");
        primaryStage.setScene(sc);
        primaryStage.show();
        
                
    }
    
    public static void main (String[] args){
        launch(args);
    }
    
}
