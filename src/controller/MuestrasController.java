package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MuestrasController {

    @FXML
    private Button Inicio;

    @FXML
    private Button VolverInformacion;

    @FXML
    private ImageView fsodhf;

    @FXML
    void Inicio(ActionEvent event) throws IOException {
    loadWindow("/view/HomeView.fxml", "Inicio", event, 917, 626);
    }

    @FXML
    void Vover(ActionEvent event) throws IOException {
        loadWindow("/view/InfoView.fxml", null, event, 600, 800);
    }
     private void loadWindow(String fxmlFile, String titel, ActionEvent event, int width, int higth) throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = new Stage();
        stage.setTitle(titel);
        stage.setScene(new Scene(root, width, higth));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();

}}