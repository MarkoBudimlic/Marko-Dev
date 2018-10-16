package world;

public class World {

    int counter = 0;





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
