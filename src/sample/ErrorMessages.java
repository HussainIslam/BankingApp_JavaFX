package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ErrorMessages implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event){
        VBox errorPane = new VBox();
        errorPane.setAlignment(Pos.CENTER);

        Label errorMessage = new Label("Your have an error!");
        Button btnOK = new Button("Ok");

        errorPane.getChildren().addAll(errorMessage, btnOK);

        Scene errorScene = new Scene(errorPane, 200, 200);
        Stage errorStage = new Stage();
        errorStage.setTitle("Error");
        errorStage.setScene(errorScene);
        errorStage.show();

    }
}
