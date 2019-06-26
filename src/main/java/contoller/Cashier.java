package contoller;

import javafx.fxml.FXML;

import java.io.IOException;

public class Cashier {

    @FXML private void logOut() throws IOException {
        Main.setRoot("Login");
    }
}