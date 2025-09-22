/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 6313901
 */
public class JavaApplication1 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        
        TextField DaysField = new TextField();
        TextField AirfareField = new TextField();
        TextField CarFeesField = new TextField();  
        TextField MilesField = new TextField();
        TextField PkFeesField = new TextField();
        TextField TaxiFeesField = new TextField();
        TextField RegistrationFeesField = new TextField();
        TextField LodgingFeeField = new TextField();
        
        Button btn = new Button("cALCULATE");
        Label label = new Label();
        
        btn.setOnAction(e-> {
            int days = Integer.parseInt(DaysField.getText());
            double airfare = Double.parseDouble(AirfareField.getText());
            double carfees = Double.parseDouble(CarFeesField.getText());
            double miles = Double.parseDouble(MilesField.getText());
            double pkfees = Double.parseDouble(PkFeesField.getText());
            double txifees = Double.parseDouble(TaxiFeesField.getText());
            double regisfees = Double.parseDouble(RegistrationFeesField.getText());
            double lodginffees =Double.parseDouble(LodgingFeeField.getText());
            
            
        }
               
        
        
        
}
}

