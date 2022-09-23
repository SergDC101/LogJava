package com.example.login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController3 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox check_box1;

    @FXML
    private CheckBox check_box2;

    @FXML
    private TextField country_field;

    @FXML
    private TextField lastname_field;

    @FXML
    private TextField login_field;

    @FXML
    private TextField name_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUp_btn;

    @FXML
    void initialize() {


        signUp_btn.setOnAction(event ->{
            
            signUpNewUser();

        });

    }

    private void signUpNewUser() {
        DataBaseHandler dbHandler = new DataBaseHandler();

        String firstName = name_field.getText();
        String lastName = lastname_field.getText();
        String login = login_field.getText();
        String password = password_field.getText();
        String location = country_field.getText();
        String gender = "";
        if (check_box1.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName,lastName,login,password,location,gender);

        dbHandler.signUpUser(user);
    }

}
