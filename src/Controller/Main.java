package Controller;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * Created by CHUMM on 14/02/2016.
 *
 * Temporarily creates program and temp gui
 * Will be fixed to implement MVC pattern
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Harvard Reference Generator");

        GridPane referenceData = new GridPane();

        referenceData.setAlignment(Pos.TOP_CENTER);
        referenceData.setHgap(10);
        referenceData.setVgap(10);
        referenceData.setPadding(new Insets(25, 25, 25, 25));

        //Combo box
        final ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll("Book","Online");
        comboBox.setValue("Book");
        //
        Scene scene = new Scene(referenceData, 500, 450);
        scene.getStylesheets().add("Controller/styles.css");

        Text sceneTitle = new Text("Harvard Reference Generator");
        sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        referenceData.add(sceneTitle, 0, 0, 2, 1);
        referenceData.add(comboBox,1,10);

        Label author = new Label("Author:");
        referenceData.add(author, 0, 4);
        final TextField authorField = new TextField();
        referenceData.add(authorField, 1, 4);


        Label publishedDate = new Label("Date Published:");
        referenceData.add(publishedDate, 0, 5);
        final TextField publishedDateLabel = new TextField();
        referenceData.add(publishedDateLabel, 1, 5);

        Label isbnNumber = new Label("ISBN:");
        referenceData.add(isbnNumber, 0, 6);
        final TextField isbnNumberLabel = new TextField();
        referenceData.add(isbnNumberLabel, 1, 6);

        Label publisherDetails = new Label("Publisher Details:");
        referenceData.add(publisherDetails, 0, 7);
        final TextField publisherDetailsLabel = new TextField();
        referenceData.add(publisherDetailsLabel, 1, 7);

        Label pageNumber = new Label("Page Number:");
        referenceData.add(pageNumber, 0, 8);
        final TextField pageNumberLabel = new TextField();
        referenceData.add(pageNumberLabel, 1, 8);


        final  Text taxMessage = new Text();
        referenceData.add(taxMessage, 1, 8);


        GridPane outputBox = new GridPane();


        referenceData.setAlignment(Pos.BASELINE_CENTER);
        referenceData.setHgap(10);
        referenceData.setVgap(10);
        referenceData.setPadding(new Insets(25, 25, 25, 25));


        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
