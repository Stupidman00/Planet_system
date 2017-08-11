package gui;

import core.PlanetSystem;
import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Group root = new Group();
//        Scene scene = new Scene(root);
//
//        PlanetSystem system = buildPlanetSystem();
//        Group systemGroup = buildSystemGroup(system);
//
//        Slider sld = new Slider(0, 20, 1);
//        sld.setShowTickMarks(true);
//        sld.setShowTickLabels(true);
//        sld.setMajorTickUnit(4);
//        sld.setMinorTickCount(1);
//        sld.setBlockIncrement(1);
//
//        sld.valueProperty().addListener((observable, oldValue, newValue) ->
//                system.setStep(newValue.intValue()));
//
//        SubScene subScene = new SubScene(systemGroup, 500, 500);
//        systemGroup.setTranslateX(subScene.getWidth()/2);
//        systemGroup.setTranslateY(subScene.getHeight()/2);
//
//        VBox vBox1 = new VBox();
//        vBox1.getChildren().add(new Label("Change animation speed."));
//        vBox1.getChildren().add(sld);
//
//        VBox vBox2 = new VBox();
//        vBox2.getChildren().add(new Label("Jump on step."));
//        HBox hBox1 = new HBox(10);
//        Spinner<Integer> spinner = new Spinner<>(0, 10000,100);
//        Button button = new Button("Jump");
//        button.setOnAction(event -> {
//            system.setStep(spinner.getValue());
//            system.move();
//            system.setStep((int) sld.getValue());
//        });
//        hBox1.getChildren().add(spinner);
//        hBox1.getChildren().add(button);
//        vBox2.getChildren().add(hBox1);
//
//        VBox vb = new VBox(20);
//        vb.setPadding(new Insets(10,10,10,10));
//        vb.getChildren().add(vBox1);
//        vb.getChildren().add(vBox2);
//
//        GridPane gp = new GridPane();
//        gp.setPadding(new Insets(5,5,5,5));
//        gp.setGridLinesVisible(true);
//        gp.add(subScene,0,0);
//        gp.add(vb,1,0);
//        root.getChildren().add(gp);
//
//        AnimationTimer at = getAnimationTimer(system, systemGroup);
//
//        scene.setOnMousePressed(event -> {
//            if (event.isSecondaryButtonDown()) at.stop();
//            if (event.isPrimaryButtonDown()) at.start();
//        });
//
//        primaryStage.setTitle("Planet System");
//        primaryStage.setScene(scene);
//        primaryStage.setResizable(false);
//        primaryStage.show();
    }

    private AnimationTimer getAnimationTimer(PlanetSystem system,
                                             Group systemGroup) {
        AnimationTimer at = new AnimationTimer() {
            @Override
            public void handle(long now) {
//                movePlanets(system, systemGroup);
            }
        };
        at.start();
        return at;
    }

}
