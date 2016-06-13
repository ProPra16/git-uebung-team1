package de.hhu.propra16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
	@FXML
	private Button CloseButton;
	
    @FXML
    protected void handleCloseButton(ActionEvent event) {
    	Stage stage = (Stage) CloseButton.getScene().getWindow();
        stage.close();
    }
}
