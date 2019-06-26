package contoller;

import javafx.fxml.FXML;

import java.io.IOException;

public class Login {

    @FXML private void adminLogin() throws IOException {
        Main.setRoot("Admin");
    }

    @FXML private void cashierLogin() throws IOException {
        Main.setRoot("Cashier");
    }
}