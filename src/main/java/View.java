import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {
    private Stage stage;
    private Controller controller;

    Scene sceneWelcome, sceneLogin, sceneCreateAccount, sceneMain;

    public View(Stage stage, Controller controller) {
        this.stage = stage;
        this.controller = controller;
        createScene();
    }

    public void createScene() {
        sceneWelcome = createWelcomeScene();
        sceneLogin = createLoginScene();
        sceneCreateAccount = createCreateAccountScene();
        sceneMain = createMainScene();
    }

    public GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));

        return gridPane;
    }

    public Scene createWelcomeScene() {
        GridPane gridPane = createGridPane();

        return new Scene(gridPane, 800, 600);
    }

    public Scene createLoginScene() {
        GridPane gridPane = createGridPane();

        return new Scene(gridPane, 800, 600);
    }

    public Scene createCreateAccountScene() {
        GridPane gridPane = createGridPane();

        return new Scene(gridPane, 800, 600);
    }

    public Scene createMainScene() {

        GridPane gridPane = createGridPane();

        return new Scene(gridPane, 800, 600);
    }
}
