package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Home {

    @FXML
    private Button botonInfo;

    @FXML
    private Button botonMuestras;

    @FXML
    void Info(ActionEvent event) throws IOException {
            loadWindow("/view/InfoView.fxml", "informacion", event , 600, 790);
    }

    @FXML
    void Muestras(ActionEvent event) throws IOException {
            loadWindow("/view/MuestrasView.fxml", "Muestras", event,600,800 );
    }
private void loadWindow(String fxmlFile, String titel, ActionEvent event, int width, int higth) throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = new Stage();
        stage.setTitle(titel);
        stage.setScene(new Scene(root, width, higth));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
}
}
