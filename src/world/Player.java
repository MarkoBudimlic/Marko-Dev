package world;

public class Player implements Object {

    int positionX = 710;
    int positionY = 780;


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
