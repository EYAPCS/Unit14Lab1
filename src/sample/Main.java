package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");

        GridPane rootNode = new GridPane();
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setPadding(new Insets(30));

        //primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.setScene(new Scene(rootNode, 350, 275));
        rootNode.add(new Label("Annual Interest Rate:"), 0,0);
        rootNode.add(new TextField(), 1,0);

        rootNode.add(new Label("Number of Years:"), 0,1);
        rootNode.add(new TextField(), 1,1);

        rootNode.add(new Label("Loan Amount:"), 0,2);
        rootNode.add(new TextField(), 1,2);

        rootNode.add(new Label("Monthly Payment:"), 0,3);
        rootNode.add(new TextField(), 1,3);

        rootNode.add(new Label("Total Payment:"), 0,4);
        rootNode.add(new TextField(), 1,4);

        Button calculate = new Button("Calculate");
        rootNode.setHalignment(calculate, HPos.RIGHT);
        rootNode.add(calculate, 1, 5);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}