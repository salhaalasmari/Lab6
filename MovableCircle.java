public class MovableCircle implements Movable{

    private  MovablePoint center ;
    private int redius ;

    public MovableCircle(int x , int y , int xSpeed , int ySpeed , int redius) {
      //  this.center = center;
       this.center = new MovablePoint( x ,  y ,  xSpeed ,  ySpeed );

        this.redius=redius;

    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }




    @Override
    public void moveUp() {

    }

    @Override
    public void moveDone() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
