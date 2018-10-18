package world;

import java.awt.*;

public class Player implements Object {

    int positionX = 710;
    int positionY = 580;
    int width = 100;
    int height = 195;
    Rectangle boundsPlayer;
    boolean direction = false;

    /**FINDS THE BOUNDS FOR COLLISION DETECTION*/
    public Rectangle findBoundsPlayer() {
        this.boundsPlayer = new Rectangle(positionX,positionY,width,height);
        return boundsPlayer;
    }

    public boolean getDirection() {
        return direction;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void changeDirection(){
        this.direction = !direction;
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
