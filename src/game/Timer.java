package game;

import javafx.animation.AnimationTimer;
import world.World;


public class Timer extends AnimationTimer {

    private World world;
    private Graphics graphics;

    public long lastMillis = -1;


    public Timer(World world, Graphics graphics) {
        this.world = world;
        this.graphics = graphics;
    }

    public long getLastMillis() {
        return lastMillis;
    }

    @Override
    public void handle(long now) {
        /**GETS CALLED IN EVERY FRAME TO DRAW THE NEW WORLD*/
        long millis = now / 1000000;
        long deltaMillis = 0;

        if(lastMillis != -1){
            deltaMillis = millis - lastMillis;
        }
        this.world.update(deltaMillis);

        lastMillis = millis;

        graphics.draw();


    }
}
