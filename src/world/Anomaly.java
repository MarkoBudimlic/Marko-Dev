package world;

import java.awt.geom.Ellipse2D;

public class Anomaly implements Object {
    private int speed;
    int positionX;
    int positionY;
    int width;
    int height;
    Ellipse2D.Double boundsAnomaly;

    public Anomaly(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    /**FINDS THE BOUNDS FOR COLLISION DETECTION*/
    public Ellipse2D.Double findBoundsAnomaly() {
        this.boundsAnomaly = new Ellipse2D.Double(positionX,positionY,width,height);
        return boundsAnomaly;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
            this.positionY = -2000;
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
