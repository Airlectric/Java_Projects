/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticetut;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Airlectric
 */
public class Loan_Calculator extends Application {
    @Override
    public void start(Stage primaryStage){
        Label AIR =  new Label("Annual Interest Rate:");
        TextField AIRTextf = new TextField();
        
        Label numOfYears = new Label("Number of Years:");
        TextField numOfYearsTextf = new TextField();
        
        Label loanAmount = new Label("Loan Amount:");
        TextField loanAmountTextf = new TextField();
        
        Label monthlyPayment = new Label("Monthly Payment:");
        TextField MPTextf = new TextField();
        
        Label totalPayment = new Label("Total Payment:");
        TextField totalPaymentTextf = new TextField();
        
        Button clear = new Button("Clear");
        clear.setAlignment(Pos.CENTER_LEFT);
        Button calculate = new Button("Calculate");
        calculate.setAlignment(Pos.CENTER_RIGHT);
        
        GridPane bgrid = new GridPane();
        bgrid.setHgap(50);
        bgrid.add(clear,0,0);
        bgrid.add(calculate,1,0);
        
        HBox bPane = new HBox();
        bPane.getChildren().add(bgrid);
        
        
        GridPane Pane = new GridPane();
        Pane.setAlignment(Pos.CENTER);
        Pane.setPadding(new Insets(5,5,5,5));
        Pane.setVgap(5);
        Pane.setHgap(15);
        
        Pane.add(AIR,0,0);
        Pane.add(AIRTextf,1,0);
        Pane.add(numOfYears,0,1);
        Pane.add(numOfYearsTextf,1,1);
        Pane.add(loanAmount,0,2);
        Pane.add(loanAmountTextf,1,2);
        Pane.add(monthlyPayment,0,3);
        Pane.add(MPTextf,1,3);
        Pane.add(totalPayment,0,4);
        Pane.add(totalPaymentTextf,1,4);
        Pane.add(bPane,1,5);
        
        
        
        
        Scene sc = new Scene(Pane);
        
        primaryStage.setTitle("Loan Calculator");
        primaryStage.setScene(sc);
        primaryStage.setHeight(400);
        primaryStage.setWidth(400);
        primaryStage.show();
        
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
