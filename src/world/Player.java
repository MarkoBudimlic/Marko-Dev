package world;

import java.awt.*;

public class Player implements Object {

    int positionX = 710;
    int positionY = 780;
    int width = 50;
    int height = 50;
    Rectangle boundsPlayer;

    /**FINDS THE BOUNDS FOR COLLISION DETECTION*/
    public Rectangle findBoundsPlayer() {
        this.boundsPlayer = new Rectangle(positionX,positionY,width,height);
        return boundsPlayer;
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
