/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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
            double registrationfees = Double.parseDouble(RegistrationFeesField.getText());
            double lodginffees =Double.parseDouble(LodgingFeeField.getText());
             
            //used his own car
            if( miles > 0 ){
                txifees= 0;
                carfees=0 ;
            }else miles = 0 ;
            
          //total spent
            double total = (37 *days) 
                    + pkfees 
                    +txifees
                    +  (lodginffees * days) 
                    + (miles * 0.27) 
                    + airfare 
                    +carfees 
                    + registrationfees;
            
            //total allowes 
            double allowed = (37 *days)  //meals
                           +  airfare 
                           + carfees
                           + registrationfees
                           +(Math.min(pkfees, 10 * days))
                           +(Math.min(txifees, 20 * days))
                           +(Math.min(lodginffees, 95) * days)
                           +(miles * 0.27) ;
            
            String mssg = "Total is : " + total +" The total allowed : " + allowed ;
            if( total > allowed) {
                mssg+= "Youve exedeed the allowed total by : " + (total-allowed) ;
            } else {
                mssg+= "youve saved :" +(allowed - total) ;
            }
            label.setText(mssg);
        });
        
        
        //creating the display 
         
        VBox root = new VBox (8, 
         new Label("Days:"), DaysField,
         new Label("Airfare:") , AirfareField,
         new Label("Car rental:"),  CarFeesField,
         new Label("Miles driven:"),MilesField,
         new Label("Parking fees:"),  PkFeesField,
         new Label("Taxi fees:"),  TaxiFeesField,
         new Label("Registration fees:"),  RegistrationFeesField,    
         new Label("Lodging fees:"), LodgingFeeField,
         btn ,label  
            );
          Scene scene = new Scene(root,300,500);
          scene.getStylesheets().add("style.css");
          stage.setScene(scene);
          stage.setTitle("Travel expense calculator");
          stage.show();
        
        
        
        
    }
}

        
  
