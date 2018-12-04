package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import world.Star;
import world.World;

public class Graphics {

    World world;
    GraphicsContext gc;
    Image playerModel = new Image("starship1.jpg");
    Image enemyModel1 = new Image("jupiter1.jpg");
    Image enemyModel2 = new Image("sunultra.png");
    Image enemyModel3 = new Image("ultron1.jpg");
    Image explosionModel = new Image("explosion.jpg");


    public Graphics(World world, GraphicsContext gc) {
        this.world = world;
        this.gc = gc;
    }


    /**DRAWS THE WORLD ON THE SCENE*/
    public void draw(){

        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,Main.screenX,Main.screenY);

        gc.setFill(Color.WHITE);
        for(Star star : world.stars){
            gc.fillOval(star.getPositionX(),star.getPositionY(),Star.getWidth(),Star.getHeight());
        }
        gc.setFill(Color.YELLOW);
        gc.setFont(Font.font(80));
        gc.fillText(world.getCounterString(),10,80);




        if(world.isStatus() == false){
            //GAME OVER SCREEN
            drawGameOver();
        }
        else if(world.isStatus() == true) {
                //DRAWS PLAYER OBJECT
                gc.drawImage(playerModel, world.player.getPositionX(), world.player.getPositionY());


            for (int i = 0; i < 9; i++) {
                //DRAWS ENEMY OBJECTS
                if(i < 3){
                    gc.drawImage(enemyModel1,world.enemies.get(i).getPositionX(), world.enemies.get(i).getPositionY(), world.enemies.get(i).getWidth(), world.enemies.get(i).getHeight());
                }else if(i == 3){
                    gc.drawImage(enemyModel2,world.enemies.get(i).getPositionX(), world.enemies.get(i).getPositionY(), world.enemies.get(i).getWidth(), world.enemies.get(i).getHeight());
                }else{
                    gc.drawImage(enemyModel3,world.enemies.get(i).getPositionX(), world.enemies.get(i).getPositionY(), world.enemies.get(i).getWidth(), world.enemies.get(i).getHeight());
                }

            }
            //DRAWS MAELSTROM
            gc.setFill(new RadialGradient(0, 0.1, 0.55, 0.45, 0.06, true,
                    CycleMethod.REFLECT,
                    new Stop(0.8, Color.BLACK),
                    new Stop(1, Color.AQUA)));
            gc.fillOval(world.maelstrom.getPositionX(),world.maelstrom.getPositionY(),world.maelstrom.getWidth(),world.maelstrom.getHeight());

        }



    }

    private void drawGameOver() {
        gc.drawImage(explosionModel, world.player.getPositionX()-100, world.player.getPositionY()-100, world.player.getWidth()+200,world.player.getHeight()+200);
        gc.setFill(Color.YELLOW);
        gc.drawImage(new Image("wtf.jpg"),350, 300);
        gc.setFont(Font.font(160));
        gc.fillText("GAME OVER", 350,200);
    }
}
