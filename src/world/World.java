package world;

import java.util.List;
import java.util.LinkedList;

public class World {

    int counter = 0;
    boolean status = true;

    public Star[] stars = createStars(100);

    public Player player = new Player();

    public Maelstrom maelstrom = new Maelstrom(700,100,300,300);

    public Enemy enemy1 = new Enemy(100,-500,500,150);
    public Enemy enemy2 = new Enemy(300,1500,1000,100);
    public Enemy enemy3 = new Enemy(500,-2000,200,500);
    public Enemy enemy4 = new Enemy(1100,-200,150,100);
    public Enemy enemy5 = new Enemy(1400,1200,900,30);
    public Enemy enemy6 = new Enemy(200,-550,200,180);
    public List<Enemy> enemies = new LinkedList<>();

    public World() {
        enemies.add(enemy1);
        enemies.add(enemy2);
        enemies.add(enemy3);
        enemies.add(enemy4);
        enemies.add(enemy5);
        enemies.add(enemy6);
    }

    /**TIME UPDATE*/
    public void update(long deltaMillis){
        counter += deltaMillis;
        int newSpeed = 3 +(counter/20000);
        enemy1.setSpeed(newSpeed);
        maelstrom.setSpeed(newSpeed);
        for(Enemy enemy : enemies){
            enemy.move();
            if(enemy.findBoundsEnemy().intersects(player.findBoundsPlayer())){
                status = false;
            }
        }
        maelstrom.move();
        if(maelstrom.findBoundsMaelstrom().intersects(player.findBoundsPlayer())){
            status = false;
        }


    }

    public boolean isStatus() {
        return status;
    }

    public int getCounter() {
        return counter;
    }
    public void resetCounter(){
        counter = 0;
    }
    public void gameOver(){

    }

    public Star[] createStars(int number){

        Star[] stars1 = new Star[100];
        int x = 5;
        int y = 5;
        Star star;
        for (int i = 0; i < number; i++){

            star = new Star(x,y);
            stars1[i] = star;
            x += 100;
            for(int j = 0; j < 10; j++){
                y += 100;
            }

        }
        return stars1;
    }
}
