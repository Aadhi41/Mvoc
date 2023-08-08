import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DataBindingExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Data Binding Example");

        // Create properties
        StringProperty inputProperty = new SimpleStringProperty();
        StringProperty outputProperty = new SimpleStringProperty();

        // Create UI components
        TextField inputField = new TextField();
        Label outputLabel = new Label();

        // Bind properties to UI components
        inputProperty.bind(inputField.textProperty());
        outputLabel.textProperty().bind(Bindings.concat("You entered: ", outputProperty));

        // Set up a listener to update the output property
        inputProperty.addListener((observable, oldValue, newValue) -> outputProperty.set(newValue));

        // Create a layout and set the scene
        VBox root = new VBox(10);
        root.getChildren().addAll(inputField, outputLabel);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
