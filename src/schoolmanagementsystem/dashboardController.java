/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author vidsik
 */
public class dashboardController implements Initializable{
    
    @FXML
    private Button data;

    @FXML
    private Button edit;

    @FXML
    private Button home;

    @FXML
    private Button record;

    @FXML
    private Button student;

    @FXML
    private Label user;
    
    public void account(){
        user.setText(User.username);
    }
    
    public void navButton(){
        
        home.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5);"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
        });
        
        student.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5);"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
        });
        
        record.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5);"
                    + "-fx-border-width:0px 0px 0px 5px");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
        });
        
        data.setOnMouseClicked((MouseEvent event) ->{
            
            home.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            student.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            record.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.2), rgba(255, 106, 239, 0.2))");
            
            data.setStyle("-fx-background-color:linear-gradient(to bottom right,"
                    + " rgba(121, 172, 255, 0.6), rgba(255, 106, 239, 0.6));"
                    + "-fx-border-color:linear-gradient(to bottom, #517ab5, #ae44a5);"
                    + "-fx-border-width:0px 0px 0px 5px");
        });
        
    }
    
    public void initialize (URL url, ResourceBundle resource){
        account();
        navButton();
    }
}
