package id.kcpindah.travel.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import id.kcpindah.travel.view.SuccessDialog;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

/**
 * Created by SpookyBastard on 6/1/2017.
 */

public class RegisterController {
    /* Class Attributes */
    @FXML
    private StackPane stackPane;

    @FXML
    private JFXTextField nameInput;

    @FXML
    private JFXTextField usernameInput;

    @FXML
    private JFXPasswordField passwordInput;

    @FXML
    private JFXTextField phoneInput;


    /**
     * Called to store new Account info.
     * */
    @FXML
    public void signUpNewAccount() {
        // Get Input
        String name     = nameInput.getText();
        String user     = usernameInput.getText();
        String password = passwordInput.getText();
        String phone    = phoneInput.getText();

        // TODO : Prevent User for inputting blank input
        // TODO : Validating Password
        // Password must be a combination pf number and character

        // TODO : Storing Data
        // Store input data to database

        // TODO : Show a success dialog
        // Make sure data has been stored
        SuccessDialog successDialog = new SuccessDialog();
        successDialog.showDialog(stackPane);
    }
}
