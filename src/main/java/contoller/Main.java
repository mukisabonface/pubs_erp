package contoller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Scene scene;

    /**
     * The main entry point for our application. This method is called after the init method has returned, and after the
     * system is ready for the application to begin running.
     *
     * <p> NOTE: This method is called on the JavaFX Application Thread. </p>
     *
     * @param primaryStage The primary stage for this application, onto which the application scene can be set. The
     *                     primary stage will be embedded in the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be primary stages and will
     *                     not be embedded in the browser.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        scene = new Scene(loadFXML("Login"));

        primaryStage.setTitle("Pubs ERP");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Sets the root {@code Node} of the scene graph. If a {@code Group} is used as the root, the contents of the scene
     * graph will be clipped by the scene's width and height and changes to the scene's size (if user resizes the stage)
     * will not alter the layout of the scene graph.
     * If a resizable node (layout {@code Region} or {@code Control}) is set as the root, then the root's size will
     * track the scene's size, causing the contents to be relayed out as necessary.
     *
     * <p> NOTE: Scene doesn't accept null root. </p>
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads an object hierarchy from an FXML document.
     *
     * @param fxml Name of the FXML document to load.
     * @return A {@link java.net.URL} object or {@code null} if no resource with this name is found
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}