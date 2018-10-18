package game;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import world.World;

public class InputHandler {

    private World world;

    public InputHandler(World world) {
        this.world = world;
    }

    public void onKeyPressed(KeyEvent event){
        if(event.getCode() == KeyCode.RIGHT){
            /**MOVE RIGHT*/
            if(world.player.getDirection()) {
                if (world.player.getPositionX() < Main.screenX - 60) {
                    world.player.changeX(20);
                }
            }else{
                if (world.player.getPositionX() > 10) {
                    world.player.changeX(-20);
                }
            }
        }
        else if(event.getCode() == KeyCode.LEFT) {
            /**MOVE LEFT*/
            if (world.player.getDirection()) {
                if (world.player.getPositionX() > 10) {
                    world.player.changeX(-20);
                }
            } else {
                if (world.player.getPositionX() < Main.screenX - 60) {
                    world.player.changeX(20);
                }
            }
        }
        else if(event.getCode() == KeyCode.SPACE){
            world.player.changeDirection();
        }
    }

}
