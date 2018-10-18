package world;

import java.util.List;
import java.util.LinkedList;

public class World {

    int counter = 0;
    boolean status = true;

    public List<Star> stars = createStars(100);

    public Player player = new Player();

    public Maelstrom maelstrom = new Maelstrom(700,-1300,300,300);

    public Enemy enemy1 = new Enemy(100,-3200,300,260);
    public Enemy enemy2 = new Enemy(300,-2000,300,260);
    public Enemy enemy3 = new Enemy(700,-2400,300,260);
    public Enemy enemy4 = new Enemy(1100,-900,400,380);
    public Enemy enemy5 = new Enemy(1200,-2900,300,260);
    public Enemy enemy6 = new Enemy(200,-10,100,100);
    public Enemy enemy7 = new Enemy(80,-300,100,100);
    public Enemy enemy8 = new Enemy(80,-1700,100,100);
    public Enemy enemy9 = new Enemy(80,-1400,100,100);
    public List<Enemy> enemies = new LinkedList<>();

    public World() {
        enemies.add(enemy1);
        enemies.add(enemy2);
        enemies.add(enemy3);
        enemies.add(enemy4);
        enemies.add(enemy5);
        enemies.add(enemy6);
        enemies.add(enemy7);
        enemies.add(enemy8);
        enemies.add(enemy9);
    }

    /**TIME UPDATE*/
    public void update(long deltaMillis){
        counter += deltaMillis;
        int newSpeed = enemy1.getSpeed();
        if(getCounter()%20000 == 0){
            newSpeed += 2;
        }
        for(Enemy enemy : enemies){
            enemy.setSpeed(newSpeed);
        }
        maelstrom.setSpeed(newSpeed);
        for(Star star : stars){
            star.move();
        }
        for(Enemy enemy : enemies){
            enemy.move();
            if(enemy.findBoundsEnemy().intersects(player.findBoundsPlayer())){
                status = false;
            }
        }
        maelstrom.move();
        if(maelstrom.findBoundsMaelstrom().intersects(player.findBoundsPlayer())){
            player.changeDirection();
        }


    }

    public boolean isStatus() {
        return status;
    }

    public int getCounter() {
        return counter;
    }
    public String getCounterString(){
        String countString;
        if(status){
            countString = Integer.toString(getCounter());
        }
        else{
            countString = "GAME OVER";
        }
        return countString;
    }
    public void resetCounter(){
        counter = 0;
    }
    public void gameOver(){

    }

    public List<Star> createStars(int number){

        List<Star> randomList = new LinkedList<>();
        for(int i = 0; i < number; i ++){
            randomList.add(new Star((int)(Math.random()*1500+1),(int)(Math.random()*900+1)));
        }
        return randomList;
    }
}
