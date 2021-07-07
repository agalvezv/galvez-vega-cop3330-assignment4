package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class List extends Application {

    //This class is no longer to be in use. Moved everything into interface.

    //This will be for the launching of the UI
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("List Operations");
        primaryStage.show();
    }
}
