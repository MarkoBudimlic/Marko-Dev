package game;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import world.Player;
import world.World;


public class Main extends Application {

    public static final double screenX = 1500;
    public static final double screenY = 850;


    private Timer timer;


    @Override
    public void start(Stage primaryStage) throws Exception {


        Canvas canvas = new Canvas(screenX, screenY);
        Group group = new Group();
        group.getChildren().addAll(canvas);

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();

        World world = new World();
        Graphics graphics = new Graphics(world,canvas.getGraphicsContext2D());
        Timer timer = new Timer(world,graphics);
        InputHandler inputHandler = new InputHandler(world);

        timer.start();

        graphics.draw();




        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                inputHandler.onKeyPressed(event);
            }
        });


    }

}
