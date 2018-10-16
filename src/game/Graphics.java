package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
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
        gc.setFill(Color.MEDIUMAQUAMARINE);
        gc.fillRect(0,0,Main.screenX,Main.screenY);

        gc.setFill(Color.SANDYBROWN);
        /**draws player object*/
        gc.fillRect(world.player.getPositionX(),world.player.getPositionY(),world.player.getWidth(),world.player.getHeight());

        gc.setFill(Color.BLACK);
        int i = (int)(Math.random()*(5+1)+1);
        gc.fillRect(world.enemies.get(i).getPositionX(), world.enemies.get(i).getPositionY(), world.enemies.get(i).getWidth(), world.enemies.get(i).getHeight());


    }
}
