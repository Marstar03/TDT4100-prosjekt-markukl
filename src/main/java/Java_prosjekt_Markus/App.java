package Java_prosjekt_Markus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sudoku App");
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("SudokuApp.fxml"))));
        primaryStage.show();
    }

    public static void main(String[] args) {
        App.launch(args);
    }
}
