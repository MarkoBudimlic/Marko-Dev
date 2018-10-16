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
        }
        else if(event.getCode() == KeyCode.LEFT){
            /**MOVE LEFT*/
        }
    }

}
