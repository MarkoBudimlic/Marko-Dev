package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import world.Star;
import world.World;

public class Graphics {

    World world;
    GraphicsContext gc;


    public Graphics(World world, GraphicsContext gc) {
        this.world = world;
        this.gc = gc;
    }


    public void draw(){
        /**DRAWS THE MODEL ON THE SCENE*/
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,Main.screenX,Main.screenY);

        gc.setFill(Color.WHITE);
        for(Star star : world.stars){
            gc.fillOval(star.getPositionX(),star.getPositionY(),Star.width,Star.height);
        }



        /**draws player object*/
        if(world.isStatus() == false){
            /**YAO MING*/
            gc.setFill(Color.RED);
            gc.drawImage(new Image("yao.jpg"),0, 0);
        }
        else if(world.isStatus() == true) {
            gc.drawImage(new Image("pirateship2.JPG"),world.player.getPositionX(),world.player.getPositionY());

            for (int i = 0; i < 6; i++) {
                if(i%2 == 0){
                    gc.setFill(Color.RED);
                }else if(i%3 == 0){
                    gc.setFill(Color.LIMEGREEN);
                }else{
                    gc.setFill(Color.PAPAYAWHIP);
                }
                gc.fillOval(world.enemies.get(i).getPositionX(), world.enemies.get(i).getPositionY(), world.enemies.get(i).getWidth(), world.enemies.get(i).getHeight());
            }
            gc.setFill(new RadialGradient(0, 0.1, 0.55, 0.45, 0.06, true,
                    CycleMethod.REFLECT,
                    new Stop(0.8, Color.BLACK),
                    new Stop(1, Color.AQUA)));
            gc.fillOval(world.maelstrom.getPositionX(),world.maelstrom.getPositionY(),world.maelstrom.getWidth(),world.maelstrom.getHeight());

        }



    }
}
