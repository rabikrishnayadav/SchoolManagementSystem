/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 *
 * @author vidsik
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane login_form;
    
    @FXML
    private AnchorPane signup_form;
    
    @FXML
    private Hyperlink login_acc;

    @FXML
    private Button login_btn;

    @FXML
    private Label m;

    @FXML
    private Label m1;

    @FXML
    private PasswordField password;

    @FXML
    private Hyperlink create_acc;

    @FXML
    private Button signup_btn;

    @FXML
    private TextField su_email;

    @FXML
    private PasswordField su_password;

    @FXML
    private TextField su_username;

    @FXML
    private TextField username;
    
    public void exit(){
        
        System.exit(0);
        
    }
    
    public void textfieldDesign(){
        
        if(username.isFocused()){
            
            username.setStyle("-fx-background-color:#fff;"
                    + "-fx-border-width:2px");
            
            password.setStyle("-fx-background-color:transparent;"
                    + "-fx-border-width:1px");
            
        }else if(password.isFocused()){
            
            username.setStyle("-fx-background-color:transparent;"
                    + "-f-border-width:1px");
            
            password.setStyle("-fx-background-color:#fff;"
                    + "-fx-border-width:2px");
            
        }
        
    }
    
    public void textfieldDesign1(){
        
        if(su_username.isFocused()){
            
            su_username.setStyle("-fx-background-color:#fff;"
                    + "-fx-border-width:2px");
            
            su_password.setStyle("-fx-background-color:transparent;"
                    + "-fx-border-width:1px");
            
            su_email.setStyle("-fx-background-color:transparent;"
                    + "-fx-border-width:1px");
            
        }else if(su_email.isFocused()){
            
            su_username.setStyle("-fx-background-color:transparent;"
                    + "-fx-border-width:1px");
            
            su_password.setStyle("-fx-background-color:transparent;"
                    + "-fx-border-width:1px");
            
            su_email.setStyle("-fx-background-color:#fff;"
                    + "-fx-border-width:2px");
            
        }else if(su_password.isFocused()){
            
            su_username.setStyle("-fx-background-color:transparent;"
                    + "-fx-border-width:1px");
            
            su_password.setStyle("-fx-background-color:#fff;"
                    + "-fx-border-width:2px");
            
            su_email.setStyle("-fx-background-color:transparent;"
                    + "-fx-border-width:1px");
            
        }
        
    }
    
    public void dropShadowEffect(){
        
        DropShadow original = new DropShadow(30, Color.valueOf("#ae44a5"));
        
        original.setRadius(30);
        
        m.setEffect(original);
        
        m1.setEffect(original);
        
        m.setOnMouseEntered((MouseEvent event) ->{
            
            DropShadow shadow = new DropShadow(60, Color.valueOf("#e03ed5"));
            
            m.setCursor(Cursor.HAND);
            m.setStyle("-fx-text-fill:#ee5fe4");
            m.setEffect(shadow);
            
        });
        
        m.setOnMouseExited((MouseEvent event) ->{
            
            DropShadow shadow = new DropShadow(20, Color.valueOf("#ae44a5"));
            
            shadow.setRadius(30);
            
            m.setStyle("-fx-text-fill:#000");
            m.setEffect(shadow);
            
        });
        
        m1.setOnMouseEntered((MouseEvent event) ->{
            
            DropShadow shadow = new DropShadow(60, Color.valueOf("#e03ed5"));
            
            m1.setCursor(Cursor.HAND);
            m1.setStyle("-fx-text-fill:#ee5fe4");
            m1.setEffect(shadow);
            
        });
        
        m1.setOnMouseExited((MouseEvent event) ->{
            
            DropShadow shadow = new DropShadow(20, Color.valueOf("#ae44a5"));
            
            shadow.setRadius(30);
            
            m1.setStyle("-fx-text-fill:#000");
            m1.setEffect(shadow);
            
        });
    }
    
    public void changeForm(ActionEvent event){
        
        if(event.getSource() == create_acc){
            
            signup_form.setVisible(true);
            login_form.setVisible(false);
            
            su_username.setText("");
            su_password.setText("");
            su_email.setText("");
            
        }else if(event.getSource() == login_acc){
            
            login_form.setVisible(true);
            signup_form.setVisible(false);
            
            username.setText("");
            password.setText("");
            
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dropShadowEffect();
    }    
    
}
