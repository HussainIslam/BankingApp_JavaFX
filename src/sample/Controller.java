package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField inputAccountNumber;

    @FXML
    private Button submitAccountNumber;

    @FXML
    public void onButtonClicked(ActionEvent e){
        System.out.println("Clicked");
    }
}
