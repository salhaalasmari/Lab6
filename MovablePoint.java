public class MovablePoint implements Movable{
    protected int x;
    protected    int y;
    protected int xSpeed;
    protected    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("this move up"+(getxSpeed()+getySpeed()));
    }

    @Override
    public void moveDone() {
        System.out.println("this move down"+(getxSpeed()-getySpeed()));
    }

    @Override
    public void moveLeft() {
        System.out.println("this move left "+(getxSpeed()-getySpeed()));
    }

    @Override
    public void moveRight() {
        System.out.println("this move right"+(getxSpeed()+getySpeed()));
    }
}
