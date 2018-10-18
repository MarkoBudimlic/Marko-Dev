package world;


import java.awt.geom.Ellipse2D;

public class Maelstrom implements Object {

    private int speed;
    int positionX;
    int positionY;
    final int startingY = getPositionY() - 2000;
    int width;
    int height;
    Ellipse2D.Double boundsMaelstrom;

    public Maelstrom(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    /**FINDS THE BOUNDS FOR COLLISION DETECTION*/
    public Ellipse2D.Double findBoundsMaelstrom() {
        this.boundsMaelstrom = new Ellipse2D.Double(positionX-30,positionY-30,width-30,height-30);
        return boundsMaelstrom;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStartingY() {
        return startingY;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    /**MOVES THE ENEMY OBJECTS*/
    public void move(){
        changeY(speed);
        if(positionY > 1000){
            this.positionY = -3500;
        }
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }




    @Override
    public int changeX(int change) {
        this.positionX = this.positionX + change;
        return positionX;
    }

    @Override
    public int changeY(int change) {
        this.positionY = this.positionY + change;
        return positionY;
    }
}
