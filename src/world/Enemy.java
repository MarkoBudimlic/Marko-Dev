package world;



public class Enemy implements Object {


    public static int speed = 10;
    int positionX;
    int positionY;
    int width;
    int height;

    public Enemy(int positionX, int positionY, int width, int height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
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
        if(positionY > 2000){
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
