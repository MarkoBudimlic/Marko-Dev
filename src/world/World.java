package world;

import java.util.List;
import java.util.LinkedList;

public class World {

    int counter = 0;
    boolean status = true;

    public Player player = new Player();

    public BlackHole blackHole = new BlackHole(700,100,300,300);

    public Enemy enemy1 = new Enemy(100,-500,500,150);
    public Enemy enemy2 = new Enemy(300,1500,1000,100);
    public Enemy enemy3 = new Enemy(500,-2000,200,500);
    public Enemy enemy4 = new Enemy(1100,-200,150,100);
    public Enemy enemy5 = new Enemy(1400,1200,900,30);
    public List<Enemy> enemies = new LinkedList<>();

    public World() {
        enemies.add(enemy1);
        enemies.add(enemy2);
        enemies.add(enemy3);
        enemies.add(enemy4);
        enemies.add(enemy5);
    }

    /**TIME UPDATE*/
    public void update(long deltaMillis){
        counter += deltaMillis;
        int newSpeed = (counter/20000)+3;
        enemy1.setSpeed(newSpeed);
        blackHole.setSpeed(newSpeed);
        for(Enemy enemy : enemies){
            enemy.move();
            if(player.findBoundsPlayer().intersects(enemy.findBoundsEnemy())){
                status = false;
            }
        }
//        blackHole.move();
        if(blackHole.findBoundsBlackHole().intersects(player.findBoundsPlayer())){
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
}
