package LoginApp;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModel loginModel = new LoginModel();

    @FXML
    private Label dbStatus;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private ComboBox<Option> combobox;

    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (this.loginModel.isDatabaseConnected()){
            this.dbStatus.setText("connected");
        }
        else{
            this.dbStatus.setText("Not Connected");
        }
        this.combobox.setItems(FXCollections.observableArrayList(Option.values()));

    }
}
