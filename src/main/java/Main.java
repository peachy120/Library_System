import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage startingStage) {
        Controller controller = new Controller(startingStage);
        startingStage.setTitle("Library");
        startingStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
