package world;

public class Star implements Object{

    public static final int speedStars = 15;
    int positionX;
    int positionY;
    public static int width = 5;
    public static int height = 9;


    public Star(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    /**MOVES THE ENEMY OBJECTS*/
    public void move(){
        changeY(speedStars);
        if(positionY > 900){
            this.positionY = 0;
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
        this.positionX = positionX + change;
        return positionX;
    }

    @Override
    public int changeY(int change) {
        this.positionY = positionY + change;
        return positionY;
    }
}
