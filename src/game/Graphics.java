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
        gc.fillRect(710,780,40,40);

    }
}
