package contoller;

import javafx.fxml.FXML;

import java.io.IOException;

public class Admin {

    @FXML private void logOut() throws IOException {
        Main.setRoot("Login");
    }
}