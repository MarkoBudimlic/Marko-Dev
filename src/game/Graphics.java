package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
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
        gc.setFill(Color.DARKSLATEBLUE);
        gc.fillRect(0,0,Main.screenX,Main.screenY);



        /**draws player object*/
        if(world.isStatus() == false){
            /**YAO MING*/
            gc.setFill(Color.DARKBLUE);
            gc.drawImage(new Image("yao.jpg"),0, 0);
        }
        else if(world.isStatus() == true) {
            gc.setFill(Color.SANDYBROWN);
            gc.fillRect(world.player.getPositionX(), world.player.getPositionY(), world.player.getWidth(), world.player.getHeight());

            gc.setFill(Color.MEDIUMVIOLETRED);
            for (int i = 0; i < 5; i++) {
                gc.fillRect(world.enemies.get(i).getPositionX(), world.enemies.get(i).getPositionY(), world.enemies.get(i).getWidth(), world.enemies.get(i).getHeight());
            }
            gc.setFill(new RadialGradient(100, 10, world.blackHole.getPositionY(), world.blackHole.getPositionX(), 1, true,
                    CycleMethod.REFLECT,
                    new Stop(0.8, Color.BLACK),
                    new Stop(1, Color.LIGHTYELLOW)));
            gc.fillOval(world.blackHole.getPositionX(),world.blackHole.getPositionY(),world.blackHole.getWidth(),world.blackHole.getHeight());

        }



    }
}
