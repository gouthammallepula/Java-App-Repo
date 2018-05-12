package LoginApp;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {
    @FXML
    private AnchorPane anchor;
    public  void start(Stage stage) throws Exception {
       Parent root = (Parent) FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("School management System");
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
