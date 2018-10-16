package world;

public class World {

    int counter = 0;

    public Player player = new Player();


    public World() {
    }

    /**TIME UPDATE*/
    public void update(long deltaMillis){
        counter += deltaMillis;
    }

    public int getCounter() {
        return counter;
    }
    public void resetCounter(){
        counter = 0;
    }
}
