import javafx.stage.Stage;

public class Controller {
    private Stage stage;
    private View view;

    public Controller(Stage stage) {
        this.stage = stage;
        this.view = new View(stage, this);
    }
}
