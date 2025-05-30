import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/HomeView.fxml"));
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root, 917, 626));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}