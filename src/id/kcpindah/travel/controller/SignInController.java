package id.kcpindah.travel.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable{
    /* Class attributes */
    @FXML
    private JFXTextField usernameInput;

    @FXML
    private JFXPasswordField passwordInput;

    @FXML
    private JFXButton signInButton;

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void signIn() {
        String mockUser = "doublesinlove";
        String mockPass = "kiki810kiki";
        String username = usernameInput.getText();
        String password = passwordInput.getText();

        if (username.equals(mockUser) && password.equals(mockPass)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/MainForm.fxml"));
                Parent mainRoot = fxmlLoader.load();
                Stage mainStage = new Stage();
                mainStage.setScene(new Scene(mainRoot));
                mainStage.setTitle("Travel Ticketing");
                mainStage.show();
                signInButton.getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (!username.equals(mockUser) || !password.equals(mockPass)){
            System.out.println("Salah");
        }
    }

    @FXML
    public void signUp() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/RegisterForm.fxml"));
            Parent rootRegisterForm = fxmlLoader.load();
            Stage registerStage = new Stage();
            registerStage.setScene(new Scene(rootRegisterForm, 640, 480));
            registerStage.setTitle("Register Mock Account");
            registerStage.setResizable(false);
            registerStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
