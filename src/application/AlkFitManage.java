package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AlkFitManage extends Application {

    private double x;
    private double y;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dritare.fxml"));
        Scene scene = new Scene(root);

        root.setOnMousePressed(this::handleMousePressed);
        root.setOnMouseDragged(event -> handleMouseDragged(stage, event));
        root.setOnMouseReleased(event -> handleMouseReleased(stage));

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    private void handleMousePressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }

    private void handleMouseDragged(Stage stage, MouseEvent event) {
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
        stage.setOpacity(0.8);
    }

    private void handleMouseReleased(Stage stage) {
        stage.setOpacity(1.0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}









//THANK YOU!!!


































